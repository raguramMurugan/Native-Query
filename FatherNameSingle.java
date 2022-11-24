package com.home.family.dto;

import javax.persistence.Column;

public class FatherNameSingle {

	@Column(name="father_name")
	private String father_name;
	@Column(name="name")
	private String name;
	@Column(name="occupation")
	private String occupation;
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
}
