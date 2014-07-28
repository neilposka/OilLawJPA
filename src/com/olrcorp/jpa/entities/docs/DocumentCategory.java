package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the document_categories database table.
 * 
 */
@Entity
@Table(name="document_categories")
@NamedQuery(name="DocumentCategory.findAll", query="SELECT d FROM DocumentCategory d")
public class DocumentCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumentCategoryPK documentPK;

	@Column(name="created_at")
	private Timestamp createdAt;

	private Integer id;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to DocumentCategoryType
	@ManyToOne
	@JoinColumn(name="cat_id")
	private DocumentCategoryType documentCategoryType;

	//bi-directional many-to-one association to Document
	@ManyToOne
	@JoinColumn(name="doc_id")
	private Document document;

	public DocumentCategory() {
	}

	public DocumentCategoryPK getDocumentPK() {
		return this.documentPK;
	}

	public void setId(DocumentCategoryPK id) {
		this.documentPK = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public DocumentCategoryType getDocumentCategoryType() {
		return this.documentCategoryType;
	}

	public void setDocumentCategoryType(DocumentCategoryType documentCategoryType) {
		this.documentCategoryType = documentCategoryType;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}