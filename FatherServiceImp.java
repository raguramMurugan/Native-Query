package com.home.family.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.family.dto.FamilyDto;
import com.home.family.dto.FatherNameSalary;
import com.home.family.dto.JoinDataDetails;
import com.home.family.dto.JoinFatherDetails;
import com.home.family.entity.Father;
import com.home.family.entity.Mother;
import com.home.family.repository.FatherRepo;
import com.home.family.repository.MotherRepo;
import com.home.family.repository.SonOrDaughterRepo;

@Service
public class FatherServiceImp implements FatherService {

	@Autowired
	MotherRepo motherrepo;
	
	@Autowired
	FatherRepo fatherrepo;
	@Autowired
	SonOrDaughterRepo sonrepo;
	
	@Override
	public Mother getMotherDetails(Integer motherId) {
	
		Mother motherDataId=motherrepo.findById(motherId).get();
		motherrepo.save(motherDataId);
		return motherDataId;	
	}

	@Override
	public Father saveFamilyDetails(FamilyDto familydto) {
		Father father=new Father();
		father.setFatherName(familydto.getFatherName());
		father.setOccupation(familydto.getOccupation());
		father.setSalary(familydto.getSalary());
		father.setMother(motherrepo.findById(familydto.getMotherId()).get());
		father.setSonordaughter(familydto.getSonordaughter());
		
		return fatherrepo.save(father);
	}

	@Override
	public List<Father> getFamilyDetails() {
	
		return fatherrepo.findAll();
	}

	@Override
	public List<Father> getFamilyDetailsByMotherId(Integer motherId) {
		
		return fatherrepo.getFatherDetailsByMotherId(motherId);
	}

	

	

	@Override
	public Father getFathernameByMotherID(Integer motherId) {
		
		return fatherrepo.getFatherNameByMotherId(motherId);
	}

	

	@Override
	public List<Object> getFatherDetailsByJoin() {
		
		return fatherrepo.getFatherNameOccupationNByJoin();
	}

	@Override
	public List<JoinDataDetails> getFatherChildDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getFatherSalaryName() {
		
		return fatherrepo.findFatherNameSalaryByJoin();
	}

	@Override
	public List<Object> getFatherDetailsByMartialStatus(String maritalStatus) {
		
		return sonrepo.getDetailsOfFatherMother(maritalStatus);
	}

	@Override
	public List<Object> getSalaryFatherNameBySortedOrder() {
		
		return fatherrepo.sortSalaryAndName();
	}

	@Override
	public List<Object> sortPageFatherByValues(Integer pageNo, Integer pageSize) {
	
		return fatherrepo.pageSortValues(pageNo, pageSize);
	}

	

	

	

	

}
