package com.olrcorp.jpa.entities.synchronicity.justincase;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the nm_ocd_admin_orders database table.
 * 
 */
@Entity
@Table(name="nm_ocd_admin_orders")
@NamedQuery(name="NmOcdAdminOrder.findAll", query="SELECT n FROM NmOcdAdminOrder n")
public class NmOcdAdminOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="added_to_imagestore_at")
	private Timestamp addedToImagestoreAt;

	private String api;

	@Column(name="app_number")
	private String appNumber;

	private Long bytes;

	private String county;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="download_attempts")
	private Integer downloadAttempts;

	@Column(name="downloaded_at")
	private Timestamp downloadedAt;

	private String entity;

	private String filename;

	@Column(name="image_hash")
	private String imageHash;

	@Column(name="last_download_attempt_at")
	private Timestamp lastDownloadAttemptAt;

	@Column(name="last_image_added_on")
	private Timestamp lastImageAddedOn;

	private String operator;

	@Column(name="order_date")
	private Timestamp orderDate;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="original_image_url")
	private String originalImageUrl;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public NmOcdAdminOrder() {
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

	public String getAppNumber() {
		return this.appNumber;
	}

	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}

	public Long getBytes() {
		return this.bytes;
	}

	public void setBytes(Long bytes) {
		this.bytes = bytes;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
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

	public String getEntity() {
		return this.entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
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

	public Timestamp getLastImageAddedOn() {
		return this.lastImageAddedOn;
	}

	public void setLastImageAddedOn(Timestamp lastImageAddedOn) {
		this.lastImageAddedOn = lastImageAddedOn;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
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

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}