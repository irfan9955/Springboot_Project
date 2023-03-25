package com.paypal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.exception.SprintException;
import com.paypal.exception.UserException;
import com.paypal.model.Sprint;
import com.paypal.service.SprintService;

@RestController
public class SprintController {
	
	@Autowired
	private SprintService sprintSer;
	
	@PostMapping("/sprint/create")
	public ResponseEntity<Sprint> createSprintHandler(@RequestBody Sprint sprint) throws SprintException, UserException{
		
		Sprint temp =sprintSer.createSprint(sprint);
		
		
		return new ResponseEntity<Sprint>(temp,HttpStatus.ACCEPTED);
	}

}
