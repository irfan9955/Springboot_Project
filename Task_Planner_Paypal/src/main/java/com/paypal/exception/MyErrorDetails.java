package com.paypal.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorDetails {
	
	private LocalDateTime timeStamp;
	
	private String details;
	
	private String message;
	
	

}