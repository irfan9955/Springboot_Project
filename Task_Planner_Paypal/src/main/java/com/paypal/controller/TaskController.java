package com.paypal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.exception.SprintException;
import com.paypal.exception.TaskException;
import com.paypal.exception.UserException;
import com.paypal.model.Task;
import com.paypal.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	private TaskService taskSer;
	
	@PostMapping("/create")
	public ResponseEntity<Task> addTaskHandler(@RequestBody Task task) throws TaskException{
		 Task temp =taskSer.addTask(task);
		 
		 return new ResponseEntity<Task>(temp,HttpStatus.ACCEPTED);
		 
	}

	@PutMapping("/task/update")
	public ResponseEntity<Task> updateTaskHandler(@RequestBody Task task) throws TaskException{
		
		Task temp =taskSer.updateTask(task);
		
		return new ResponseEntity<Task>(temp,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/task/getbysprintId/{sprintId}")
	public ResponseEntity<List<Task>> getAllTaskBySprintIdHandler(@PathVariable Integer sprintId) throws TaskException, SprintException{
		
		List<Task> temp =taskSer.getAllTaskBySprintId(sprintId);
		
		return new ResponseEntity<List<Task>>(temp,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/task/getbyuserId/{userId}")
	public ResponseEntity<List<Task>> getAllTaskByUserIdHandler(@PathVariable Integer userId) throws TaskException, UserException{
		
		List<Task> temp =taskSer.getAllTaskByUser(userId);
		
		return new ResponseEntity<List<Task>>(temp,HttpStatus.ACCEPTED);
	}
}
