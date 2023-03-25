package com.paypal.service;

import com.paypal.exception.UserException;
import com.paypal.model.User;

public interface UserService {
	
	public User createUser(User user) throws UserException;
	
	

}
