package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeMission;
import com.example.demo.service.EmployeeMissionServiceImpl;

@RestController
public class EmployeeMissionController {
	@Autowired
	EmployeeMissionServiceImpl service;
	@PostMapping
	EmployeeMission saveMission(@RequestBody EmployeeMission employee) {
		return service.saveMission(employee);
	}
}
