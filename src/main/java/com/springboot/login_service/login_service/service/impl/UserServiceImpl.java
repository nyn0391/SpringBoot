package com.springboot.login_service.login_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.login_service.login_service.entity.User;
import com.springboot.login_service.login_service.service.UserDAO;
import com.springboot.login_service.login_service.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	/*
	 * @Autowired public UserServiceImpl(UserDAO userDAO) { this.userDAO =
	 * userDAO; }
	 */

	@Override
	@Transactional
	public User findById(int id) {
		// TODO Auto-generated method stub
		return this.userDAO.findById(id);
	}

	@Override
	@Transactional
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return this.userDAO.addUser(user);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return this.userDAO.findAllUser();
	}
}
