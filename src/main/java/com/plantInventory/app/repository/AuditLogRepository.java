package com.plantInventory.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantInventory.app.model.AuditLog;

public interface AuditLogRepository extends JpaRepository<AuditLog, Integer>{

}
