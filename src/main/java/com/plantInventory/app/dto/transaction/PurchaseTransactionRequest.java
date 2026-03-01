package com.plantInventory.app.dto.transaction;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseTransactionRequest {

	// Fields

	@NotNull(message = "Plant id is requried.")
	private Long plantId;

	@NotNull(message = "Supplier ID is requried.")
	private Long supplierId;

	@NotNull(message = "Please enter the quantity.")
	@Min(value = 1, message = "Quantity must be greater than 0")
	private Integer quantity;

	@DecimalMin(value = "0.0", inclusive = true, message = "price must be non-negative")
	private BigDecimal purchasePrice;

	private String notes;

	// constructor

	public PurchaseTransactionRequest() {
	}

	public PurchaseTransactionRequest(Long plantId, Long supplierId, Integer quantity, BigDecimal purchasePrice,
			String notes) {
		this.plantId = plantId;
		this.supplierId = supplierId;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.notes = notes;
	}

	//getter and setter
	
	public Long getPlantId() {
		return plantId;
	}

	public void setPlantId(Long plantId) {
		this.plantId = plantId;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
