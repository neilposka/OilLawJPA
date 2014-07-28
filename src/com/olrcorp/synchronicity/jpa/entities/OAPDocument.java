package com.olrcorp.synchronicity.jpa.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the ok_occ_oap database table.
 * 
 */
@Entity
@Table(name="ok_occ_oap")
//@NamedQuery(name="OkOccOap.findAll", query="SELECT o FROM OkOccOap o")
public class OAPDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="added_to_imagestore_at")
	private Timestamp addedToImagestoreAt;

	private Long bytes;

	@Column(name="case_number")
	private String caseNumber;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String docket;

	@Column(name="download_attempts")
	private Integer downloadAttempts;

	@Column(name="downloaded_at")
	private Timestamp downloadedAt;

	@Column(name="existed_at")
	private Timestamp existedAt;

	@Temporal(TemporalType.DATE)
	@Column(name="filed_on")
	private Date filedOn;

	private String filename;

	@Column(name="filing_type")
	private String filingType;

	@Column(name="image_hash")
	private String imageHash;

	@Column(name="last_download_attempt_at")
	private Timestamp lastDownloadAttemptAt;

	@Column(name="occ_image_id")
	private String occImageId;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="original_image_url")
	private String originalImageUrl;

	@Temporal(TemporalType.DATE)
	@Column(name="scanned_on")
	private Date scannedOn;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public OAPDocument() {
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

	public Long getBytes() {
		return this.bytes;
	}

	public void setBytes(Long bytes) {
		this.bytes = bytes;
	}

	public String getCaseNumber() {
		return this.caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDocket() {
		return this.docket;
	}

	public void setDocket(String docket) {
		this.docket = docket;
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

	public Timestamp getExistedAt() {
		return this.existedAt;
	}

	public void setExistedAt(Timestamp existedAt) {
		this.existedAt = existedAt;
	}

	public Date getFiledOn() {
		return this.filedOn;
	}

	public void setFiledOn(Date filedOn) {
		this.filedOn = filedOn;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilingType() {
		return this.filingType;
	}

	public void setFilingType(String filingType) {
		this.filingType = filingType;
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

	public String getOccImageId() {
		return this.occImageId;
	}

	public void setOccImageId(String occImageId) {
		this.occImageId = occImageId;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

}