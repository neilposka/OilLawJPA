package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the category_mapping database table.
 * 
 */
@Entity
@Table(name="category_mapping")
@NamedQuery(name="CategoryMapping.findAll", query="SELECT c FROM CategoryMapping c")
public class CategoryMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="new_cat_id")
	private Integer newCatId;

	@Column(name="old_cat_id")
	private Integer oldCatId;

	public CategoryMapping() {
	}

	public Integer getNewCatId() {
		return this.newCatId;
	}

	public void setNewCatId(Integer newCatId) {
		this.newCatId = newCatId;
	}

	public Integer getOldCatId() {
		return this.oldCatId;
	}

	public void setOldCatId(Integer oldCatId) {
		this.oldCatId = oldCatId;
	}

}