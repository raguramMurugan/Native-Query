package com.home.family.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.home.family.dto.FamilyDto;
import com.home.family.dto.FatherNameSalary;
import com.home.family.dto.JoinDataDetails;
import com.home.family.dto.JoinFatherDetails;
import com.home.family.entity.Father;
import com.home.family.entity.Mother;

@Service
public interface FatherService {

	public Mother getMotherDetails(Integer motherId);

	public Father saveFamilyDetails(FamilyDto familydto);

	public List<Father> getFamilyDetails();

	public List<Father> getFamilyDetailsByMotherId(Integer motherId);

	public List<JoinDataDetails> getFatherChildDetails();

	public Father getFathernameByMotherID(Integer motherId);

	public List<Object> getFatherDetailsByJoin();

	public List<Object> getFatherSalaryName();

	public List<Object> getFatherDetailsByMartialStatus(String maritalStatus);

	public List<Object> getSalaryFatherNameBySortedOrder();

	public List<Object> sortPageFatherByValues(Integer pageNo, Integer pageSize);

	

	

	

}
