package com.home.family.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.home.family.dto.FatherNameSingle;
import com.home.family.dto.JoinDataDetails;
import com.home.family.entity.SonOrDaughter;

public interface SonOrDaughterRepo extends JpaRepository<SonOrDaughter, Integer>{
	
	
	@Query(nativeQuery=true,value="SELECT father.father_name,son_or_daughter.name,son_or_daughter.occupation FROM father INNER JOIN son_or_daughter on father.father_id=sonordaughter_father_id WHERE marital_status=?1")
	public List<Object> getDetailsOfFatherMother(String marital_status);
	
}
