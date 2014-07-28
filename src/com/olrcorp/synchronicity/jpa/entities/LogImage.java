package com.olrcorp.synchronicity.jpa.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the ok_occ_well_logs database table.
 * 
 */
@Entity
@Table(name="ok_occ_well_logs")
//@NamedQuery(name="OkOccWellLog.findAll", query="SELECT o FROM OkOccWellLog o")
public class LogImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="added_to_imagestore_at")
	private Timestamp addedToImagestoreAt;

	private String api;

	private Long bytes;

	private String company;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="depth_logger")
	private String depthLogger;

	@Column(name="download_attempts")
	private Integer downloadAttempts;

	@Column(name="downloaded_at")
	private Timestamp downloadedAt;

	private String filename;

	@Column(name="image_hash")
	private String imageHash;

	@Column(name="last_download_attempt_at")
	private Timestamp lastDownloadAttemptAt;

	private String location;

	@Column(name="log_type")
	private String logType;

	@Temporal(TemporalType.DATE)
	@Column(name="logged_on")
	private Date loggedOn;

	@Column(name="occ_image_id")
	private String occImageId;

	@Column(name="original_image_url")
	private String imageUrl;

	private String spot;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="well_name")
	private String wellName;

	public LogImage() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getAddedToImagestoreAt() {
		return this.addedToImagestoreAt;
	}

	public void setAddedToImagestoreAt(Timestamp addedToImagestoreAt) {
		this.addedToImagestoreAt = addedToImagestoreAt;
	}

	public String getApi() {
		return this.api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public Long getBytes() {
		return this.bytes;
	}

	public void setBytes(Long bytes) {
		this.bytes = bytes;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDepthLogger() {
		return this.depthLogger;
	}

	public void setDepthLogger(String depthLogger) {
		this.depthLogger = depthLogger;
	}

	public Integer getDownloadAttempts() {
		return this.downloadAttempts;
	}

	public void setDownloadAttempts(Integer downloadAttempts) {
		this.downloadAttempts = downloadAttempts;
	}

	public Timestamp getDownloadedAt() {
		return this.downloadedAt;
	}

	public void setDownloadedAt(Timestamp downloadedAt) {
		this.downloadedAt = downloadedAt;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getImageHash() {
		return this.imageHash;
	}

	public void setImageHash(String imageHash) {
		this.imageHash = imageHash;
	}

	public Timestamp getLastDownloadAttemptAt() {
		return this.lastDownloadAttemptAt;
	}

	public void setLastDownloadAttemptAt(Timestamp lastDownloadAttemptAt) {
		this.lastDownloadAttemptAt = lastDownloadAttemptAt;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public Date getLoggedOn() {
		return this.loggedOn;
	}

	public void setLoggedOn(Date loggedOn) {
		this.loggedOn = loggedOn;
	}

	public String getOccImageId() {
		return this.occImageId;
	}

	public void setOccImageId(String occImageId) {
		this.occImageId = occImageId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String originalImageUrl) {
		this.imageUrl = originalImageUrl;
	}

	public String getSpot() {
		return this.spot;
	}

	public void setSpot(String spot) {
		this.spot = spot;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getWellName() {
		return this.wellName;
	}

	public void setWellName(String wellName) {
		this.wellName = wellName;
	}

}