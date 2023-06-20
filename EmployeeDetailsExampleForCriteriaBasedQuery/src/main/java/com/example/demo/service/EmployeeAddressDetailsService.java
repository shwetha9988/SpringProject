package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeeAddressDetails;

public interface EmployeeAddressDetailsService {
 EmployeeAddressDetails saveAddressDetails(EmployeeAddressDetails details);
 List<EmployeeAddressDetails> getAddressDetails();
}
