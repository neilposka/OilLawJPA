package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the document_category_types database table.
 * 
 */
@Entity
@Table(name="document_category_types")
@NamedQuery(name="DocumentCategoryType.findAll", query="SELECT d FROM DocumentCategoryType d")
public class DocumentCategoryType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String description;

	@Column(name="document_type_id")
	private Integer documentTypeId;

	private String name;

	@Column(name="state_id")
	private Integer stateId;

	//bi-directional many-to-one association to DocumentCategory
	@OneToMany(mappedBy="documentCategoryType")
	private List<DocumentCategory> documentCategories;

	public DocumentCategoryType() {
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

	public Integer getDocumentTypeId() {
		return this.documentTypeId;
	}

	public void setDocumentTypeId(Integer documentTypeId) {
		this.documentTypeId = documentTypeId;
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

	public List<DocumentCategory> getDocumentCategories() {
		return this.documentCategories;
	}

	public void setDocumentCategories(List<DocumentCategory> documentCategories) {
		this.documentCategories = documentCategories;
	}

	public DocumentCategory addDocumentCategory(DocumentCategory documentCategory) {
		getDocumentCategories().add(documentCategory);
		documentCategory.setDocumentCategoryType(this);

		return documentCategory;
	}

	public DocumentCategory removeDocumentCategory(DocumentCategory documentCategory) {
		getDocumentCategories().remove(documentCategory);
		documentCategory.setDocumentCategoryType(null);

		return documentCategory;
	}

}