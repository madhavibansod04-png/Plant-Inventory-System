package com.plantInventory.app.dto.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRegistrationRequest {
	
	//Fields
	
	@NotNull(message = "User Name is requried.")
	@Size(min = 4, max = 50, message = "Username must be between 4 and 50 characters.")
	private String username;
	
	@NotBlank(message = "Password is requried.")
	@Size(min = 6, message = "Password must be at least 6 characters.")
	private String password;
	
	@NotBlank(message = "Email is required.")
	@Email(message = "Please provide a valid email address.")
	private String email;
	
	@NotEmpty(message = "At least one role must be assigned.")
	private List<String> roles;

	//constructor
	public UserRegistrationRequest() {}
	
	public UserRegistrationRequest(String username, String password, String email, List<String> roles) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles = roles;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}
