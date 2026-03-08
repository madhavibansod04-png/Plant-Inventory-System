package com.plantInventory.app.service;

import java.util.List;

import com.plantInventory.app.dto.common.PageResponse;
import com.plantInventory.app.dto.plant.CreatePlantRequest;
import com.plantInventory.app.dto.plant.LowStockReportResponse;
import com.plantInventory.app.dto.plant.PlantResponse;
import com.plantInventory.app.dto.plant.UpdatePlantRequest;
import com.plantInventory.app.dto.transaction.AdjustmentTransactionRequest;
import com.plantInventory.app.dto.transaction.PurchaseTransactionRequest;
import com.plantInventory.app.dto.transaction.TransactionResponse;

public interface PlantService {
	
	//create a new plant
	PlantResponse createPlant(CreatePlantRequest request);
	
	//update plant info
	PlantResponse updatePlant(UpdatePlantRequest request);
	
	//retrieve all plants -> as a user i want to see all plants page by page 
	PageResponse<PlantResponse> getAllPlants(int page, int size);
	
	//search plants by name/category
	List<PlantResponse> searchPlant(String name, String category);
	
	//fetch low-stock report 
	List<LowStockReportResponse> getLowStockReport();
	
	//adjust stock manual
	PlantResponse adjustStock(AdjustmentTransactionRequest request);
	
	//increase stock for purchase
	TransactionResponse recordPurchase(PurchaseTransactionRequest request);
	
	//deactivate/reactivate plant
	void deactivatePlant(Long id);
	void reactivatePlant(Long id);
	
	
}
