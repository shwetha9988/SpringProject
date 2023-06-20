package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeMissionDao;
import com.example.demo.model.EmployeeMission;

@Service
public class EmployeeMissionServiceImpl implements EmployeeMissionService {
	@Autowired
	EmployeeMissionDao dao;

	@Override
	public EmployeeMission saveMission(EmployeeMission mission) {
		// TODO Auto-generated method stub
		return dao.save(mission) ;
	}

}
