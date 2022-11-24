package com.home.family.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Father {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="father_id")
	private Integer fatherId;
	@Column(name="father_name")
	private String fatherName;
	@Column(name="occupation")
	private String occupation;
	@Column(name="salary")
	private String salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Mother mother;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
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

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public List<SonOrDaughter> getSonordaughter() {
		return sonordaughter;
	}

	public void setSonordaughter(List<SonOrDaughter> sonordaughter) {
		this.sonordaughter = sonordaughter;
	}
}
