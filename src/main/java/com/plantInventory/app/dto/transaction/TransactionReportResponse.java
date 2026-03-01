package com.plantInventory.app.dto.transaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionReportResponse {

    private BigDecimal totalPurchases;
    private BigDecimal totalSales;
    private BigDecimal totalInventoryValue;
    private List<TransactionResponse> transactions;


    // Constructors

    public TransactionReportResponse() {}

    public TransactionReportResponse(BigDecimal totalPurchases, BigDecimal totalSales,
                                     BigDecimal totalInventoryValue, List<TransactionResponse> transactions) {
        this.totalPurchases = totalPurchases;
        this.totalSales = totalSales;
        this.totalInventoryValue = totalInventoryValue;
        this.transactions = transactions;
    }

    // Getters and Setters 

	public BigDecimal getTotalPurchases() {
		return totalPurchases;
	}

	public void setTotalPurchases(BigDecimal totalPurchases) {
		this.totalPurchases = totalPurchases;
	}

	public BigDecimal getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(BigDecimal totalSales) {
		this.totalSales = totalSales;
	}

	public BigDecimal getTotalInventoryValue() {
		return totalInventoryValue;
	}

	public void setTotalInventoryValue(BigDecimal totalInventoryValue) {
		this.totalInventoryValue = totalInventoryValue;
	}

	public List<TransactionResponse> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionResponse> transactions) {
		this.transactions = transactions;
	}

}