package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public class EmployeeCustomDaoImpl implements EmployeeCustomDao {

	@Autowired
	private EntityManager entity;
	
	@Override
	public List<Employee> findByfirstName(String firstname) {
		// TODO Auto-generated method stub
		CriteriaBuilder cb=entity.getCriteriaBuilder();
		CriteriaQuery cq=cb.createQuery();
		Root<Employee> employee=cq.from(Employee.class);
		Predicate firstNamePredicate=cb.equal(employee.get("firstname"),firstname);
		cq.where(firstNamePredicate);
		TypedQuery<Employee> query=entity.createQuery(cq);
		
		return query.getResultList();
	}

}
