package com.plantInventory.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantInventory.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
