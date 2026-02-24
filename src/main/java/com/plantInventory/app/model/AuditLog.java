package com.plantInventory.app.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "auditlog")
public class AuditLog {

	//attribute
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int auditId;
	
	private String entityName;
	
	private Long entityId;
	
	private String action;
	
	private String details;
		
	@Column(nullable = false)
	private LocalDateTime timestamp = LocalDateTime.now();
	
	//relationship
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User performedBy;

	//empty constructor
	public AuditLog() {}
	
	//constructor with fields
	public AuditLog(int auditId, String entityName, Long entityId,
			String action, String details, User performedBy, LocalDateTime timestamp) {
	
		this.auditId = auditId;
		this.entityName = entityName;
		this.entityId = entityId;
		this.action = action;
		this.details = details;
		this.performedBy = performedBy;
		this.timestamp = timestamp;
	}
	
	//getter and setter

	public int getAuditId() {
		return auditId;
	}

	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public User getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(User performedBy) {
		this.performedBy = performedBy;
	}
	
}
