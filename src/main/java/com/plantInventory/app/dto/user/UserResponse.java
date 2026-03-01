package com.plantInventory.app.dto.user;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {

	// fields

	private Long userId;
	private String username;
	private String email;
	private List<String> roles;
	private Boolean enabled;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private OffsetDateTime createdAt;

	// constructor
	public UserResponse() {
	}

	public UserResponse(Long userId, String username, String email, List<String> roles, Boolean enabled,
			OffsetDateTime createdAt) {
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.enabled = enabled;
		this.createdAt = createdAt;
	}

	// getter and setter
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
