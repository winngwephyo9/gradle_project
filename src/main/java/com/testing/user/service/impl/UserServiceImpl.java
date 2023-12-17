package com.testing.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.user.entity.UsersEntity;
import com.testing.user.repository.UserRepository;
import com.testing.user.service.UserService;

import jakarta.persistence.Id;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UsersEntity> getAllUsers() {
		return (List<UsersEntity>) userRepository.findAll();
	}

	@Override
	public UsersEntity getUserById(int userId) {
		return userRepository.findById(userId).orElse(null);
	}

	@Override
	public UsersEntity addOrUpdateUser(UsersEntity user) {
		return userRepository.save(user);
	}

	@Override
	public UsersEntity deleteUser(int userId) throws Exception {
		UsersEntity deletedUser = null;
		try {
			deletedUser = userRepository.findById(userId).orElse(null);
			if (deletedUser == null) {
				throw new Exception("user not exit");
			} else {
				userRepository.deleteById(userId);
				;
			}

		} catch (Exception e) {
			throw e;
		}
		return deletedUser;
	}

}
