package com.springboot.login_service.login_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.login_service.login_service.entity.User;
import com.springboot.login_service.login_service.service.UserService;
import com.springboot.login_service.login_service.service.impl.UserDaoImpl;

@RestController// 
//@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	private UserService userService;
	private List<User> userList = new ArrayList<>();

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String createUser(@RequestBody User user) {
		try {
			System.out.println("createUser****" + user.getUserName());
			userService.addUser(user);
			return "added succufully";
		} catch (Exception e) {
			e.printStackTrace();
			return "not added successfully";
		}
	}

	@RequestMapping(value = "/getuser/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable int id) {
		User user = userService.findById(id);

		return user;
	}

	@RequestMapping(value = "/getAlluser", method = RequestMethod.GET,produces={MediaType.APPLICATION_JSON_UTF8_VALUE})
	//@ResponseBody
	public List<User> getUserAll() {

		userList = userService.findAllUser();

		return userList;
	}
}
