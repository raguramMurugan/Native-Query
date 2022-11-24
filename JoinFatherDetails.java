package com.home.family.dto;

import javax.persistence.Column;

public class JoinFatherDetails {

	@Column(name="father_name")
	private String fatherName;
	@Column(name="occupation")
	private String occupation;
	@Column(name="name")
	private String name;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JoinFatherDetails(String fatherName, String occupation, String name) {
		super();
		this.fatherName = fatherName;
		this.occupation = occupation;
		this.name = name;
	}
	public JoinFatherDetails() {
		super();
	}
	@Override
	public String toString() {
		return "JoinFatherDetails [fatherName=" + fatherName + ", occupation=" + occupation + ", name=" + name + "]";
	}
}
