package com.plantInventory.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.plantInventory.app.dto.common.PageResponse;
import com.plantInventory.app.dto.plant.CreatePlantRequest;
import com.plantInventory.app.dto.plant.LowStockReportResponse;
import com.plantInventory.app.dto.plant.PlantResponse;
import com.plantInventory.app.dto.plant.UpdatePlantRequest;
import com.plantInventory.app.dto.transaction.AdjustmentTransactionRequest;
import com.plantInventory.app.dto.transaction.PurchaseTransactionRequest;
import com.plantInventory.app.dto.transaction.TransactionResponse;
import com.plantInventory.app.mapper.PlantMapper;
import com.plantInventory.app.model.Plant;
import com.plantInventory.app.repository.InventoryTransactionRepository;
import com.plantInventory.app.repository.PlantRepository;
import com.plantInventory.app.service.AuditService;
import com.plantInventory.app.service.PlantService;

public class PlantServiceImpl implements PlantService {
	
	private final PlantRepository plantRepository;
	private final AuditService auditService;
	private final InventoryTransactionRepository transactionRepository;
	private final PlantMapper plantMapper;
	
	public PlantServiceImpl(
			PlantRepository plantRepository,
			AuditService auditService,
			InventoryTransactionRepository transactionRepository,
			PlantMapper plantMapper) {
		
		this.plantRepository = plantRepository;
		this.auditService = auditService;
		this.transactionRepository = transactionRepository;
		this.plantMapper = plantMapper;
	}
	
	@Override
	public PlantResponse createPlant(CreatePlantRequest request) {
		Plant plant = plantMapper.toEntity(request);
		Plant savedPlant = plantRepository.save(plant);
		auditService.recordEvent(
				"CREATE",
				"plant",
				savedPlant.getPlantId(),
				null,
				"new plant created");
		
		return plantMapper.toResponse(savedPlant);
	}

	@Override
	public PlantResponse updatePlant(UpdatePlantRequest request) {
		
		Plant plant = plantRepository.findById(request.getId())
				.orElseThrow(() -> new RuntimeException("Plant not found"));
		
		plantMapper.updateEntityFromDto(request, plant);
		
		Plant updatedPlant = plantRepository.save(plant);
		
		auditService.recordEvent("UPDATE", "Plant", updatedPlant.getPlantId(), null, "Plant updated");
		
		return plantMapper.toResponse(updatedPlant);
	}

	@Override
	public PageResponse<PlantResponse> getAllPlants(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		
		Page<Plant> plantPage = plantRepository.findAll(pageable);
		
		List<PlantResponse> plantResponses = 
				plantPage.getContent()
						.stream()
						.map(plantMapper::toResponse)
						.collect(Collectors.toList());
		
		return new PageResponse<>(
				plantResponses,
				plantPage.getNumber(),
				plantPage.getSize(),
				plantPage.getTotalElements(),
				plantPage.getTotalPages()
		);
	}

	@Override
	public List<PlantResponse> searchPlant(String name, String category) {
		List<Plant> plants =
				plantRepository.findByCommonNameContainingIgnoreCaseOrCategoryContainingIgnoreCase(name, category);

		return plants.stream() 
				.map(plantMapper::toResponse)
				.collect(Collectors.toList());
	}

	@Override
	public List<LowStockReportResponse> getLowStockReport() {
		List<Plant> plants =  plantRepository.findAll();
		
		return plants.stream()
				.filter(p -> p.getStockQuantity() < p.getMinThreshold())
				.map(p -> new LowStockReportResponse(
						p.getCommonName(),
						p.getStockQuantity(),
						p.getMinThreshold(),
						0L
				))
				.collect(Collectors.toList());
	}

	@Override
	public PlantResponse adjustStock(AdjustmentTransactionRequest request) {
		Plant plant = plantRepository.findById(request.getPlantId())
				.orElseThrow(() -> new RuntimeException("Plant not found"));
		
		int newQuantity = plant.getStockQuantity() + request.getDelta();
		
		if(newQuantity < 0) {
			throw new RuntimeException("Stock cannot be negative");
		}
		
		plant.setStockQuantity(newQuantity);
		Plant savedPlant = plantRepository.save(plant);
		
		auditService.recordEvent("ADJUST", "Plant", savedPlant.getPlantId(), null, "Stock adjussted : " +request.getReason());
		
		return plantMapper.toResponse(savedPlant);
	}

	@Override
	public TransactionResponse recordPurchase(PurchaseTransactionRequest request) {
		Plant plant = plantRepository.findById(request.getPlantId())
				.orElseThrow(() -> new RuntimeException("Plant not found"));
		
		int before = plant.getStockQuantity();
		int after = before + request.getQuantity();
		
		plant.setStockQuantity(after);
		
		plantRepository.save(plant);
		
		auditService.recordEvent("PURCHASE", "Plant", plant.getPlantId(), null, "Purchase transaction recorded");
		
		return new TransactionResponse();
	}

	@Override
	public void deactivatePlant(Long id) {
		Plant plant = plantRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Plant not found"));
		
		plant.setActive(false);
		
		plantRepository.save(plant);
		
		auditService.recordEvent("DEACTIVATE", "Plant", plant.getPlantId(), null, "Plant deactivated");
		
	}

	@Override
	public void reactivatePlant(Long id) {
		Plant plant = plantRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Plant not found"));
		
		plant.setActive(true);
		
		plantRepository.save(plant);
		
		auditService.recordEvent("REACTIVATE", "Plant", plant.getPlantId(), null, "Plant reactivated");
	}

}
