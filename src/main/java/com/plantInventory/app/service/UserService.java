package com.plantInventory.app.service;

import java.util.List;

import com.plantInventory.app.dto.user.JwtResponse;
import com.plantInventory.app.dto.user.LoginRequest;
import com.plantInventory.app.dto.user.UserRegistrationRequest;
import com.plantInventory.app.dto.user.UserResponse;

public interface UserService {
	
	//register user
	UserResponse registerUser(UserRegistrationRequest request);
	
	//login user
	JwtResponse loginUser(LoginRequest request);
	
	//enable/disable user
	void disableUser(Long userId);
	
	//fetch user Profile
	UserResponse getUserProfile(Long userId);
	
	//fetch all users
	List<UserResponse> getAllUsers();
	
}
