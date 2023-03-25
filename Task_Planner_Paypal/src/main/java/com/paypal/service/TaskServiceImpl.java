package com.paypal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.exception.SprintException;
import com.paypal.exception.TaskException;
import com.paypal.exception.UserException;
import com.paypal.model.Sprint;
import com.paypal.model.Task;
import com.paypal.model.User;
import com.paypal.repository.SprintRepository;
import com.paypal.repository.TaskRepository;
import com.paypal.repository.UserRepository;

@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	private SprintRepository sprintRepo;
	@Autowired
	private TaskRepository taskRepo;
	@Autowired
	private UserRepository userRepo;

	@Override
	public Task addTask(Task task) throws TaskException {
		// TODO Auto-generated method stub
		
		if(task!=null)
		return taskRepo.save(task);
		else throw new TaskException("Please pass valid Task....");
//		return null;
	}

	@Override
	public Task updateTask(Task task) throws TaskException {
		// TODO Auto-generated method stub
		
		Optional<Task> temp =taskRepo.findById(task.getId());
		
		if(temp.isPresent())
			return taskRepo.save(task);
		else
			throw new TaskException("Task not Found....");
		
	}

	@Override
	public List<Task> getAllTaskBySprintId(Integer sprintId) throws SprintException, TaskException {
		// TODO Auto-generated method stub
		Optional<Sprint> opt = sprintRepo.findById(sprintId);
		
		if(opt.isPresent()) {
			List<Task> tasks=taskRepo.findBySprint(opt.get());
			
			if(tasks.size()>0) return tasks;
			else throw new TaskException("Task is Empty...");
		}
		else throw new SprintException("Sprint Not found....");
		
	}

	@Override
	public List<Task> getAllTaskByUser(Integer userId) throws UserException, TaskException {
		Optional<User> opt = userRepo.findById(userId);
		
		if(opt.isPresent()) {
			
			List<Task> tasks=taskRepo.findByAssignee(opt.get());
			
			if(tasks.size()>0) return tasks;
			else throw new TaskException("Task is Empty...");
			
		}
		else throw new UserException("User Not found....");
	}

}
