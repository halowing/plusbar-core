package com.aircode.dtv.golf.plusbar.core.controller.advice;

import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.aircode.dtv.golf.plusbar.core.exception.DefaultApplicationException;
import com.aircode.dtv.golf.plusbar.core.exception.HttpConflictException;
import com.aircode.dtv.golf.plusbar.core.exception.HttpNotFoundException;
import com.halowing.spring.web.dto.response.DefaultResponse;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
	
	private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<DefaultResponse> constraintViolationExceptionHandler(ConstraintViolationException ex){
		log.error("ConstraintViolationException : {}",ex.getMessage());
		return getErrorResponseEntity(HttpStatus.BAD_REQUEST, ex.getMessage());
	}
	
	@ExceptionHandler(HttpNotFoundException.class)
	public ResponseEntity<DefaultResponse> httpNotFoundExceptionHandler(HttpNotFoundException ex){
		log.error("HttpNotFoundException : {}",ex.getMessage());
		return getErrorResponseEntity(ex.getStatus(), ex.getMessage());
	}
	
	@ExceptionHandler(HttpConflictException.class)
	public ResponseEntity<DefaultResponse> httpConflictExceptionHandler(HttpConflictException ex){
		log.error("HttpConflictException : {}",ex.getMessage());
		return getErrorResponseEntity(ex.getStatus(), ex.getMessage());
	}
	
	@ExceptionHandler(DefaultApplicationException.class)
	public ResponseEntity<DefaultResponse> defaultApplicationExceptionHandler(DefaultApplicationException ex){
		log.error("DefaultApplicationException : {}",ex.getMessage());
		return getErrorResponseEntity(ex.getStatus(), ex.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<DefaultResponse> othersExceptionHandler(Exception ex){
//		log.error("Exception : {}",ex.getMessage());
		ex.printStackTrace();
		return getErrorResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
	}
	
	private ResponseEntity<DefaultResponse> getErrorResponseEntity(HttpStatus status, String message){
		DefaultResponse error = new DefaultResponse(status, message);
		return new ResponseEntity<DefaultResponse>(error,status);
	}

}
