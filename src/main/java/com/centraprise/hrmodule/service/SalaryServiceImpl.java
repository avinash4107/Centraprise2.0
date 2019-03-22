package com.centraprise.hrmodule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centraprise.hrmodule.entity.SaloryInfo;
import com.centraprise.hrmodule.model.SaloryCommand;
import com.centraprise.hrmodule.repository.SalaryRepository;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	private SalaryRepository saloryRepository;

	public void saveSaloryInfo(SaloryCommand saloryCommand) {

		try {
			SaloryInfo info = new SaloryInfo();
			info.setBasicSalory(saloryCommand.getBasic());
			info.setIncentive(saloryCommand.getIncentive());
			info.setSpecialAllowance(saloryCommand.getAllowance());
			info.setSpecialPayment(saloryCommand.getSpecialpayment());
			saloryRepository.save(info);
		} catch (Exception e) {

		}
	}
}
