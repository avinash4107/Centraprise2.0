package com.centraprise.hrmodule.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.centraprise.hrmodule.entity.EmployeeDetails;

@Entity
@Table(name = "Bank_details")
public class BankInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bank_info_id")
	private int bankInfoId;
	@Column(name = "bank_name")
	private String bankName;
	@Column(name = "account_number")
	private String accountNumber;
	@Column(name = "ifsc_code")
	private String ifscCode;
	@OneToOne(mappedBy = "bankInfo", fetch = FetchType.EAGER)
	private EmployeeDetails employeeDetails;

	public int getBankInfoId() {
		return bankInfoId;
	}

	public void setBankInfoId(int bankInfoId) {
		this.bankInfoId = bankInfoId;
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

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Override
	public String toString() {
		return "BankInformation [bankInfoId=" + bankInfoId + ", bankName=" + bankName + ", accountNumber="
				+ accountNumber + ", ifscCode=" + ifscCode + ", employeeDetails=" + employeeDetails + "]";
	}

}
