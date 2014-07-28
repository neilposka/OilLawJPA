package com.olrcorp.synchronicity.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="oqueue")
public class Oqueue implements Serializable {
	
    @EmbeddedId
	private OqueueKey key;
	
	@Column(name="order_dup")
    private String orderDup;

	@Column(name="proc_oper_id")
    private String procOperId;

	@Temporal(TemporalType.DATE)
	@Column(name="proc_date_time")
    private Date procDateTime;

	@Column(name="audit_oper_id")
    private String auditOperId;

	@Temporal(TemporalType.DATE)
	@Column(name="audit_date_time")
    private Date auditDateTime;

	public OqueueKey getKey() {
		return key;
	}

	public void setKey(OqueueKey key) {
		this.key = key;
	}

    public String getOrderDup() {
        return orderDup;
    }

    public void setOrderDup(String orderDup) {
        this.orderDup = orderDup == null ? null : orderDup.trim();
    }

    public String getProcOperId() {
        return procOperId;
    }

    public void setProcOperId(String procOperId) {
        this.procOperId = procOperId == null ? null : procOperId.trim();
    }

    public Date getProcDateTime() {
        return procDateTime;
    }

    public void setProcDateTime(Date procDateTime) {
        this.procDateTime = procDateTime;
    }

    public String getAuditOperId() {
        return auditOperId;
    }

    public void setAuditOperId(String auditOperId) {
        this.auditOperId = auditOperId == null ? null : auditOperId.trim();
    }

    public Date getAuditDateTime() {
        return auditDateTime;
    }

	public void setAuditDateTime(Date auditDateTime) {
		this.auditDateTime = auditDateTime;
	}



}