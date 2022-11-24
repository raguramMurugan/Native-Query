package com.home.family.dto;

import javax.persistence.Column;

public class FatherSonDetailsByStatus {
	
	@Column(name="father_name")
	private String fatherName;
	@Column(name="name")
	private String name;
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
