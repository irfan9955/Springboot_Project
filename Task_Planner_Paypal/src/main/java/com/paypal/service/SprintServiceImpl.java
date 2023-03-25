package com.paypal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.exception.UserException;
import com.paypal.model.Sprint;
import com.paypal.repository.SprintRepository;

@Service
public class SprintServiceImpl implements SprintService{
	
	@Autowired
	private SprintRepository sprintRepo;
	

	@Override
	public Sprint createSprint(Sprint sprint) throws UserException {
		// TODO Auto-generated method stub
		
		if(sprint!=null)
			return sprintRepo.save(sprint);
			else 
				throw new UserException("Please pass valid Details.");
		
	}

}
