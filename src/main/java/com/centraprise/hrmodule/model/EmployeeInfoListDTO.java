package com.centraprise.hrmodule.model;


public class EmployeeInfoListDTO {

	private int empId;
	private int employeeNumber;
	private String employeeName;
	private String sex;
	private String dateOfBirth;
	private String panNumber;
	private String maritalStatus;
	private String emailAddress;
	private String phoneNumber;
	private String password;
	private String flatNumber;
	private String village;
	private String street;
	private String mandal;
	private String district;
	private String state;
	private int pincode;
	private String country;
	private String assignmentStartDate;
	private String assignmentEndDate;
	private String job;
	private String dateOfJoining;
	private float yearsOfService;
	private String manager;
	private String bankName;
	private String accountNumber;
	private String ifscCode;
	private String uanNumber;
	private String adharNumber;
	private String prevoiusEmployee;
	private String dateOfLeaving;
	private String startDate;
	private String endDate;

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

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public void setAssignmentStartDate(String assignmentStartDate) {
		this.assignmentStartDate = assignmentStartDate;
	}

	public String getAssignmentEndDate() {
		return assignmentEndDate;
	}

	public void setAssignmentEndDate(String assignmentEndDate) {
		this.assignmentEndDate = assignmentEndDate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public float getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(float yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
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

	@Override
	public String toString() {
		return "EmployeeInfoCommand [empId=" + empId + ", employeeNumber=" + employeeNumber + ", employeeName="
				+ employeeName + ", sex=" + sex + ", dateOfBirth=" + dateOfBirth + ", panNumber=" + panNumber
				+ ", maritalStatus=" + maritalStatus + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", flatNumber=" + flatNumber + ", village=" + village + ", street="
				+ street + ", mandal=" + mandal + ", district=" + district + ", state=" + state + ", pincode=" + pincode
				+ ", country=" + country + ", assignmentStartDate=" + assignmentStartDate + ", assignmentEndDate="
				+ assignmentEndDate + ", job=" + job + ", dateOfJoining=" + dateOfJoining + ", yearsOfService="
				+ yearsOfService + ", manager=" + manager + ", bankName=" + bankName + ", accountNumber="
				+ accountNumber + ", ifscCode=" + ifscCode + ", uanNumber=" + uanNumber + ", adharNumber=" + adharNumber
				+ ", prevoiusEmployee=" + prevoiusEmployee + ", dateOfLeaving=" + dateOfLeaving + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

}
