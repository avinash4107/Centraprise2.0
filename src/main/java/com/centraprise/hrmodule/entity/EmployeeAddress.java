package com.centraprise.hrmodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_address")
public class EmployeeAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_addr_id")
	private int empAddressId;
	@Column(name = "flat_number")
	private String flatNumber;
	private String village;
	private String street;
	private String mandal;
	private String district;
	private String state;
	private int pincode;
	private String country;
	@OneToOne(mappedBy = "address",fetch=FetchType.EAGER)
	private EmployeeDetails employeeDetails;

	public int getEmpAddressId() {
		return empAddressId;
	}

	public void setEmpAddressId(int empAddressId) {
		this.empAddressId = empAddressId;
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

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [empAddressId=" + empAddressId + ", flatNumber=" + flatNumber + ", village=" + village
				+ ", street=" + street + ", mandal=" + mandal + ", district=" + district + ", state=" + state
				+ ", pincode=" + pincode + ", country=" + country + ", employeeDetails=" + employeeDetails + "]";
	}

}
