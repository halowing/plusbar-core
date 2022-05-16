package com.aircode.dtv.golf.plusbar.core.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.halowing.spring.web.dto.response.DefaultResponse;
import com.halowing.util.StringUtility;

@RestController
public class ErrorController extends AbstractErrorController {
	
	public ErrorController(ErrorAttributes errorAttributes) {
		super(errorAttributes);
	}

	private static final Logger log = LoggerFactory.getLogger(ErrorController.class);

	@RequestMapping("/error")
	public ResponseEntity<DefaultResponse> error(HttpServletRequest request){
		
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		Object exception = request.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
		
		HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		String message = null;
		
		if(exception != null && exception instanceof HttpClientErrorException) {
			HttpClientErrorException ex = (HttpClientErrorException) exception;
			httpStatus = ex.getStatusCode();
			message = ex.getMessage();
			log.debug("statusCode = {}, message = {}",httpStatus.value(), message);
		}else if(status != null) {
			int statusCode = Integer.valueOf(status.toString());
			httpStatus = HttpStatus.valueOf(statusCode);
			message = (String) request.getAttribute(RequestDispatcher.ERROR_MESSAGE);
			if(StringUtility.isBlank(message))
				message = httpStatus.getReasonPhrase();
			log.debug("statusCode = {}, message = {}",statusCode, message);
		}
		
		DefaultResponse body = new DefaultResponse(httpStatus, message);
		return new ResponseEntity<DefaultResponse>(body, httpStatus) ;
	}
}
