package com.springboot.login_service.login_service.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springboot.login_service.login_service.entity.User;
@Service
public interface LoginService {
	public Long getUser(String userName);
	public Map<String,String> listUser();
	public User updateUser(User user);

}
