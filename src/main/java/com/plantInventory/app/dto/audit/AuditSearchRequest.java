package com.plantInventory.app.dto.audit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.OffsetDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditSearchRequest {

    private String entityName;

    private Long performedByUserId;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime from;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime to;


    //  Constructors

    public AuditSearchRequest() {
    }

    public AuditSearchRequest(String entityName, Long performedByUserId,
                              OffsetDateTime from, OffsetDateTime to) {
        this.entityName = entityName;
        this.performedByUserId = performedByUserId;
        this.from = from;
        this.to = to;
    }


    // Getters and Setters 

    public String getEntityName() { return entityName; }
    public void setEntityName(String entityName) { this.entityName = entityName; }

    public Long getPerformedByUserId() { return performedByUserId; }
    public void setPerformedByUserId(Long performedByUserId) { this.performedByUserId = performedByUserId; }

    public OffsetDateTime getFrom() { return from; }
    public void setFrom(OffsetDateTime from) { this.from = from; }

    public OffsetDateTime getTo() { return to; }
    public void setTo(OffsetDateTime to) { this.to = to; }
}