package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeDepartmentDetails;

@Repository
public interface EmployeeDepartmentDetailsDao extends JpaRepository<EmployeeDepartmentDetails,Long> {
	//EmployeeDepartmentDetails saveDepartment(EmployeeDepartmentDetails department);

}
