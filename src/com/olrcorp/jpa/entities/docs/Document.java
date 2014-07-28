package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the documents database table.
 * 
 */
@Entity
@Table(name="documents")
@NamedQuery(name="Document.findAll", query="SELECT d FROM Document d")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String applicant;

	private String attorney;

	@Column(name="children_updated_at")
	private Timestamp childrenUpdatedAt;

	private String contact;

	@Column(name="created_at")
	private Timestamp createdAt;

	private Object data;

	@Temporal(TemporalType.DATE)
	private Date date1;

	@Temporal(TemporalType.DATE)
	private Date date2;

	@Column(name="date2_type")
	private Integer date2Type;

	@Column(name="docket_no")
	private String docketNo;

	@Column(name="major_update_at")
	private Timestamp majorUpdateAt;

	private String name;

	private String notes;

	@Column(name="notes_internal")
	private String notesInternal;

	@Column(name="olrdoc_id")
	private Integer olrdocId;

	private String params;

	@Column(name="sled_id")
	private Integer sledId;

	private String state;

	@Column(name="status_id")
	private Integer statusId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to DocumentCategory
	@OneToMany(mappedBy="document")
	private List<DocumentCategory> documentCategories;

	//bi-directional many-to-one association to DocumentDate
	@OneToMany(mappedBy="document")
	private List<DocumentDate> documentDates;

	//bi-directional many-to-one association to DocumentDrilling
	@OneToMany(mappedBy="document")
	private List<DocumentDrilling> documentDrillings;

	//bi-directional many-to-one association to DocumentFormation
	@OneToMany(mappedBy="document")
	private List<DocumentFormation> documentFormations;

	//bi-directional many-to-one association to DocumentLegal
	@OneToMany(mappedBy="document")
	private List<DocumentLegal> documentLegals;

	//bi-directional many-to-one association to DocumentLocation
	@OneToMany(mappedBy="document")
	private List<DocumentLocation> documentLocations;

	//bi-directional many-to-one association to DocumentSpacing
	@OneToMany(mappedBy="document")
	private List<DocumentSpacing> documentSpacings;

	//bi-directional many-to-one association to DocumentDateType
	@ManyToOne
	@JoinColumn(name="date1_type")
	private DocumentDateType documentDateType;

	//bi-directional many-to-one association to DocumentDocketType
	@ManyToOne
	@JoinColumn(name="docket_id")
	private DocumentDocketType documentDocketType;

	//bi-directional many-to-one association to DocumentType
	@ManyToOne
	@JoinColumn(name="type_id")
	private DocumentType documentType;

	public Document() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApplicant() {
		return this.applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getAttorney() {
		return this.attorney;
	}

	public void setAttorney(String attorney) {
		this.attorney = attorney;
	}

	public Timestamp getChildrenUpdatedAt() {
		return this.childrenUpdatedAt;
	}

	public void setChildrenUpdatedAt(Timestamp childrenUpdatedAt) {
		this.childrenUpdatedAt = childrenUpdatedAt;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Date getDate1() {
		return this.date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Date getDate2() {
		return this.date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public Integer getDate2Type() {
		return this.date2Type;
	}

	public void setDate2Type(Integer date2Type) {
		this.date2Type = date2Type;
	}

	public String getDocketNo() {
		return this.docketNo;
	}

	public void setDocketNo(String docketNo) {
		this.docketNo = docketNo;
	}

	public Timestamp getMajorUpdateAt() {
		return this.majorUpdateAt;
	}

	public void setMajorUpdateAt(Timestamp majorUpdateAt) {
		this.majorUpdateAt = majorUpdateAt;
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

	public String getNotesInternal() {
		return this.notesInternal;
	}

	public void setNotesInternal(String notesInternal) {
		this.notesInternal = notesInternal;
	}

	public Integer getOlrdocId() {
		return this.olrdocId;
	}

	public void setOlrdocId(Integer olrdocId) {
		this.olrdocId = olrdocId;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Integer getSledId() {
		return this.sledId;
	}

	public void setSledId(Integer sledId) {
		this.sledId = sledId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<DocumentCategory> getDocumentCategories() {
		return this.documentCategories;
	}

	public void setDocumentCategories(List<DocumentCategory> documentCategories) {
		this.documentCategories = documentCategories;
	}

	public DocumentCategory addDocumentCategory(DocumentCategory documentCategory) {
		getDocumentCategories().add(documentCategory);
		documentCategory.setDocument(this);

		return documentCategory;
	}

	public DocumentCategory removeDocumentCategory(DocumentCategory documentCategory) {
		getDocumentCategories().remove(documentCategory);
		documentCategory.setDocument(null);

		return documentCategory;
	}

	public List<DocumentDate> getDocumentDates() {
		return this.documentDates;
	}

	public void setDocumentDates(List<DocumentDate> documentDates) {
		this.documentDates = documentDates;
	}

	public DocumentDate addDocumentDate(DocumentDate documentDate) {
		getDocumentDates().add(documentDate);
		documentDate.setDocument(this);

		return documentDate;
	}

	public DocumentDate removeDocumentDate(DocumentDate documentDate) {
		getDocumentDates().remove(documentDate);
		documentDate.setDocument(null);

		return documentDate;
	}

	public List<DocumentDrilling> getDocumentDrillings() {
		return this.documentDrillings;
	}

	public void setDocumentDrillings(List<DocumentDrilling> documentDrillings) {
		this.documentDrillings = documentDrillings;
	}

	public DocumentDrilling addDocumentDrilling(DocumentDrilling documentDrilling) {
		getDocumentDrillings().add(documentDrilling);
		documentDrilling.setDocument(this);

		return documentDrilling;
	}

	public DocumentDrilling removeDocumentDrilling(DocumentDrilling documentDrilling) {
		getDocumentDrillings().remove(documentDrilling);
		documentDrilling.setDocument(null);

		return documentDrilling;
	}

	public List<DocumentFormation> getDocumentFormations() {
		return this.documentFormations;
	}

	public void setDocumentFormations(List<DocumentFormation> documentFormations) {
		this.documentFormations = documentFormations;
	}

	public DocumentFormation addDocumentFormation(DocumentFormation documentFormation) {
		getDocumentFormations().add(documentFormation);
		documentFormation.setDocument(this);

		return documentFormation;
	}

	public DocumentFormation removeDocumentFormation(DocumentFormation documentFormation) {
		getDocumentFormations().remove(documentFormation);
		documentFormation.setDocument(null);

		return documentFormation;
	}

	public List<DocumentLegal> getDocumentLegals() {
		return this.documentLegals;
	}

	public void setDocumentLegals(List<DocumentLegal> documentLegals) {
		this.documentLegals = documentLegals;
	}

	public DocumentLegal addDocumentLegal(DocumentLegal documentLegal) {
		getDocumentLegals().add(documentLegal);
		documentLegal.setDocument(this);

		return documentLegal;
	}

	public DocumentLegal removeDocumentLegal(DocumentLegal documentLegal) {
		getDocumentLegals().remove(documentLegal);
		documentLegal.setDocument(null);

		return documentLegal;
	}

	public List<DocumentLocation> getDocumentLocations() {
		return this.documentLocations;
	}

	public void setDocumentLocations(List<DocumentLocation> documentLocations) {
		this.documentLocations = documentLocations;
	}

	public DocumentLocation addDocumentLocation(DocumentLocation documentLocation) {
		getDocumentLocations().add(documentLocation);
		documentLocation.setDocument(this);

		return documentLocation;
	}

	public DocumentLocation removeDocumentLocation(DocumentLocation documentLocation) {
		getDocumentLocations().remove(documentLocation);
		documentLocation.setDocument(null);

		return documentLocation;
	}

	public List<DocumentSpacing> getDocumentSpacings() {
		return this.documentSpacings;
	}

	public void setDocumentSpacings(List<DocumentSpacing> documentSpacings) {
		this.documentSpacings = documentSpacings;
	}

	public DocumentSpacing addDocumentSpacing(DocumentSpacing documentSpacing) {
		getDocumentSpacings().add(documentSpacing);
		documentSpacing.setDocument(this);

		return documentSpacing;
	}

	public DocumentSpacing removeDocumentSpacing(DocumentSpacing documentSpacing) {
		getDocumentSpacings().remove(documentSpacing);
		documentSpacing.setDocument(null);

		return documentSpacing;
	}

	public DocumentDateType getDocumentDateType() {
		return this.documentDateType;
	}

	public void setDocumentDateType(DocumentDateType documentDateType) {
		this.documentDateType = documentDateType;
	}

	public DocumentDocketType getDocumentDocketType() {
		return this.documentDocketType;
	}

	public void setDocumentDocketType(DocumentDocketType documentDocketType) {
		this.documentDocketType = documentDocketType;
	}

	public DocumentType getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

}