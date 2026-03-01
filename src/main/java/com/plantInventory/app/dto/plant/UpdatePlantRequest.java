package com.plantInventory.app.dto.plant;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePlantRequest {
	
	//Fields
	
	@NotNull(message = "Plant ID is rerequired for update.")
	private Long id;
	
	@Size(max = 200, message = "Common name cannot exceed 200 characters.")
	private String commonName;
	
	@Size(max = 200, message = "Scientific name cannot exeed 200 characters.")
	private String scientificName;
	
	private String category;
	
	@DecimalMin(value = "0.0", inclusive = true, message = "Purchase price cannot be negative.")
    @Digits(integer = 10, fraction = 2, message = "Purchase price format is invalid.")
    private BigDecimal purchasePrice;

	@DecimalMin(value = "0.0", inclusive = true, message = "Sell price cannot be negative.")
    @Digits(integer = 10, fraction = 2, message = "Sell price format is invalid.")
    private BigDecimal sellPrice;
	
	@Min(value = 0, message = "Minimum threshold cannot be negative.")
	private Integer minThreshold;
	
	private String location;
	
	private Boolean active;
	
	private List<@NotBlank(message = "Tag cannot be blank.") String> tags;
	
	//constructors --> no-args
	public UpdatePlantRequest() {}
	
	//optional all args constructor --> usefull for tests r manual updates
	public UpdatePlantRequest(Long id, String commonName, String scientificName, String category,
            BigDecimal purchasePrice, BigDecimal sellPrice,
            Integer minThreshold, String location, Boolean active, List<String> tags) {
		this.id = id;
		this.commonName = commonName;
		this.scientificName = scientificName;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
		this.minThreshold = minThreshold;
		this.location = location;
		this.active = active;
		this.tags = tags;
	}

	//getter and setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
}
