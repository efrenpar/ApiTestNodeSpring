package com.example.demo.exceptionHandler;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.Exception.ApiException;
import com.example.Exception.ApiRequestException;

@ControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler(value = {MissingRequestHeaderException.class,MissingServletRequestParameterException.class
			,NumberFormatException.class})
	public ResponseEntity<Object> handlerMissingRequestHeaderException(Exception e ){
		
		/*ArrayList<String> stack = new ArrayList<>();
		for (StackTraceElement exce : e.getStackTrace() ) {
			stack.add(exce.toString());
		}*/
		
		ApiException apiE = new ApiException(
					400,
					false,
					e.getMessage(),
					new ArrayList<String>()
					
				);
		
		return new ResponseEntity<>(apiE,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleAll(Exception ex) {
		
		ArrayList<String> stack = new ArrayList<>();
		for (StackTraceElement exce : ex.getStackTrace() ) {
			stack.add(exce.toString());
		}
		
	    ApiException apiError = new ApiException(
	      500,false, "Los sentimos ha ocurrido un error", stack);
	    return new ResponseEntity<Object>(
	      apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
