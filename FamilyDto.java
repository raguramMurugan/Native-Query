package com.home.family.dto;

import java.util.List;

import com.home.family.entity.SonOrDaughter;

public class FamilyDto {

	private Integer fatherId;
	private String fatherName;
	private String occupation;
	private String salary;
	private Integer motherId;
	private List<SonOrDaughter> sonordaughter;
	
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
	public Integer getMotherId() {
		return motherId;
	}
	public void setMotherId(Integer motherId) {
		this.motherId = motherId;
	}
	public List<SonOrDaughter> getSonordaughter() {
		return sonordaughter;
	}
	public void setSonordaughter(List<SonOrDaughter> sonordaughter) {
		this.sonordaughter = sonordaughter;
	}
	
}
