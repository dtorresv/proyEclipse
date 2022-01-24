package com.ejemplocrud.ejemplocrud.exception;

import lombok.Data;

@Data
public class ExceptionResponse {
	private String errorMessage;
	private String url;		
}
