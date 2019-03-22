package com.centraprise.hrmodule.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.centraprise.hrmodule.entity.EmployeeDetails;
import com.centraprise.hrmodule.exception.CentrapriseException;
import com.centraprise.hrmodule.model.SaloryCommand;
import com.centraprise.hrmodule.model.SaloryInfoListDTO;
import com.centraprise.hrmodule.repository.EmployeeRepository;
import com.centraprise.hrmodule.service.SalaryService;

@Controller
public class SaveSalaryController {

	Map<String, Object> saloryInfo = null;

	@Autowired
	private SalaryService saloryService;

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/saveSaloryInfo")
	public String getSaloryPage(Model model) {
		model.addAttribute("salaryInfo", new SaloryCommand());
		try {
			List<EmployeeDetails> details = employeeRepository.findAll();
			if (details != null) {
				List<Integer> employeeNumbers = new ArrayList<>();
				for (EmployeeDetails det : details) {
					employeeNumbers.add(det.getEmployeeNumber());
				}
				model.addAttribute("employees", employeeNumbers);
			}
		} catch (Exception e) {
			throw new CentrapriseException("Database is down");
		}
		return "salarydetails";
	}

	@PostMapping("/saveSaloryInfo")
	public String saveSalory(@ModelAttribute("salaryInfo") SaloryCommand saloryCommand, Model model) {
		try {
			saloryService.saveSaloryInfo(saloryCommand);
			SaloryInfoListDTO saloryInfoListDTO = new SaloryInfoListDTO();

			float grossEarings = saloryCommand.getBasic() + saloryCommand.getAllowance()
					+ saloryCommand.getSpecialpayment() + saloryCommand.getIncentive();
			float providentFund = (saloryCommand.getBasic() / 100) * 12;
			float incomeTaxamount;
			float salory = saloryCommand.getBasic() + saloryCommand.getAllowance() + saloryCommand.getSpecialpayment();
			if (salory <= 250000) {
				incomeTaxamount = 0;
			} else if (salory <= 500000) {
				float sal = salory - 250000;
				incomeTaxamount = (sal / 100) * 5;
				System.out.println(incomeTaxamount);
			} else if (salory <= 1000000) {
				float sal = salory - 500000;
				incomeTaxamount = (sal / 100) * 20;
				incomeTaxamount = incomeTaxamount + (250000 / 100) * 5;
				System.out.println(incomeTaxamount);
			} else {
				float sal = salory - 1000000;
				incomeTaxamount = (sal / 100) * 30;
				incomeTaxamount = incomeTaxamount + (500000 / 100) * 20;
				incomeTaxamount = incomeTaxamount + (250000 / 100) * 5;
				System.out.println(incomeTaxamount);
			}
			saloryInfoListDTO.setId(1);
			saloryInfoListDTO.setEmployeeNumber(Integer.parseInt(saloryCommand.getEmployeenumber()));
			saloryInfoListDTO.setBasicSalaory(saloryCommand.getBasic());
			saloryInfoListDTO.setGrossEarings(grossEarings);
			saloryInfoListDTO.setIncentive(saloryCommand.getIncentive());
			saloryInfoListDTO.setSpecialAllowance(saloryCommand.getAllowance());
			saloryInfoListDTO.setSpecialPayment(saloryCommand.getSpecialpayment());
			saloryInfoListDTO.setProvidentFund(providentFund);
			saloryInfoListDTO.setProfessionalTax(100f);
			saloryInfoListDTO.setTotalDeductions(incomeTaxamount + 100f + providentFund);
			saloryInfoListDTO.setIncomeTax(incomeTaxamount);
			saloryInfoListDTO.setNetSalory(grossEarings - saloryInfoListDTO.getTotalDeductions());
			List<SaloryInfoListDTO> saloryInfoListDTOs = new ArrayList<SaloryInfoListDTO>();
			saloryInfoListDTOs.add(saloryInfoListDTO);
			model.addAttribute("saloryStructure", saloryInfoListDTOs);
			System.out.println(saloryInfoListDTOs);
			System.out.println("ok");
			saloryInfo = new HashMap<>();
			saloryInfo.put("saloryinfo", saloryInfoListDTOs);
			return "redirect:/salarystructure";
		} catch (Exception e) {
			return "";
		}
	}

	@GetMapping("/salarystructure")
	public String saloryInfo(Model model) {
		model.addAttribute("saloryStructure", saloryInfo.get("saloryinfo"));
		return "salarystructure";
	}
}
