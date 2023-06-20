package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeMission;

@Repository
public interface EmployeeMissionDao extends JpaRepository<EmployeeMission,Long> {
	//EmployeeMission saveMission(EmployeeMission mission);
}
