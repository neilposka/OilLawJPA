package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the source_image_mapping database table.
 * 
 */
@Entity
@Table(name="source_image_mapping")
@NamedQuery(name="SourceImageMapping.findAll", query="SELECT s FROM SourceImageMapping s")
public class SourceImageMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="source_no")
	private Integer sourceNo;

	@Column(name="included_in")
	private Integer includedIn;

	public SourceImageMapping() {
	}

	public Integer getSourceNo() {
		return this.sourceNo;
	}

	public void setSourceNo(Integer sourceNo) {
		this.sourceNo = sourceNo;
	}

	public Integer getIncludedIn() {
		return this.includedIn;
	}

	public void setIncludedIn(Integer includedIn) {
		this.includedIn = includedIn;
	}

}