package com.plantInventory.app.dto.user;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotBlank;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginRequest {
	
	//Fields
	
	@NotBlank(message = "Username is requried.")
	private String username;
	
	@NotBlank(message = "Password is requried.")
	private String password;
	
//	constructors
	public LoginRequest() {}
	
	public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
	
	//getter and setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
