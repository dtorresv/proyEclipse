package com.ejemplocrud.ejemplocrud.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ErrorHandle extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = ModelNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleNotFoundException(ModelNotFoundException exception, HttpServletRequest request){
		ExceptionResponse excResp= new ExceptionResponse();
		excResp.setErrorMessage(exception.getMessage());
		excResp.setUrl(request.getRequestURI());
		return new ResponseEntity<ExceptionResponse>(excResp, HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		ExceptionResponse excResp= new ExceptionResponse();
		excResp.setErrorMessage(ex.getMessage());
		excResp.setUrl(((HttpServletRequest)request).getRequestURI());
		return new ResponseEntity<Object>(excResp, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExceptionResponse> handleGenericException(Exception exception, HttpServletRequest request){
		ExceptionResponse excResp= new ExceptionResponse();
		excResp.setErrorMessage(exception.getMessage());
		excResp.setUrl(request.getRequestURI());
		return new ResponseEntity<ExceptionResponse>(excResp, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
