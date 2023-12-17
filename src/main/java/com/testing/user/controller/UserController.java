package com.testing.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.user.entity.UsersEntity;
import com.testing.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/allUsers")
	public ResponseEntity<List<UsersEntity>> getAllUsers() {
		List<UsersEntity> user = userService.getAllUsers();
		return new ResponseEntity<List<UsersEntity>>(user, HttpStatus.OK);
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<UsersEntity> getById(@PathVariable("id") int id) {
		UsersEntity user = userService.getUserById(id);
		return new ResponseEntity<UsersEntity>(user, HttpStatus.OK);
	}

	@PostMapping("/addOrUpdate")
	public ResponseEntity<UsersEntity> addOrUpdate(@RequestBody UsersEntity users) {
		UsersEntity user = userService.addOrUpdateUser(users);
		return new ResponseEntity<UsersEntity>(user, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<UsersEntity> delete(@PathVariable("id") int id) throws Exception {
		UsersEntity user = userService.deleteUser(id);
		return new ResponseEntity<UsersEntity>(user, HttpStatus.OK);
	}
}
