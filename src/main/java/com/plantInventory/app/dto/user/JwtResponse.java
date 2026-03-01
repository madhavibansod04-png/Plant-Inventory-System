package com.plantInventory.app.dto.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JwtResponse {
	
	//Fields
	private String accessToken;
	private String tokenType = "Bearer";
	private Long expiresIn;
	private Long userId;
	private String username;
	private List<String> roles;
	
	//constructors
	
	public JwtResponse() {}
	
	public JwtResponse(String accessToken, Long expiresIn, Long userId, String username, List<String> roles) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.userId = userId;
        this.username = username;
        this.roles = roles;
    }

	//getter and setter
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public Long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}

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

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}
