package com.plantInventory.app.service;

import java.util.List;

import com.plantInventory.app.dto.supplier.CreateSupplierRequest;
import com.plantInventory.app.dto.supplier.SupplierResponse;
import com.plantInventory.app.dto.supplier.UpdateSupplierRequest;

public interface SupplierService {
	
	//create a supplier
	SupplierResponse createSupplier(CreateSupplierRequest request);
	
	//update supplier
	SupplierResponse updateSupplier(UpdateSupplierRequest request);
	
	//return a list of supplier
	List<SupplierResponse> getAllSuppliers();
	
	//fetch supplier using Primary key
	SupplierResponse getSupplierById(Long supplierId);
	
	//allow searching supplier by name
	SupplierResponse getSupplierByName(String name);
	
	//searching by email
	SupplierResponse getSupplierByEmail(String email);
	
	//set supplier as inactive insted of deleting 
	void deactivateSupplier(Long supplierId);
}
