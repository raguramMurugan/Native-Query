package com.home.family.dto;

import javax.persistence.Column;

public class FatherNameSalary {

	@Column(name="father_name")
	private String fatherName;
	@Column(name="salary")
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
	public FatherNameSalary(String fatherName, String salary) {
		super();
		this.fatherName = fatherName;
		this.salary = salary;
	}
	public FatherNameSalary() {
		super();
	}
	@Override
	public String toString() {
		return "FatherNameSalary [fatherName=" + fatherName + ", salary=" + salary + "]";
	}
}
