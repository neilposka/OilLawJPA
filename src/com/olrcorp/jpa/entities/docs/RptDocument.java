package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the rpt_documents database table.
 * 
 */
@Entity
@Table(name="rpt_documents")
@NamedQuery(name="RptDocument.findAll", query="SELECT r FROM RptDocument r")
public class RptDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	private String applicant;

	private String attorney;

	private String categories;

	@Column(name="cause_no")
	private String causeNo;

	private String contact;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Temporal(TemporalType.DATE)
	private Date date1;

	@Column(name="date1_type")
	private String date1Type;

	private Timestamp date2;

	@Column(name="date2_type")
	private String date2Type;

	private Integer id;

	@Column(name="major_update_at")
	private Timestamp majorUpdateAt;

	private String name;

	private String notes;

	private String state;

	@Column(name="type_descr")
	private String typeDescr;

	@Column(name="type_id")
	private Integer typeId;

	@Column(name="type_name")
	private String typeName;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public RptDocument() {
	}

	public String getApplicant() {
		return this.applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getAttorney() {
		return this.attorney;
	}

	public void setAttorney(String attorney) {
		this.attorney = attorney;
	}

	public String getCategories() {
		return this.categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getCauseNo() {
		return this.causeNo;
	}

	public void setCauseNo(String causeNo) {
		this.causeNo = causeNo;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Date getDate1() {
		return this.date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public String getDate1Type() {
		return this.date1Type;
	}

	public void setDate1Type(String date1Type) {
		this.date1Type = date1Type;
	}

	public Timestamp getDate2() {
		return this.date2;
	}

	public void setDate2(Timestamp date2) {
		this.date2 = date2;
	}

	public String getDate2Type() {
		return this.date2Type;
	}

	public void setDate2Type(String date2Type) {
		this.date2Type = date2Type;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getMajorUpdateAt() {
		return this.majorUpdateAt;
	}

	public void setMajorUpdateAt(Timestamp majorUpdateAt) {
		this.majorUpdateAt = majorUpdateAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTypeDescr() {
		return this.typeDescr;
	}

	public void setTypeDescr(String typeDescr) {
		this.typeDescr = typeDescr;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}