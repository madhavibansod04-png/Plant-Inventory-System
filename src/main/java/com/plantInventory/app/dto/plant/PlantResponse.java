package com.plantInventory.app.dto.plant;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PlantResponse {

	//Fields
	
	private long id;
	
	private String commonName;
	
	private String scientificName;
	
	private String category;
	
	private Integer stockQuantity;
	
	private Integer minThreshold;
	
	private BigDecimal purchasePrice;
	
	private BigDecimal sellPrice;
	
	private String location;
	
	private List<String> tags;
	
	private Boolean active;
	
	//date and time when this record was created and updated
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private OffsetDateTime createdAt;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private OffsetDateTime updatedAt;
	
	//no-args constructor
	public PlantResponse() {}
	
	//all-args constructor
	public PlantResponse(Long id, String commonName, String scientificName, String category,
             Integer stockQuantity, Integer minThreshold,
             BigDecimal purchasePrice, BigDecimal sellPrice,
             String location, List<String> tags, Boolean active,
             OffsetDateTime createdAt, OffsetDateTime updatedAt) {
		this.id = id;
		this.commonName = commonName;
		this.scientificName = scientificName;
		this.category = category;
		this.stockQuantity = stockQuantity;
		this.minThreshold = minThreshold;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
		this.location = location;
		this.tags = tags;
		this.active = active;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	 }

	 //getter and setter
	 
	 public long getId() {
		 return id;
	 }

	 public void setId(long id) {
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

	 public Boolean getActive() {
		 return active;
	 }

	 public void setActive(Boolean active) {
		 this.active = active;
	 }

	 public OffsetDateTime getCreatedAt() {
		 return createdAt;
	 }

	 public void setCreatedAt(OffsetDateTime createdAt) {
		 this.createdAt = createdAt;
	 }

	 public OffsetDateTime getUpdatedAt() {
		 return updatedAt;
	 }

	 public void setUpdatedAt(OffsetDateTime updatedAt) {
		 this.updatedAt = updatedAt;
	 }
	 
}
