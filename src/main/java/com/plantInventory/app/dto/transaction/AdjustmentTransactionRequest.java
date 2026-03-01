package com.plantInventory.app.dto.transaction;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdjustmentTransactionRequest {

	//Fields
	@NotNull(message = "Plant Id is requried.")
	private Long plantId;
	
	//Positive(add stock) or Negative(reduce stock)
	@NotNull(message = "Delto value is requried.")
	private Integer delta;
	
	@NotBlank(message = "Reason for adjustment is required.")
	private String reason;
	
	//Constructor
	
	public AdjustmentTransactionRequest() {}

    public AdjustmentTransactionRequest(Long plantId, Integer delta, String reason) {
        this.plantId = plantId;
        this.delta = delta;
        this.reason = reason;
    }

    //Getter and Setter
    
	public Long getPlantId() {
		return plantId;
	}

	public void setPlantId(Long plantId) {
		this.plantId = plantId;
	}

	public Integer getDelta() {
		return delta;
	}

	public void setDelta(Integer delta) {
		this.delta = delta;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
