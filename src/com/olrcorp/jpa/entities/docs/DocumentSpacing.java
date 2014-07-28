package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the document_spacing database table.
 * 
 */
@Entity
@Table(name="document_spacing")
@NamedQuery(name="DocumentSpacing.findAll", query="SELECT d FROM DocumentSpacing d")
public class DocumentSpacing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="action_id")
	private Integer actionId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="depth_lower")
	private Integer depthLower;

	@Column(name="depth_upper")
	private Integer depthUpper;

	@Column(name="dividing_line")
	private String dividingLine;

	@Column(name="formation_name")
	private String formationName;

	private String location;

	private String meridian;

	@Column(name="meridian_id")
	private Integer meridianId;

	@Column(name="pool_id")
	private Integer poolId;

	@Column(name="product_code")
	private String productCode;

	@Column(name="range_direction")
	private String rangeDirection;

	@Column(name="range_number")
	private BigDecimal rangeNumber;

	private Integer section;

	@Column(name="section_calls")
	private String sectionCalls;

	@Column(name="section_id")
	private Integer sectionId;

	@Column(name="space_descr")
	private String spaceDescr;

	@Column(name="space_size")
	private Integer spaceSize;

	private String state;

	@Column(name="state_id")
	private Integer stateId;

	@Column(name="township_direction")
	private String townshipDirection;

	@Column(name="township_id")
	private Integer townshipId;

	@Column(name="township_number")
	private BigDecimal townshipNumber;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Document
	@ManyToOne
	@JoinColumn(name="doc_id")
	private Document document;

	public DocumentSpacing() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActionId() {
		return this.actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
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

	public String getDividingLine() {
		return this.dividingLine;
	}

	public void setDividingLine(String dividingLine) {
		this.dividingLine = dividingLine;
	}

	public String getFormationName() {
		return this.formationName;
	}

	public void setFormationName(String formationName) {
		this.formationName = formationName;
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

	public Integer getPoolId() {
		return this.poolId;
	}

	public void setPoolId(Integer poolId) {
		this.poolId = poolId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public String getSpaceDescr() {
		return this.spaceDescr;
	}

	public void setSpaceDescr(String spaceDescr) {
		this.spaceDescr = spaceDescr;
	}

	public Integer getSpaceSize() {
		return this.spaceSize;
	}

	public void setSpaceSize(Integer spaceSize) {
		this.spaceSize = spaceSize;
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