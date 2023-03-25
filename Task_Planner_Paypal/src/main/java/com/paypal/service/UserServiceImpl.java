package com.paypal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.exception.UserException;
import com.paypal.model.User;
import com.paypal.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) throws UserException {
		// TODO Auto-generated method stub
		if(user!=null)
		return userRepo.save(user);
		else 
			throw new UserException("Please pass valid Details.");
	}

}
