package com.plantInventory.app.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "plant")
@EntityListeners(AuditingEntityListener.class)
public class Plant {

	//attribute
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int plantId;
	
	private String commonName;
	
	private String scientificName;
	
	private String category;
	
	private int stockQuantity;
	
	private int minThreshold;
	
	private int purchasePrice;
	
	private int sellPrice;
	
	private String location;
	
	private String tags;
	
	private boolean active;
	
	@CreatedDate
	@Column(nullable = false, updatable = false)
	private LocalDateTime createdAt;
	
	@LastModifiedDate
	@Column(name = "createdAt", nullable = false, updatable = false)
	private LocalDateTime updatedAt;
	
	//relationship
	@OneToMany(mappedBy = "plant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<InventoryTransaction> transaction;
	
	//empty constructor
	public Plant() {}
	
	//field constructor
	public Plant(int plantId, String commonName, String scientificName, String category,
			int stockQuantity, int minThreshold, int purchasePrice, int sellPrice, String location, 
			String tags, boolean active, LocalDateTime createdAt, LocalDateTime updatedAt ) {
		
		this.plantId = plantId;
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
	
	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
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

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public int getMinThreshold() {
		return minThreshold;
	}

	public void setMinThreshold(int minThreshold) {
		this.minThreshold = minThreshold;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<InventoryTransaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<InventoryTransaction> transaction) {
		this.transaction = transaction;
	}
	
}
