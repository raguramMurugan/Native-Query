package com.home.family.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mother {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer motherId;
	private String motherName;
	private String occupation;
	public Integer getMotherId() {
		return motherId;
	}
	public void setMotherId(Integer motherId) {
		this.motherId = motherId;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
