package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the document_categories database table.
 * 
 */
@Embeddable
public class DocumentCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="doc_id", insertable=false, updatable=false)
	private Integer docId;

	@Column(name="cat_id", insertable=false, updatable=false)
	private Integer catId;

	public DocumentCategoryPK() {
	}
	public Integer getDocId() {
		return this.docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public Integer getCatId() {
		return this.catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumentCategoryPK)) {
			return false;
		}
		DocumentCategoryPK castOther = (DocumentCategoryPK)other;
		return 
			this.docId.equals(castOther.docId)
			&& this.catId.equals(castOther.catId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.docId.hashCode();
		hash = hash * prime + this.catId.hashCode();
		
		return hash;
	}
}