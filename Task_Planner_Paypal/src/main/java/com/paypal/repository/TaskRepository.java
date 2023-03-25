package com.paypal.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.model.Sprint;
import com.paypal.model.Task;
import com.paypal.model.User;


@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	
	public List<Task> findBySprint(Sprint sprint);
	
	public List<Task> findByAssignee(User user);
	 
}
