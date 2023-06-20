package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDepartmentDetailsDao;
import com.example.demo.model.EmployeeDepartmentDetails;

@Service
public class EmployeeDepartmentDetailsServiceImpl implements EmployeeDepartmentDetailsService {
	@Autowired
	EmployeeDepartmentDetailsDao dao;

	@Override
	public EmployeeDepartmentDetails saveDepartmentDetails(EmployeeDepartmentDetails details) {
		// TODO Auto-generated method stub
		return dao.save(details) ;
	}
	

}
