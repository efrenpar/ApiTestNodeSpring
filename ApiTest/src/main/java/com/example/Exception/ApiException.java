package com.example.Exception;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;

public class ApiException {
	private final int code;
	private final boolean succes;
	private final String message;
	private final ArrayList<String> errorData;
	
	
	
	public ApiException(int code, boolean succes, String message, ArrayList<String> errorData) {
		super();
		this.code = code;
		this.succes = succes;
		this.message = message;
		this.errorData = errorData;
	}
	public int getCode() {
		return code;
	}
	public boolean getSucces() {
		return succes;
	}
	public String getMessage() {
		return message;
	}
	public ArrayList<String> getErrorData() {
		return errorData;
	}
	
	
	
	
	
}
