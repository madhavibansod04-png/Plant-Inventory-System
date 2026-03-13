package com.plantInventory.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantInventory.app.model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long>{

	List<Plant> findByCommonNameContainingIgnoreCaseOrCategoryContainingIgnoreCase(String name, String category);

}
