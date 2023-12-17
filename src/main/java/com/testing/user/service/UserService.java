package com.testing.user.service;

import java.util.List;

import com.testing.user.entity.UsersEntity;

public interface UserService {

	public List<UsersEntity> getAllUsers();
	public UsersEntity getUserById(int userId);
	public UsersEntity addOrUpdateUser(UsersEntity user);
	public UsersEntity deleteUser(int userId) throws Exception;
}
