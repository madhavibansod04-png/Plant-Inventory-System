package com.plantInventory.app.dto.transaction;

import jakarta.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaleTransactionRequest {

    @NotNull(message = "Plant ID is required.")
    private Long plantId;

    @NotNull(message = "Quantity is required.")
    @Min(value = 1, message = "Quantity must be at least 1.")
    private Integer quantity;

    @DecimalMin(value = "0.0", inclusive = true, message = "Sell price must be non-negative.")
    private BigDecimal sellPrice;

    private String notes;


    //Constructors

    public SaleTransactionRequest() {}

    public SaleTransactionRequest(Long plantId, Integer quantity, BigDecimal sellPrice, String notes) {
        this.plantId = plantId;
        this.quantity = quantity;
        this.sellPrice = sellPrice;
        this.notes = notes;
    }

    //Getter and Setter
	public Long getPlantId() {
		return plantId;
	}

	public void setPlantId(Long plantId) {
		this.plantId = plantId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}