package com.example.demo.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeAddressDetails;
import com.example.demo.model.EmployeeDepartmentDetails;

@DataJpaTest
public class EmployeeRepositoryTests {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	//Junit test for save employee operation
	@Test
	public void givenEmployeeObject_whenSave_thenReturnSavedEmployee() {

		

	
//		EmployeeAddressDetails address=new EmployeeAddressDetails();
//		address.setId(1L);
//		address.setHouseNumber("1234");
//		address.setZipCode(234);
//		address.setStreet("vv");
//		EmployeeDepartmentDetails departmentObj=new EmployeeDepartmentDetails();
//		departmentObj.setId(1L);
//		departmentObj.setDepartmentName("IS");
//		Employee emp =new Employee();
//		emp.setFirstName("shash");
//		emp.setLastName("sha");
//		emp.setEmail("Shash@gmail.com");
//		emp.setRole("admin");
//		emp.setAddress(address);
//		emp.setDepartment(departmentObj);
//		Employee savedEmployee=employeeDao.save(emp);
//	    Assertions.assertThat(savedEmployee).isNotNull();
//		Assertions.assertThat(savedEmployee.getId()).isGreaterThan(0);
	
	}
}
