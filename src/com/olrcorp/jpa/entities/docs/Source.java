package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sources database table.
 * 
 */
@Entity
@Table(name="sources")
@NamedQuery(name="Source.findAll", query="SELECT s FROM Source s")
public class Source implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="source_no")
	private String sourceNo;

	private String spacing;

	//bi-directional many-to-one association to SourceLocation
	@OneToMany(mappedBy="source")
	private List<SourceLocation> sourceLocations;

	public Source() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSourceNo() {
		return this.sourceNo;
	}

	public void setSourceNo(String sourceNo) {
		this.sourceNo = sourceNo;
	}

	public String getSpacing() {
		return this.spacing;
	}

	public void setSpacing(String spacing) {
		this.spacing = spacing;
	}

	public List<SourceLocation> getSourceLocations() {
		return this.sourceLocations;
	}

	public void setSourceLocations(List<SourceLocation> sourceLocations) {
		this.sourceLocations = sourceLocations;
	}

	public SourceLocation addSourceLocation(SourceLocation sourceLocation) {
		getSourceLocations().add(sourceLocation);
		sourceLocation.setSource(this);

		return sourceLocation;
	}

	public SourceLocation removeSourceLocation(SourceLocation sourceLocation) {
		getSourceLocations().remove(sourceLocation);
		sourceLocation.setSource(null);

		return sourceLocation;
	}

}