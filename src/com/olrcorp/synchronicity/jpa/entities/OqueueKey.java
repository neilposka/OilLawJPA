package com.olrcorp.synchronicity.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OqueueKey implements Serializable {
	
	@Column(name="scan_session")
    private String scanSession;

	@Column(name="scan_date_time")
    private Date scanDateTime;

	@Column(name="order_no")
    private String orderNo;

    public String getScanSession() {
        return scanSession;
    }

    public void setScanSession(String scanSession) {
        this.scanSession = scanSession == null ? null : scanSession.trim();
    }

    public Date getScanDateTime() {
        return scanDateTime;
    }

    public void setScanDateTime(Date scanDateTime) {
        this.scanDateTime = scanDateTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result
				+ ((scanDateTime == null) ? 0 : scanDateTime.hashCode());
		result = prime * result
				+ ((scanSession == null) ? 0 : scanSession.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OqueueKey other = (OqueueKey) obj;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (scanDateTime == null) {
			if (other.scanDateTime != null)
				return false;
		} else if (!scanDateTime.equals(other.scanDateTime))
			return false;
		if (scanSession == null) {
			if (other.scanSession != null)
				return false;
		} else if (!scanSession.equals(other.scanSession))
			return false;
		return true;
	}
    
    
}