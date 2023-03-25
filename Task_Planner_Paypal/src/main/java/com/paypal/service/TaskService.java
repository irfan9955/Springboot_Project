package com.paypal.service;

import java.util.List;

import com.paypal.exception.SprintException;
import com.paypal.exception.TaskException;
import com.paypal.exception.UserException;
import com.paypal.model.Task;

public interface TaskService {
	
	public Task addTask(Task task) throws TaskException;
	
	public Task updateTask(Task task) throws TaskException;
	
	public List<Task> getAllTaskBySprintId(Integer sprintId) throws SprintException,TaskException;
	
	public List<Task> getAllTaskByUser(Integer userId) throws UserException,TaskException;

}
