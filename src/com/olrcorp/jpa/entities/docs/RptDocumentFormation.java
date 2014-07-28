package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rpt_document_formations database table.
 * 
 */
@Entity
@Table(name="rpt_document_formations")
@NamedQuery(name="RptDocumentFormation.findAll", query="SELECT r FROM RptDocumentFormation r")
public class RptDocumentFormation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="depth_lower")
	private Integer depthLower;

	@Column(name="depth_upper")
	private Integer depthUpper;

	private String description;

	@Column(name="doc_id")
	private Integer docId;

	private Integer id;

	private String location;

	@Column(name="location_id")
	private Integer locationId;

	private String name;

	private String orientation;

	@Column(name="product_code")
	private String productCode;

	@Column(name="section_calls")
	private String sectionCalls;

	private Integer size;

	public RptDocumentFormation() {
	}

	public Integer getDepthLower() {
		return this.depthLower;
	}

	public void setDepthLower(Integer depthLower) {
		this.depthLower = depthLower;
	}

	public Integer getDepthUpper() {
		return this.depthUpper;
	}

	public void setDepthUpper(Integer depthUpper) {
		this.depthUpper = depthUpper;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDocId() {
		return this.docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrientation() {
		return this.orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSectionCalls() {
		return this.sectionCalls;
	}

	public void setSectionCalls(String sectionCalls) {
		this.sectionCalls = sectionCalls;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

}