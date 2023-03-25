package com.paypal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.model.Sprint;


@Repository
public interface SprintRepository extends JpaRepository<Sprint, Integer>{
	
}
