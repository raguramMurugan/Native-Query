package com.home.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.family.entity.Mother;
@Repository
public interface MotherRepo extends JpaRepository<Mother, Integer>{

}
