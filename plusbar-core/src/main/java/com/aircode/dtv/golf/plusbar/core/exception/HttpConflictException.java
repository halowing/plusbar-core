package com.aircode.dtv.golf.plusbar.core.exception;

import org.springframework.http.HttpStatus;

public class HttpConflictException extends DefaultApplicationException  {

	private static final long serialVersionUID = -1702667171228990922L;
	
	public HttpConflictException() {
		super(HttpStatus.CONFLICT);
	}
	
	public HttpConflictException(String id) {
		super(HttpStatus.CONFLICT,"ID is "+id+". and It is conflict.");
	}

}
