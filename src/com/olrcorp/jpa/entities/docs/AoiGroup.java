package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the aoi_groups database table.
 * 
 */
@Entity
@Table(name="aoi_groups")
@NamedQuery(name="AoiGroup.findAll", query="SELECT a FROM AoiGroup a")
public class AoiGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="last_report_at")
	private Timestamp lastReportAt;

	private String name;

	@Column(name="site_id")
	private Integer siteId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="user_id")
	private Integer userId;

	//bi-directional many-to-one association to AoiGroupLocation
	@OneToMany(mappedBy="aoiGroup")
	private List<AoiGroupLocation> aoiGroupLocations;

	public AoiGroup() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getLastReportAt() {
		return this.lastReportAt;
	}

	public void setLastReportAt(Timestamp lastReportAt) {
		this.lastReportAt = lastReportAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<AoiGroupLocation> getAoiGroupLocations() {
		return this.aoiGroupLocations;
	}

	public void setAoiGroupLocations(List<AoiGroupLocation> aoiGroupLocations) {
		this.aoiGroupLocations = aoiGroupLocations;
	}

	public AoiGroupLocation addAoiGroupLocation(AoiGroupLocation aoiGroupLocation) {
		getAoiGroupLocations().add(aoiGroupLocation);
		aoiGroupLocation.setAoiGroup(this);

		return aoiGroupLocation;
	}

	public AoiGroupLocation removeAoiGroupLocation(AoiGroupLocation aoiGroupLocation) {
		getAoiGroupLocations().remove(aoiGroupLocation);
		aoiGroupLocation.setAoiGroup(null);

		return aoiGroupLocation;
	}

}