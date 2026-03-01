package com.plantInventory.app.dto.transaction;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionResponse {

	// Fields

	private Long transactionId;
	private Long plantId;
	private String plantName;
	private Long userId;
	private String userName;
	private Long supplierId;
	private String supplierName;
	private String type;
	private Integer quantityBefore;
	private Integer quantityChange;
	private Integer quantityAfter;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private OffsetDateTime timestamp;

	private String notes;
	
	//Constructors
	
	public TransactionResponse() {}

    public TransactionResponse(Long transactionId, Long plantId, String plantName,
                               Long userId, String userName, Long supplierId, String supplierName,
                               String type, Integer quantityBefore, Integer quantityChange, Integer quantityAfter,
                               OffsetDateTime timestamp, String notes) {
        this.transactionId = transactionId;
        this.plantId = plantId;
        this.plantName = plantName;
        this.userId = userId;
        this.userName = userName;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.type = type;
        this.quantityBefore = quantityBefore;
        this.quantityChange = quantityChange;
        this.quantityAfter = quantityAfter;
        this.timestamp = timestamp;
        this.notes = notes;
    }

    //Getter and Setter
    
	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Long getPlantId() {
		return plantId;
	}

	public void setPlantId(Long plantId) {
		this.plantId = plantId;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getQuantityBefore() {
		return quantityBefore;
	}

	public void setQuantityBefore(Integer quantityBefore) {
		this.quantityBefore = quantityBefore;
	}

	public Integer getQuantityChange() {
		return quantityChange;
	}

	public void setQuantityChange(Integer quantityChange) {
		this.quantityChange = quantityChange;
	}

	public Integer getQuantityAfter() {
		return quantityAfter;
	}

	public void setQuantityAfter(Integer quantityAfter) {
		this.quantityAfter = quantityAfter;
	}

	public OffsetDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(OffsetDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
    
}
