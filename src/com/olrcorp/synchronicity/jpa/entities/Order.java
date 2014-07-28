package com.olrcorp.synchronicity.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="orders")
public class Order implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private String orderNo;

	@Column(name="order_dup")
    private String orderDup;

	@Column(name="order_type")
    private String orderType;

	@Temporal(TemporalType.DATE)
	@Column(name="order_date")
    private Date orderDate;
	
	@Column(name="docket_type")
    private String docketType;

	@Column(name="docket_prefix")
    private String docketPrefix;

	@Column(name="docket_no")
    private String docketNo;

	@Column(name="docket_city")
    private String docketCity;

	@Column(name="attr_recovery")
    private String attrRecovery;

	@Column(name="attr_direct")
    private String attrDirect;

	@Column(name="attr_sand")
    private String attrSand;

	@Column(name="attr_misc")
    private String attrMisc;

    private String applicant;

    private String params;
    
	@Temporal(TemporalType.DATE)
	@Column(name="last_update")
    private Date lastUpdate;

	@Temporal(TemporalType.DATE)
	@Column(name="other_date")
    private Date otherDate;

	@Column(name="other_date_type")
    private String otherDateType;

	@Column(name="related_order_no")
    private String relatedOrderNo;

    private String attorney;

	@Temporal(TemporalType.DATE)
	@Column(name="created_at")
    private Date createdAt;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_at")
    private Date updatedAt;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderDup() {
        return orderDup;
    }

    public void setOrderDup(String orderDup) {
        this.orderDup = orderDup == null ? null : orderDup.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getDocketType() {
        return docketType;
    }

    public void setDocketType(String docketType) {
        this.docketType = docketType == null ? null : docketType.trim();
    }

    public String getDocketPrefix() {
        return docketPrefix;
    }

    public void setDocketPrefix(String docketPrefix) {
        this.docketPrefix = docketPrefix == null ? null : docketPrefix.trim();
    }

    public String getDocketNo() {
        return docketNo;
    }

    public void setDocketNo(String docketNo) {
        this.docketNo = docketNo == null ? null : docketNo.trim();
    }

    public String getDocketCity() {
        return docketCity;
    }

    public void setDocketCity(String docketCity) {
        this.docketCity = docketCity == null ? null : docketCity.trim();
    }

    public String getAttrRecovery() {
        return attrRecovery;
    }

    public void setAttrRecovery(String attrRecovery) {
        this.attrRecovery = attrRecovery == null ? null : attrRecovery.trim();
    }

    public String getAttrDirect() {
        return attrDirect;
    }

    public void setAttrDirect(String attrDirect) {
        this.attrDirect = attrDirect == null ? null : attrDirect.trim();
    }

    public String getAttrSand() {
        return attrSand;
    }

    public void setAttrSand(String attrSand) {
        this.attrSand = attrSand == null ? null : attrSand.trim();
    }

    public String getAttrMisc() {
        return attrMisc;
    }

    public void setAttrMisc(String attrMisc) {
        this.attrMisc = attrMisc == null ? null : attrMisc.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getOtherDate() {
        return otherDate;
    }

    public void setOtherDate(Date otherDate) {
        this.otherDate = otherDate;
    }

    public String getOtherDateType() {
        return otherDateType;
    }

    public void setOtherDateType(String otherDateType) {
        this.otherDateType = otherDateType == null ? null : otherDateType.trim();
    }

    public String getRelatedOrderNo() {
        return relatedOrderNo;
    }

    public void setRelatedOrderNo(String relatedOrderNo) {
        this.relatedOrderNo = relatedOrderNo == null ? null : relatedOrderNo.trim();
    }

    public String getAttorney() {
        return attorney;
    }

    public void setAttorney(String attorney) {
        this.attorney = attorney == null ? null : attorney.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


}
