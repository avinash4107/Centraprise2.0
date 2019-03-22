package com.centraprise.hrmodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_salory_info")
public class SaloryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int saloryInfoId;
	@Column(name = "basic_salory")
	private float basicSalory;
	@Column(name = "incentive")
	private float incentive;
	@Column(name = "special_allowance")
	private float specialAllowance;
	@Column(name = "special_payment")
	private float specialPayment;

	public int getSaloryInfoId() {
		return saloryInfoId;
	}

	public void setSaloryInfoId(int saloryInfoId) {
		this.saloryInfoId = saloryInfoId;
	}

	public float getBasicSalory() {
		return basicSalory;
	}

	public void setBasicSalory(float basicSalory) {
		this.basicSalory = basicSalory;
	}

	public float getIncentive() {
		return incentive;
	}

	public void setIncentive(float incentive) {
		this.incentive = incentive;
	}

	public float getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(float specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public float getSpecialPayment() {
		return specialPayment;
	}

	public void setSpecialPayment(float specialPayment) {
		this.specialPayment = specialPayment;
	}

	@Override
	public String toString() {
		return "SaloryInfo [saloryInfoId=" + saloryInfoId + ", basicSalory=" + basicSalory + ", incentive=" + incentive
				+ ", specialAllowance=" + specialAllowance + ", specialPayment=" + specialPayment + "]";
	}

}
