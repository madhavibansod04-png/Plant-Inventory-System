package com.plantInventory.app.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory_transaction")
public class InventoryTransaction {

	//attribute
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	
	private String type;
	
	private int quantityBefore;
	
	private int quantityChange;
	
	private int quantityAfter;
	
	@Column(nullable = false)
	private LocalDateTime timestamp = LocalDateTime.now();
	
	private String notes;
	
	//relationship
	@ManyToOne
	@JoinColumn(name = "plant_id", nullable = false)
	private Plant plant;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "supplier", nullable = false)
	private Supplier supplier;
	
	//empty constructor
	public InventoryTransaction() {}
	
	//constructor with fields
	public InventoryTransaction(int transactionId, Plant plant, User user,
			Supplier supplier, String type, int quantityBefore, int quantityChange,
			int quantityAfter, LocalDateTime timestamp, String notes) {
		
		this.transactionId = transactionId;
		this.plant = plant;
		this.user = user;
		this.supplier = supplier;
		this.type = type;
		this.quantityBefore = quantityBefore;
		this.quantityChange = quantityChange;
		this.quantityAfter = quantityAfter;
		this.timestamp = timestamp;
		this.notes = notes;
	}

	//getter and setter

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantityBefore() {
		return quantityBefore;
	}

	public void setQuantityBefore(int quantityBefore) {
		this.quantityBefore = quantityBefore;
	}

	public int getQuantityChange() {
		return quantityChange;
	}

	public void setQuantityChange(int quantityChange) {
		this.quantityChange = quantityChange;
	}

	public int getQuantityAfter() {
		return quantityAfter;
	}

	public void setQuantityAfter(int quantityAfter) {
		this.quantityAfter = quantityAfter;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
}
