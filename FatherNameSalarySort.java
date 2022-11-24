package com.home.family.dto;

import javax.persistence.Column;

public class FatherNameSalarySort {

	@Column(name="father_name")
	private String fatherName;
	@Column(name = "salary")
	private String salary;
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
