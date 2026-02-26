package com.plantInventory.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantInventory.app.model.InventoryTransaction;

public interface InvantoryTransactionRepository extends JpaRepository<InventoryTransaction, Integer>{

}
