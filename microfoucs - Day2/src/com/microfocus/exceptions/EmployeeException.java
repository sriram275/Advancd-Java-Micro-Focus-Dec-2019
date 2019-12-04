package com.microfocus.exceptions;

public class EmployeeException extends Exception {
	
	public EmployeeException (String message) {
		this.message =message;
	}
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
