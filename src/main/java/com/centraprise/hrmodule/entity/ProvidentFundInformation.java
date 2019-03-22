package com.centraprise.hrmodule.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Provident_fund_details")
public class ProvidentFundInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "provident_fund_id")
	private int providentFundId;
	@Column(name = "uan_number")
	private String uanNumber;
	@Column(name = "adhar_number")
	private String adharNumber;
	@Column(name = "prevoius_employee")
	private String prevoiusEmployee;
	@Column(name = "date_of_leaving")
	private String dateOfLeaving;
	@Column(name = "start_date")
	private String startDate;
	@Column(name = "end_date")
	private String endDate;
	@OneToOne(mappedBy = "providentInfo", fetch = FetchType.EAGER)
	private EmployeeDetails employeeDetails;

	public int getProvidentFundId() {
		return providentFundId;
	}

	public void setProvidentFundId(int providentFundId) {
		this.providentFundId = providentFundId;
	}

	public String getUanNumber() {
		return uanNumber;
	}

	public void setUanNumber(String uanNumber) {
		this.uanNumber = uanNumber;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getPrevoiusEmployee() {
		return prevoiusEmployee;
	}

	public void setPrevoiusEmployee(String prevoiusEmployee) {
		this.prevoiusEmployee = prevoiusEmployee;
	}

	public String getDateOfLeaving() {
		return dateOfLeaving;
	}

	public void setDateOfLeaving(String dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

}
