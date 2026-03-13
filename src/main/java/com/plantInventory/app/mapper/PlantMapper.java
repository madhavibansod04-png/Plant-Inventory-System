package com.plantInventory.app.mapper;

import java.time.ZoneOffset;

import org.springframework.stereotype.Component;

import com.plantInventory.app.dto.plant.CreatePlantRequest;
import com.plantInventory.app.dto.plant.PlantResponse;
import com.plantInventory.app.dto.plant.UpdatePlantRequest;
import com.plantInventory.app.model.Plant;

@Component
public class PlantMapper {

	//method declaration 
	public Plant toEntity(CreatePlantRequest request) {
		Plant plant = new Plant();
		
		plant.setCommonName(request.getCommonName());
		plant.setScientificName(request.getScientificName());
		plant.setCategory(request.getCategory());
		plant.setPurchasePrice(request.getPurchasePrice());
		plant.setSellPrice(request.getSellPrice());
		plant.setStockQuantity(request.getStockQuantity());
		plant.setMinThreshold(request.getMinThreshold());
		plant.setLocation(request.getLocation());
		plant.setTags(request.getTags());
		plant.setActive(true);
		
		return plant;
	}
	
	public void updateEntityFromDto(UpdatePlantRequest request, Plant plant) {
		
		if(request.getCommonName() != null) {
			plant.setCommonName(request.getCommonName());
		}
		
		if(request.getScientificName() != null) {
			plant.setScientificName(request.getScientificName());
		}
		
		if(request.getCategory() != null) {
			plant.setCategory(request.getCategory());
		}
		
		if(request.getPurchasePrice() != null) {
			plant.setPurchasePrice(request.getPurchasePrice());
		}
		
		if(request.getSellPrice() != null) {
			plant.setSellPrice(request.getSellPrice());
		}
		
		if(request.getMinThreshold() != null) {
			plant.setMinThreshold(request.getMinThreshold());
		}
		
		if(request.getLocation() != null) {
			plant.setLocation(request.getLocation());
		}
		
		if(request.getTags() != null) {
			plant.setTags(request.getTags());
		}
		
		if(request.getActive() != null) {
			plant.setActive(request.getActive());
		}
	}
	
	public PlantResponse toResponse(Plant plant) {
		PlantResponse response = new PlantResponse();
		
		response.setId(plant.getPlantId());
		response.setCommonName(plant.getCommonName());
		response.setScientificName(plant.getScientificName());
		response.setCategory(plant.getCategory());
		response.setStockQuantity(plant.getStockQuantity());
		response.setMinThreshold(plant.getMinThreshold());
		response.setPurchasePrice(plant.getPurchasePrice());
		response.setSellPrice(plant.getSellPrice());
		response.setLocation(plant.getLocation());
		response.setTags(plant.getTags());
		response.setActive(plant.isActive());
		response.setCreatedAt(plant.getCreatedAt().atOffset(ZoneOffset.UTC));
		response.setUpdatedAt(plant.getUpdatedAt().atOffset(ZoneOffset.UTC));
		
		return response;
	}
}