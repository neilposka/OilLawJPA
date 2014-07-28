package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the document_images database table.
 * 
 */
@Entity
@Table(name="document_images")
@NamedQuery(name="DocumentImage.findAll", query="SELECT d FROM DocumentImage d")
public class DocumentImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer bytes;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String dir1;

	private String dir2;

	@Column(name="doc_id")
	private Integer docId;

	@Column(name="doc_type")
	private String docType;

	private String filename;

	private Integer hits;

	private String name;

	private String notes;

	private Integer pages;

	@Column(name="s3_content_length")
	private Long s3ContentLength;

	@Column(name="s3_content_type")
	private String s3ContentType;

	@Column(name="s3_etag")
	private String s3Etag;

	@Column(name="s3_key")
	private String s3Key;

	@Column(name="s3_last_modified")
	private Timestamp s3LastModified;

	private String server;

	private String share;

	@Column(name="sled_image_id")
	private Integer sledImageId;

	private String state;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	private String volume;

	public DocumentImage() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBytes() {
		return this.bytes;
	}

	public void setBytes(Integer bytes) {
		this.bytes = bytes;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDir1() {
		return this.dir1;
	}

	public void setDir1(String dir1) {
		this.dir1 = dir1;
	}

	public String getDir2() {
		return this.dir2;
	}

	public void setDir2(String dir2) {
		this.dir2 = dir2;
	}

	public Integer getDocId() {
		return this.docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Integer getHits() {
		return this.hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getPages() {
		return this.pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Long getS3ContentLength() {
		return this.s3ContentLength;
	}

	public void setS3ContentLength(Long s3ContentLength) {
		this.s3ContentLength = s3ContentLength;
	}

	public String getS3ContentType() {
		return this.s3ContentType;
	}

	public void setS3ContentType(String s3ContentType) {
		this.s3ContentType = s3ContentType;
	}

	public String getS3Etag() {
		return this.s3Etag;
	}

	public void setS3Etag(String s3Etag) {
		this.s3Etag = s3Etag;
	}

	public String getS3Key() {
		return this.s3Key;
	}

	public void setS3Key(String s3Key) {
		this.s3Key = s3Key;
	}

	public Timestamp getS3LastModified() {
		return this.s3LastModified;
	}

	public void setS3LastModified(Timestamp s3LastModified) {
		this.s3LastModified = s3LastModified;
	}

	public String getServer() {
		return this.server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getShare() {
		return this.share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public Integer getSledImageId() {
		return this.sledImageId;
	}

	public void setSledImageId(Integer sledImageId) {
		this.sledImageId = sledImageId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

}