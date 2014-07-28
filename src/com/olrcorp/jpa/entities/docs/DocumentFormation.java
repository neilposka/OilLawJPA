package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the document_formations database table.
 * 
 */
@Entity
@Table(name="document_formations")
@NamedQuery(name="DocumentFormation.findAll", query="SELECT d FROM DocumentFormation d")
public class DocumentFormation implements Serializable {
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

	private String description;

	private String name;

	private String orientation;

	@Column(name="pool_id")
	private Integer poolId;

	@Column(name="product_code")
	private String productCode;

	@Column(name="section_calls")
	private String sectionCalls;

	private Integer size;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Document
	@ManyToOne
	@JoinColumn(name="doc_id")
	private Document document;

	//bi-directional many-to-one association to Location
	@ManyToOne
	private Location location;

	public DocumentFormation() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}