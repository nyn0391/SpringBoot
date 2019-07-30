package com.springboot.login_service.login_service.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.login_service.login_service.entity.User;
import com.springboot.login_service.login_service.service.LoginService;

@Repository
public class LoginServiceImpl implements LoginService {
	/*
	 * private static Map<String, String> mapString=new HashMap<String,
	 * String>(); static{ mapString.put("Nayan", "kadam");
	 * mapString.put("Nayan1", "kadam1"); mapString.put("Nayan2", "kadam2");
	 * mapString.put("Nayan3", "kadam3"); mapString.put("Nayan4", "kadam4");
	 * mapString.put("Nayan5", "kadam5");
	 * 
	 * }
	 */
	@Autowired
	private EntityManager entityManager;

	/*
	 * public LoginServiceImpl(SessionFactory sessionFactory) { super();
	 * this.sessionFactory = sessionFactory; }
	 */
	@Override
	public Long getUser(String userName) {

		try {
			javax.persistence.Query query = entityManager.createQuery("select * from login_user");

			// query.setParameter("username", userName);
			return (Long) query.getSingleResult();

		} catch (NoResultException e) {
		}
		return 0L;
	}

	@Override
	public Map<String, String> listUser() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
