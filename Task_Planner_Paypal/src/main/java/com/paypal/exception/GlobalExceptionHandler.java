package com.paypal.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
//	@ExceptionHandler(UserLoginException.class)
//	public ResponseEntity<MyErrorDetails> UserLoginExceptionHandler(UserLoginException ue,WebRequest req){
//		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
//		
//		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
//	}
//	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> userExceptionHandler(UserException ue,WebRequest req){
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
//	
	@ExceptionHandler(SprintException.class)
	public ResponseEntity<MyErrorDetails> sprintExceptionHandler(SprintException ue,WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(TaskException.class)
	public ResponseEntity<MyErrorDetails> taskExceptionHandler(TaskException ue,WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> noHndlerExceptionHandler(NoHandlerFoundException ue,WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ue,WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<MyErrorDetails> IllegalExceptionHandler(IllegalArgumentException ue,WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> ExceptionHandler(Exception ue,WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	

}
