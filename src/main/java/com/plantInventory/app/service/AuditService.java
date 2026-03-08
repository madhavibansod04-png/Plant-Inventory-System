package com.plantInventory.app.service;

import java.util.List;

import com.plantInventory.app.dto.audit.AuditLogResponse;
import com.plantInventory.app.dto.audit.AuditSearchRequest;

public interface AuditService {

	//used by other service
	void recordEvent(String action, String entityName, Long entityId, Long userId, String changeDetails);
	
	//returns the complete audit history
	List<AuditLogResponse> getAllAuditLogs();
	
	//uses audit search request dto to filter logs by date, action, user, entity
	List<AuditLogResponse> searchAuditLogs(AuditSearchRequest request);
	
	//returns audit entries created by a specific user
	List<AuditLogResponse> getAuditLogsByUser(Long userId);
	
	//Returns audit entries related to a specific entity(Plant, Supplier, Transaction)
	List<AuditLogResponse> getAuditLogsByEntity(String entityName, Long entityId);
}
