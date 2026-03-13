package com.plantInventory.app.dto.plant;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LowStockReportResponse {
	
	//fields

	private String plantName;
	private Integer stockQuantity;
	private Integer threshold;
	private Long daysSinceLastPurchase;
	
	
	//constructor --> no-args
	public LowStockReportResponse() {}
	
	//constructor --> all args
	public LowStockReportResponse(String plantName, Integer stockQuantity, 
			Integer threshold, Long daysSinceLastPurchase) {
		this.plantName = plantName;
		this.stockQuantity = stockQuantity;
		this.threshold = threshold;
		this.daysSinceLastPurchase = daysSinceLastPurchase;
	}

	//getter and setter
	
	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Integer getThreshold() {
		return threshold;
	}

	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}

	public Long getDaysSinceLastPurchase() {
		return daysSinceLastPurchase;
	}

	public void setDaysSinceLastPurchase(Long daysSinceLastPurchase) {
		this.daysSinceLastPurchase = daysSinceLastPurchase;
	}
	
}
