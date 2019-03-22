package com.centraprise.hrmodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centraprise.hrmodule.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {

	EmployeeDetails findByEmpId(int employeenumber);

}
