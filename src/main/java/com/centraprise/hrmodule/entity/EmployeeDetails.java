package com.centraprise.hrmodule.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_number", unique = true)
	// @NotNull(message = "Employee Number should not be empty!")
	private int employeeNumber;
	@Column(name = "emp_name")
	// @NotNull(message = "Employee Name should not be empty!")
	private String employeeName;
	private String sex;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	@Column(name = "pan_number")
	private String panNumber;
	@Column(name = "marital_status")
	private String maritalStatus;
	@Column(name = "email_address", unique = true)
	private String emailAddress;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "password")
	private String password;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(unique = true)
	private EmployeeAddress address;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(unique = true)
	private AssignmentInformation assignmentInfo;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(unique = true)
	private BankInformation bankInfo;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(unique = true)
	private ProvidentFundInformation providentInfo;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	public AssignmentInformation getAssignmentInfo() {
		return assignmentInfo;
	}

	public void setAssignmentInfo(AssignmentInformation assignmentInfo) {
		this.assignmentInfo = assignmentInfo;
	}

	public BankInformation getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInformation bankInfo) {
		this.bankInfo = bankInfo;
	}

	public ProvidentFundInformation getProvidentInfo() {
		return providentInfo;
	}

	public void setProvidentInfo(ProvidentFundInformation providentInfo) {
		this.providentInfo = providentInfo;
	}

}
