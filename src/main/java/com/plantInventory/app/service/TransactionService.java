package com.plantInventory.app.service;

import java.time.OffsetDateTime;
import java.util.List;

import com.plantInventory.app.dto.transaction.AdjustmentTransactionRequest;
import com.plantInventory.app.dto.transaction.PurchaseTransactionRequest;
import com.plantInventory.app.dto.transaction.SaleTransactionRequest;
import com.plantInventory.app.dto.transaction.TransactionResponse;

public interface TransactionService {

	//records a purchase transaction and increases plant stock
	TransactionResponse recordPurchase(PurchaseTransactionRequest request);
	
	//records a sale transaction and decreases plant stock
	TransactionResponse recordSale(SaleTransactionRequest request);
	
	//handles manual inventory adjustments(damaged plants, corrections)
	TransactionResponse adjustStock(AdjustmentTransactionRequest request);
	
	//returns all inventory transactions
	List<TransactionResponse> getTransactionHistory();
	
	//filter transactions by specific plant
	List<TransactionResponse> getTransactionsByPlant(Long plantId);
	
	//filter transactions by staff/user who performed the action
	List<TransactionResponse> getTransactionsByUser(Long userId);
	
	//used for reports like sales or purchase summaries
	List<TransactionResponse> getTransactionsByDateRange(OffsetDateTime startDate, OffsetDateTime endDate);
	
	
}
