package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the source_images database table.
 * 
 */
@Entity
@Table(name="source_images")
@NamedQuery(name="SourceImage.findAll", query="SELECT s FROM SourceImage s")
public class SourceImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String filename;

	@Column(name="included_in_source_no")
	private String includedInSourceNo;

	@Column(name="source_no")
	private String sourceNo;

	public SourceImage() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getIncludedInSourceNo() {
		return this.includedInSourceNo;
	}

	public void setIncludedInSourceNo(String includedInSourceNo) {
		this.includedInSourceNo = includedInSourceNo;
	}

	public String getSourceNo() {
		return this.sourceNo;
	}

	public void setSourceNo(String sourceNo) {
		this.sourceNo = sourceNo;
	}

}