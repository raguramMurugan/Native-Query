package com.home.family.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.family.dto.FatherNameSingle;
import com.home.family.dto.FatherNameSalary;
import com.home.family.dto.JoinDataDetails;
import com.home.family.dto.JoinFatherDetails;
import com.home.family.entity.Father;

@Repository
public interface FatherRepo extends JpaRepository<Father, Integer>{

	@Query(nativeQuery=true,value="SELECT * FROM father WHERE mother_mother_id=?1")
	public List<Father> getFatherDetailsByMotherId(Integer motherId);
	
	@Query(nativeQuery=true,value="select father.father_name, son_or_daughter.name from father inner join son_or_daughter on father.father_id=sonordaughter_father_id")
	public List<Object> getFatherNameOccupationNByJoin();
	
	@Query("FROM Father WHERE occupation=?1")
	public List<Father> getFatherDetailsByOccupation(String occupation);
	
	@Query(nativeQuery=true,value="SELECT * FROM father WHERE mother_mother_id=?1")
	public Father getFatherNameByMotherId(Integer motherId);
	
	@Query(nativeQuery=true,value="SELECT father_name,salary FROM father")
	public List<Object> findFatherNameSalaryByJoin();
	
	@Query(nativeQuery=true,value="SELECT father_name,salary FROM father ORDER BY salary DESC")
	public List<Object> sortSalaryAndName();
	
	@Query(nativeQuery=true, value="SELECT * FROM father LIMIT ?1 OFFSET ?2")
	public List<Object> pageSortValues(Integer pageNo, Integer pageSize);
	

}
