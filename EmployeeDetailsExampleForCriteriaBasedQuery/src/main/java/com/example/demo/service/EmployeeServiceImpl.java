package com.example.demo.service;

import java.util.List;




import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
@Transactional(readOnly=false)
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;
	@Autowired
	private EntityManager entityManager;
	

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub

		return dao.save(employee);
		
	
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Employee> findByfirstName(String firstName) {
		// TODO Auto-generated method stub
		
//			CriteriaBuilder cb=entityManager.getCriteriaBuilder();
//			CriteriaQuery cq=cb.createQuery();
//			Root<Employee> employee=cq.from(Employee.class);
//			Predicate firstNamePredicate=cb.equal(employee.get("firstName"),firstName);
//			cq.select(employee);
//			cq.where(firstNamePredicate);
//			TypedQuery<Employee> query=entityManager.createQuery(cq);
//		 query.getResultList();
			return dao.findByfirstName(firstName);
		
	}

	@Override
	@Async("asyncExecution")
	public void getEmployee() {
		// TODO Auto-generated method stub
		try {
			System.out.println("sleep method started");
			Thread.sleep(10000);
			System.out.println("sleep method Ended");
			List<Employee> response=dao.findAll();
			System.out.println(response);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
	
		
	}
	}
}
