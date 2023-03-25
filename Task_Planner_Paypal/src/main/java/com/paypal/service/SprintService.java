package com.paypal.service;

import com.paypal.exception.UserException;
import com.paypal.model.Sprint;

public interface SprintService {

	public Sprint createSprint(Sprint sprint) throws UserException;
	
}
