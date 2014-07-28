package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rpt_source_locations database table.
 * 
 */
@Entity
@Table(name="rpt_source_locations")
@NamedQuery(name="RptSourceLocation.findAll", query="SELECT r FROM RptSourceLocation r")
public class RptSourceLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	private String county;

	@Column(name="county_id")
	private Integer countyId;

	private Integer id;

	private String location;

	@Column(name="location_id")
	private Integer locationId;

	@Column(name="section_calls")
	private String sectionCalls;

	@Column(name="src_id")
	private Integer srcId;

	private String state;

	public RptSourceLocation() {
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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getSectionCalls() {
		return this.sectionCalls;
	}

	public void setSectionCalls(String sectionCalls) {
		this.sectionCalls = sectionCalls;
	}

	public Integer getSrcId() {
		return this.srcId;
	}

	public void setSrcId(Integer srcId) {
		this.srcId = srcId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}