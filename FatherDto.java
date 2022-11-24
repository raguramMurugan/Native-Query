package com.home.family.dto;

import javax.persistence.Column;

public class FatherDto {
	
	@Column(name="father_id")
	private Integer fatherId;
	@Column(name="father_name")
	private String fatherName;
	@Column(name="occupation")
	private String occupation;
	@Column(name="salary")
	private String salary;
	public Integer getFatherId() {
		return fatherId;
	}
	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
