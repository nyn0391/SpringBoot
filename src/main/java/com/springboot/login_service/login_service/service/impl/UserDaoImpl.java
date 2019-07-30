package com.springboot.login_service.login_service.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.springboot.login_service.login_service.entity.User;
import com.springboot.login_service.login_service.service.UserDAO;

@Repository
@Transactional
public class UserDaoImpl  implements UserDAO {

	private SessionFactory sessionFactory;
	// EntityManagerFactory emf=Persistence.createEntityManagerFactory("User");
	//

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@PersistenceContext
	private EntityManager entityManager;
	private List<User> userList = new ArrayList<>();

	@Override
	public String addUser(User user) {

		try {
			entityManager.persist(user);
			// em.persist(user);
			// this.sessionFactory.getCurrentSession().save(user);

			// entityManager.persist(user);
			return "saved";
		} catch (Exception e) {
			e.printStackTrace();
			return "not saved";
		}
	}

	@Override
	public User findById(int id) {
		Session session = this.sessionFactory.getCurrentSession();

		TypedQuery<User> query = session.getNamedQuery("findUserById");
		query.setParameter("id", id);
		User user = query.getSingleResult();
		return user;
	}

	@Override
	public List<User> findAllUser() {

		Session session = this.sessionFactory.getCurrentSession();
		TypedQuery<User> query = session.getNamedQuery("findAllUser");
		userList = query.getResultList();
		return userList;
	}
}
