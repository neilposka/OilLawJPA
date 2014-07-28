package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the aoi_group_locations database table.
 * 
 */
@Entity
@Table(name="aoi_group_locations")
@NamedQuery(name="AoiGroupLocation.findAll", query="SELECT a FROM AoiGroupLocation a")
public class AoiGroupLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String category;

	private String comment;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String name;

	private Integer offset;

	@Column(name="property_id")
	private String propertyId;

	@Column(name="record_id")
	private Integer recordId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to AoiGroup
	@ManyToOne
	@JoinColumn(name="aoi_group_id")
	private AoiGroup aoiGroup;

	//bi-directional many-to-one association to Location
	@ManyToOne
	private Location location;

	public AoiGroupLocation() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public String getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public AoiGroup getAoiGroup() {
		return this.aoiGroup;
	}

	public void setAoiGroup(AoiGroup aoiGroup) {
		this.aoiGroup = aoiGroup;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}