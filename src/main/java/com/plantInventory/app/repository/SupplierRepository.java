package com.plantInventory.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantInventory.app.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

}
