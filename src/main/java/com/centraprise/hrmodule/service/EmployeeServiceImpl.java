package com.centraprise.hrmodule.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centraprise.hrmodule.entity.AssignmentInformation;
import com.centraprise.hrmodule.entity.BankInformation;
import com.centraprise.hrmodule.entity.EmployeeAddress;
import com.centraprise.hrmodule.entity.EmployeeDetails;
import com.centraprise.hrmodule.entity.ProvidentFundInformation;
import com.centraprise.hrmodule.exception.DatabaseException;
import com.centraprise.hrmodule.model.EmployeeCommand;
import com.centraprise.hrmodule.model.EmployeeInfoListDTO;
import com.centraprise.hrmodule.model.EmployeeListDTO;
import com.centraprise.hrmodule.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeListDTO> getEmployeesList() {
		List<EmployeeDetails> employeeDetails = null;
		List<EmployeeListDTO> employeeListDTOs = new ArrayList<EmployeeListDTO>();
		try {
			employeeDetails = employeeRepository.findAll();
			if (employeeListDTOs != null) {
				int i = 1;
				for (EmployeeDetails empDetais : employeeDetails) {
					EmployeeListDTO dto = new EmployeeListDTO();
					dto.setId(i++);
					dto.setPrimaryEmployeeId(empDetais.getEmpId());
					dto.setPanNumber(empDetais.getPanNumber());
					dto.setEmployeeId(empDetais.getEmployeeNumber());
					dto.setJoiningDate(empDetais.getAssignmentInfo().getDateOfJoining().toString());
					dto.setName(empDetais.getEmployeeName());
					employeeListDTOs.add(dto);
				}
			}
		} catch (Exception e) {
			throw new DatabaseException("Datebase is Down");
		}
		return employeeListDTOs;
	}

	@Override
	public void saveEmployee(EmployeeCommand employeeDetails) {
		try {
			EmployeeDetails empDetails = new EmployeeDetails();
			EmployeeAddress address = new EmployeeAddress();
			AssignmentInformation assignmentInfo = new AssignmentInformation();
			BankInformation bankInfo = new BankInformation();
			ProvidentFundInformation providentInfo = new ProvidentFundInformation();
			try {
				System.out.println("here ok");
				empDetails.setEmployeeNumber(employeeDetails.getEmployeenumber());
				empDetails.setEmployeeName(employeeDetails.getName());
				empDetails.setSex(employeeDetails.getGeder());
				empDetails.setDateOfBirth(employeeDetails.getBday());
				empDetails.setPanNumber(employeeDetails.getPan());
				empDetails.setMaritalStatus(employeeDetails.getMaritalstatus());
				empDetails.setEmailAddress(employeeDetails.getEmail());
				empDetails.setPhoneNumber(employeeDetails.getPhone());
				empDetails.setPassword(employeeDetails.getPassword());

				address.setFlatNumber(employeeDetails.getDoornum());
				address.setVillage(employeeDetails.getVlg());
				address.setMandal(employeeDetails.getMandal());
				address.setCountry(employeeDetails.getCountry());
				address.setState(employeeDetails.getState());
				address.setDistrict(employeeDetails.getDistrict());
				address.setPincode(employeeDetails.getPin());
				address.setEmployeeDetails(empDetails);
				empDetails.setAddress(address);

				assignmentInfo.setAssignmentEndDate(employeeDetails.getEndDate());
				assignmentInfo.setAssignmentStartDate(employeeDetails.getStartdate());
				assignmentInfo.setDateOfJoining(employeeDetails.getJoindate());
				assignmentInfo.setJob(employeeDetails.getJob());
				assignmentInfo.setManager(employeeDetails.getManager());
				assignmentInfo.setYearsOfService(employeeDetails.getService());
				assignmentInfo.setEmployeeDetails(empDetails);
				empDetails.setAssignmentInfo(assignmentInfo);

				bankInfo.setAccountNumber(employeeDetails.getAccountnumber());
				bankInfo.setBankName(employeeDetails.getBankname());
				bankInfo.setIfscCode(employeeDetails.getIfsc());
				bankInfo.setEmployeeDetails(empDetails);
				empDetails.setBankInfo(bankInfo);

				providentInfo.setUanNumber(employeeDetails.getUan());
				providentInfo.setAdharNumber(employeeDetails.getAdhar());
				providentInfo.setPrevoiusEmployee(employeeDetails.getPreviousemp());
				providentInfo.setDateOfLeaving(employeeDetails.getPreviousempleavingdate());
				providentInfo.setStartDate(employeeDetails.getPreviousempstartdate());
				providentInfo.setEndDate(employeeDetails.getPreviousempenddate());
				empDetails.setProvidentInfo(providentInfo);
				providentInfo.setEmployeeDetails(empDetails);
				employeeRepository.save(empDetails);
			} catch (Exception e) {
				throw new DatabaseException("Parsing exception miss match in data types");
			}

		} catch (DatabaseException e) {
			throw new DatabaseException("Datebase is Down");
		}
	}

	@Override
	public EmployeeInfoListDTO getEmployeeById(int employeenumber) {
		EmployeeDetails employeeDetails = null;
		EmployeeInfoListDTO dtos = new EmployeeInfoListDTO();
		try {
			employeeDetails = employeeRepository.findByEmpId(employeenumber);
			BeanUtils.copyProperties(employeeDetails, dtos);
			System.out.println(dtos);
		} catch (Exception e) {
			throw new DatabaseException("Datebase is Down");
		}
		return dtos;
	}

}
