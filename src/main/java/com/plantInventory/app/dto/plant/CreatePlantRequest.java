package com.plantInventory.app.dto.plant;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL) //skip null fields in json
public class CreatePlantRequest {

	//fields
	
	@NotBlank(message = "Common nome is required")
	@Size(max = 200 , message = "Common name cannot exceed 200 characters")
	private String commonName;
	
	@Size(max = 200, message = "Scientific name cannot exceed 200 characters")
	private String scientificName;
	
	@NotBlank(message = "Category is required")
	private String category;
	
	@DecimalMin(value = "0.0", inclusive = true, message = "Purchase price cannot be negative")
	@Digits(integer = 10, fraction = 2, message = "ppurchase price format is invalid")
	private BigDecimal purchasePrice;
	
	@DecimalMin(value = "0.0", inclusive = true, message = "sell price cannot be negative")
	private BigDecimal sellPrice;
	
	@Min(value = 0, message = "Stock quatity cannot be negative.")
	private Integer stockQuantity;
	
	@Min(value = 0, message = "minimum threshold cannot be negative")
	private Integer minThreshold;
	
	private String location;
	
	private List<@NotBlank(message = "Tag cannot be blank.") String> tags;
	
	//constructors
	
	public CreatePlantRequest() {}
	
	public CreatePlantRequest(String commonName, String scientificName, String category,
            BigDecimal purchasePrice, BigDecimal sellPrice,
            Integer stockQuantity, Integer minThreshold,
            String location, List<String> tags) {
		this.commonName = commonName;
		this.scientificName = scientificName;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
		this.stockQuantity = stockQuantity;
		this.minThreshold = minThreshold;
		this.location = location;
		this.tags = tags;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Integer getMinThreshold() {
		return minThreshold;
	}

	public void setMinThreshold(Integer minThreshold) {
		this.minThreshold = minThreshold;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
}
