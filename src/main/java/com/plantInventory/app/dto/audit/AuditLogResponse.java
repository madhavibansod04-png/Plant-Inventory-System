package com.plantInventory.app.dto.audit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.OffsetDateTime;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogResponse {

    private Long auditId;

    private String entityName;

    private Long entityId;

    private String action;

    private String details;

    private Map<String, Object> detailMap;

    private Long performedByUserId;

    private String performedByUsername;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime timestamp;


    //  Constructors 

    public AuditLogResponse() {
    }

    public AuditLogResponse(Long auditId, String entityName, Long entityId, String action,
                            String details, Map<String, Object> detailMap,
                            Long performedByUserId, String performedByUsername,
                            OffsetDateTime timestamp) {
        this.auditId = auditId;
        this.entityName = entityName;
        this.entityId = entityId;
        this.action = action;
        this.details = details;
        this.detailMap = detailMap;
        this.performedByUserId = performedByUserId;
        this.performedByUsername = performedByUsername;
        this.timestamp = timestamp;
    }

    //Getter and Setter
    
	public Long getAuditId() {
		return auditId;
	}

	public void setAuditId(Long auditId) {
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

	public Map<String, Object> getDetailMap() {
		return detailMap;
	}

	public void setDetailMap(Map<String, Object> detailMap) {
		this.detailMap = detailMap;
	}

	public Long getPerformedByUserId() {
		return performedByUserId;
	}

	public void setPerformedByUserId(Long performedByUserId) {
		this.performedByUserId = performedByUserId;
	}

	public String getPerformedByUsername() {
		return performedByUsername;
	}

	public void setPerformedByUsername(String performedByUsername) {
		this.performedByUsername = performedByUsername;
	}

	public OffsetDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(OffsetDateTime timestamp) {
		this.timestamp = timestamp;
	}
}