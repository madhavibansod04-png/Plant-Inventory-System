package com.plantInventory.app.dto.common;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

	//define all requires filds 
	private boolean success;
	private String message;
	private T data;
	private OffsetDateTime timestamp;
	
	//constructor
	public ApiResponse() {
		this.timestamp = OffsetDateTime.now();
	}
	
	public ApiResponse(boolean success, String message, T data) {
		this.success = success;
		this.message = message;
		this.data = data;
		this.timestamp = OffsetDateTime.now();
	}
	
	//static factory methods 
	public static <T> ApiResponse<T> success(T data){
		return new ApiResponse<>(true, null, data);
	}
	
	public static <T> ApiResponse<T> success(String message, T data){
		return new ApiResponse<>(true, message, data);
	}
	
	public static <T> ApiResponse<T> success(String message){
		return new ApiResponse<>(false, message, null);
	}

	//getter and setter
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public OffsetDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(OffsetDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}
