package com.plantInventory.app.dto.common;

import java.time.OffsetDateTime;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {

	//fields
	private int statusCode;
	private String error;
	private String message;
	private Map<String, String> details;
	private OffsetDateTime timestamp;
	
	//constructors
	public ErrorResponse() {
		this.timestamp = OffsetDateTime.now();
	}
	
	//constructor for general errors without field-level details
	public ErrorResponse(int statusCode, String error, String message) {
		this.statusCode = statusCode;
		this.error = error;
		this.message = message;
		this.timestamp = OffsetDateTime.now();
	}
	
	//constructor for validation errors that include field-level details
	public ErrorResponse(int statusCode, String error, String message, Map<String, String> details) {
		this.statusCode = statusCode;
		this.error = error;
		this.message = message;
		this.details = details;
		this.timestamp = OffsetDateTime.now();
	}
	
	//factory method for creating a simple error response
	public static ErrorResponse of(int statusCode, String error, String message) {
		return new ErrorResponse(statusCode, error, message);
	}
	
	//factory method for creating an error response with validation details
	public static ErrorResponse of(int statusCode, String error, String message, Map<String, String> details) {
		return new ErrorResponse(statusCode, error, message, details);
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

	public OffsetDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(OffsetDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}
