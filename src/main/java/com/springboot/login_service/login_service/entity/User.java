package com.springboot.login_service.login_service.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "User")
@NamedQueries({ @NamedQuery(name = "findUserById", query = "from User u where u.id = :id"),
		@NamedQuery(name = "findAllUser", query = "from User") })
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "USER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "USER_ROLE")
	private String role;
	@Column(name="USER_PASS")
	private String password;
	@Column(name="USER_EMAIL")
	private String userEmail;
	

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getRole() {
		return role;
	}

	public User(String userName, String role) {
		super();
		this.userName = userName;
		this.role = role;
	}

	public User() {
		super();
	}

}
