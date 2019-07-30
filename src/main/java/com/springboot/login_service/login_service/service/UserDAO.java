package com.springboot.login_service.login_service.service;

import java.util.List;

import com.springboot.login_service.login_service.entity.User;

public interface UserDAO {
	User findById(int id);

	String addUser(User user);

	List<User> findAllUser();
}
