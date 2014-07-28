package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the source_legals database table.
 * 
 */
@Entity
@Table(name="source_legals")
@NamedQuery(name="SourceLegal.findAll", query="SELECT s FROM SourceLegal s")
public class SourceLegal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String county;

	@Column(name="county_id")
	private Integer countyId;

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

	@Column(name="section_id")
	private Integer sectionId;

	@Column(name="sequence_number")
	private Integer sequenceNumber;

	@Column(name="source_id")
	private Integer sourceId;

	private String state;

	@Column(name="state_id")
	private Integer stateId;

	@Column(name="township_direction")
	private String townshipDirection;

	@Column(name="township_id")
	private Integer townshipId;

	@Column(name="township_number")
	private BigDecimal townshipNumber;

	public SourceLegal() {
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

	public Integer getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getSequenceNumber() {
		return this.sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Integer getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
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

	public Integer getTownshipId() {
		return this.townshipId;
	}

	public void setTownshipId(Integer townshipId) {
		this.townshipId = townshipId;
	}

	public BigDecimal getTownshipNumber() {
		return this.townshipNumber;
	}

	public void setTownshipNumber(BigDecimal townshipNumber) {
		this.townshipNumber = townshipNumber;
	}

}