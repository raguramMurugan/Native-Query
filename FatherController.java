package com.home.family.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.family.dto.FamilyDto;
import com.home.family.dto.FatherNameSalary;
import com.home.family.dto.JoinDataDetails;
import com.home.family.dto.JoinFatherDetails;
import com.home.family.entity.Father;
import com.home.family.entity.Mother;
import com.home.family.service.FatherService;

@RestController
public class FatherController {

	@Autowired
	private FatherService service;
	
	@GetMapping("/MotherId")
	public Mother getMotherDetails(FamilyDto familydto)
	{
		return service.getMotherDetails(familydto.getMotherId());	
	}
	
	@PostMapping("/saveFamilyDetails")
	public Father saveFamilyDetails(@RequestBody FamilyDto familydto)
	{
		return service.saveFamilyDetails(familydto);
		
	}
	@GetMapping("/getFamilyDetails")
	public List<Father> getFamilyDetails()
	{
		return service.getFamilyDetails();
	}
	
	@GetMapping("/getFatherDetails/{motherId}")
	public List<Father> getFamilyDetailsByMotherId(@PathVariable Integer motherId)
	{
		return service.getFamilyDetailsByMotherId(motherId);
	}
	
	@GetMapping("/getFatherChildDetails")
	public List<JoinDataDetails> getFatherChildDetails()
	{
		return service.getFatherChildDetails();
	}
	
	@GetMapping("/getFathernameByMotherId/{motherId}")
	public Father getFathernameByMotherID(@PathVariable Integer motherId)
	{
		return service.getFathernameByMotherID(motherId);
	}
	
	@GetMapping("/getFatherdetailsByJoin")
	public List<Object> getFatherDetailsByJoin()
	{
		return service.getFatherDetailsByJoin();
		
	}
	@GetMapping("/getFatherNameSalary")
	public List<Object> getFatherSalaryName()
	{
		return service.getFatherSalaryName();
	}
	
	@GetMapping("/getFatherDetailsByMartialStatus/{maritalStatus}")
	public List<Object> getFatherDetailsByMartialStatus(@PathVariable String maritalStatus)
	{
		return service.getFatherDetailsByMartialStatus(maritalStatus);
	}
	
	@GetMapping("/getSalaryFatherNameBySortedOrder")
	public List<Object> getSalaryFatherNameBySortedOrder()
	{
		return service.getSalaryFatherNameBySortedOrder();
		
	}
	
	@GetMapping("/sortpage/{pageNo}/{pageSize}")
	public List<Object> sortPageFatherByValues(@PathVariable Integer pageNo, @PathVariable Integer pageSize)
	{
		return service.sortPageFatherByValues(pageNo,pageSize);
	}
	

}
