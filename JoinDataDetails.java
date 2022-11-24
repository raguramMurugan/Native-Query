package com.home.family.dto;

public class JoinDataDetails {

	private String fatherName;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public JoinDataDetails(String fatherName, String name, String address) {
		super();
		this.fatherName = fatherName;
		this.name = name;
		this.address = address;
	}
	public JoinDataDetails() {
		super();
	}
	
}
