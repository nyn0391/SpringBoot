package com.springboot.login_service.login_service.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.login_service.login_service.jpa.entity.Employee;
import com.springboot.login_service.login_service.jpa.repository.JPARepository;

@RestController
@RequestMapping("/jpa")
public class JpaController {
	
	@Autowired
	JPARepository jpaRepository;
	@RequestMapping(value="/saveEmp",method=RequestMethod.POST)	
	public Employee saveEmployee(@RequestBody Employee employee){
	jpaRepository.savEmp(employee);
	System.out.println(employee.getId());
	System.out.println(employee.getEmpName());
	System.out.println(employee.getEmpEmail());
	
		return employee;
	}
}
