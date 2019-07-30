package com.springboot.login_service.login_service.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.login_service.login_service.jpa.entity.Employee;

@Repository
public class JPARepository {

	@PersistenceContext
	EntityManager entityManager;

	/*private EntityManagerFactory entityManagerFactory;*/

/*	@Autowired
	public JPARepository(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}*/
@Transactional
	public String savEmp(Employee emp) {
		try {
			entityManager.persist(emp);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("********************** exception ********************");
		}
		return "added";
	}
}
