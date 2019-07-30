package com.springboot.login_service.login_service.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="employee_Name")
	private String empName;
	@Column(name="employee_email")
	private String empEmail;
	public Employee() {
		super();
	}
	public Employee(String empName, String empEmail) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empEmail=" + empEmail + "]";
	}
	
}
