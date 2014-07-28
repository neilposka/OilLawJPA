package com.olrcorp.jpa.entities.synchronicity.justincase;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the ok_occ_well_forms database table.
 * 
 */
@Entity
@Table(name="ok_occ_well_forms")
@NamedQuery(name="OkOccWellForm.findAll", query="SELECT o FROM OkOccWellForm o")
public class OkOccWellForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="added_to_imagestore_at")
	private Timestamp addedToImagestoreAt;

	private String api;

	private Long bytes;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="download_attempts")
	private Integer downloadAttempts;

	@Column(name="downloaded_at")
	private Timestamp downloadedAt;

	@Temporal(TemporalType.DATE)
	@Column(name="effective_on")
	private Date effectiveOn;

	private String filename;

	private String form;

	@Column(name="image_hash")
	private String imageHash;

	@Column(name="last_download_attempt_at")
	private Timestamp lastDownloadAttemptAt;

	private String location;

	@Column(name="occ_image_id")
	private String occImageId;

	@Column(name="operator_number")
	private String operatorNumber;

	@Column(name="original_image_url")
	private String originalImageUrl;

	@Temporal(TemporalType.DATE)
	@Column(name="scanned_on")
	private Date scannedOn;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="well_name")
	private String wellName;

	public OkOccWellForm() {
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

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
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

	public Date getEffectiveOn() {
		return this.effectiveOn;
	}

	public void setEffectiveOn(Date effectiveOn) {
		this.effectiveOn = effectiveOn;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getForm() {
		return this.form;
	}

	public void setForm(String form) {
		this.form = form;
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

	public String getOccImageId() {
		return this.occImageId;
	}

	public void setOccImageId(String occImageId) {
		this.occImageId = occImageId;
	}

	public String getOperatorNumber() {
		return this.operatorNumber;
	}

	public void setOperatorNumber(String operatorNumber) {
		this.operatorNumber = operatorNumber;
	}

	public String getOriginalImageUrl() {
		return this.originalImageUrl;
	}

	public void setOriginalImageUrl(String originalImageUrl) {
		this.originalImageUrl = originalImageUrl;
	}

	public Date getScannedOn() {
		return this.scannedOn;
	}

	public void setScannedOn(Date scannedOn) {
		this.scannedOn = scannedOn;
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