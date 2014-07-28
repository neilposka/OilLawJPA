package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the document_docket_types database table.
 * 
 */
@Entity
@Table(name="document_docket_types")
@NamedQuery(name="DocumentDocketType.findAll", query="SELECT d FROM DocumentDocketType d")
public class DocumentDocketType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String description;

	private String name;

	@Column(name="state_id")
	private Integer stateId;

	//bi-directional many-to-one association to Document
	@OneToMany(mappedBy="documentDocketType")
	private List<Document> documents;

	public DocumentDocketType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public List<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public Document addDocument(Document document) {
		getDocuments().add(document);
		document.setDocumentDocketType(this);

		return document;
	}

	public Document removeDocument(Document document) {
		getDocuments().remove(document);
		document.setDocumentDocketType(null);

		return document;
	}

}