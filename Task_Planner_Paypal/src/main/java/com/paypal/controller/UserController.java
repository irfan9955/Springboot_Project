package com.paypal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.exception.UserException;
import com.paypal.model.User;
import com.paypal.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userSer;
	
	@PostMapping("/user/create")
	public ResponseEntity<User> createUserHandler(@RequestBody User user) throws UserException{
		
		User temp =userSer.createUser(user);
		
		return new ResponseEntity<User>(temp, HttpStatus.ACCEPTED);
		
	}
	
	

}
