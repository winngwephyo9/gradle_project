package com.testing.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class UsersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	@Column(name="user_name")
	private String userName;

	@Column(name="age")
	private int age;

	@Column(name="salary")
	private String Salary;

	public UsersEntity() {
		super();
	}

	public UsersEntity(int userId, String userName, int age, String salary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "UsersEntity [userId=" + userId + ", userName=" + userName + ", age=" + age + ", Salary=" + Salary + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

}
