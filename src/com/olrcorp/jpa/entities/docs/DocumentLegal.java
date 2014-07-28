package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the document_legals database table.
 * 
 */
@Entity
@Table(name="document_legals")
@NamedQuery(name="DocumentLegal.findAll", query="SELECT d FROM DocumentLegal d")
public class DocumentLegal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String county;

	@Column(name="county_id")
	private Integer countyId;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String location;

	private String meridian;

	@Column(name="meridian_id")
	private Integer meridianId;

	@Column(name="range_direction")
	private String rangeDirection;

	@Column(name="range_number")
	private BigDecimal rangeNumber;

	private Integer section;

	@Column(name="section_calls")
	private String sectionCalls;

	private String state;

	@Column(name="state_id")
	private Integer stateId;

	@Column(name="township_direction")
	private String townshipDirection;

	@Column(name="township_number")
	private BigDecimal townshipNumber;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Document
	@ManyToOne
	@JoinColumn(name="doc_id")
	private Document document;

	public DocumentLegal() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Integer getCountyId() {
		return this.countyId;
	}

	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMeridian() {
		return this.meridian;
	}

	public void setMeridian(String meridian) {
		this.meridian = meridian;
	}

	public Integer getMeridianId() {
		return this.meridianId;
	}

	public void setMeridianId(Integer meridianId) {
		this.meridianId = meridianId;
	}

	public String getRangeDirection() {
		return this.rangeDirection;
	}

	public void setRangeDirection(String rangeDirection) {
		this.rangeDirection = rangeDirection;
	}

	public BigDecimal getRangeNumber() {
		return this.rangeNumber;
	}

	public void setRangeNumber(BigDecimal rangeNumber) {
		this.rangeNumber = rangeNumber;
	}

	public Integer getSection() {
		return this.section;
	}

	public void setSection(Integer section) {
		this.section = section;
	}

	public String getSectionCalls() {
		return this.sectionCalls;
	}

	public void setSectionCalls(String sectionCalls) {
		this.sectionCalls = sectionCalls;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getTownshipDirection() {
		return this.townshipDirection;
	}

	public void setTownshipDirection(String townshipDirection) {
		this.townshipDirection = townshipDirection;
	}

	public BigDecimal getTownshipNumber() {
		return this.townshipNumber;
	}

	public void setTownshipNumber(BigDecimal townshipNumber) {
		this.townshipNumber = townshipNumber;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}