package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the document_drilling database table.
 * 
 */
@Entity
@Table(name="document_drilling")
@NamedQuery(name="DocumentDrilling.findAll", query="SELECT d FROM DocumentDrilling d")
public class DocumentDrilling implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String api;

	@Column(name="api_number")
	private String apiNumber;

	@Column(name="api_state")
	private String apiState;

	@Column(name="api_suffix")
	private String apiSuffix;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="footing_e_or_w")
	private String footingEOrW;

	@Column(name="footing_ew")
	private Integer footingEw;

	@Column(name="footing_n_or_s")
	private String footingNOrS;

	@Column(name="footing_ns")
	private Integer footingNs;

	@Column(name="gis_id")
	private Integer gisId;

	private double latitude;

	private double longitude;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="well_name")
	private String wellName;

	@Column(name="well_number")
	private String wellNumber;

	//bi-directional many-to-one association to Document
	@ManyToOne
	@JoinColumn(name="doc_id")
	private Document document;

	public DocumentDrilling() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApi() {
		return this.api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getApiNumber() {
		return this.apiNumber;
	}

	public void setApiNumber(String apiNumber) {
		this.apiNumber = apiNumber;
	}

	public String getApiState() {
		return this.apiState;
	}

	public void setApiState(String apiState) {
		this.apiState = apiState;
	}

	public String getApiSuffix() {
		return this.apiSuffix;
	}

	public void setApiSuffix(String apiSuffix) {
		this.apiSuffix = apiSuffix;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getFootingEOrW() {
		return this.footingEOrW;
	}

	public void setFootingEOrW(String footingEOrW) {
		this.footingEOrW = footingEOrW;
	}

	public Integer getFootingEw() {
		return this.footingEw;
	}

	public void setFootingEw(Integer footingEw) {
		this.footingEw = footingEw;
	}

	public String getFootingNOrS() {
		return this.footingNOrS;
	}

	public void setFootingNOrS(String footingNOrS) {
		this.footingNOrS = footingNOrS;
	}

	public Integer getFootingNs() {
		return this.footingNs;
	}

	public void setFootingNs(Integer footingNs) {
		this.footingNs = footingNs;
	}

	public Integer getGisId() {
		return this.gisId;
	}

	public void setGisId(Integer gisId) {
		this.gisId = gisId;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
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

	public String getWellNumber() {
		return this.wellNumber;
	}

	public void setWellNumber(String wellNumber) {
		this.wellNumber = wellNumber;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}