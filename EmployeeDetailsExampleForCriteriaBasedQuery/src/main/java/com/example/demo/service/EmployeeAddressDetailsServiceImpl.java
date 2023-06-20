package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeAddressDetailsDao;
import com.example.demo.model.EmployeeAddressDetails;

@Service
public class EmployeeAddressDetailsServiceImpl implements EmployeeAddressDetailsService {
@Autowired
EmployeeAddressDetailsDao dao;

@Override
public EmployeeAddressDetails saveAddressDetails(EmployeeAddressDetails details) {
	// TODO Auto-generated method stub
	return dao.save(details);
}

@Override
public List<EmployeeAddressDetails> getAddressDetails() {
	// TODO Auto-generated method stub
	return dao.findAll();
}



}
