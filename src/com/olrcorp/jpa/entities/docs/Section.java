package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sections database table.
 * 
 */
@Entity
@Table(name="sections")
@NamedQuery(name="Section.findAll", query="SELECT s FROM Section s")
public class Section implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer section;

	//bi-directional many-to-one association to Township
	@ManyToOne
	private Township township;

	public Section() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSection() {
		return this.section;
	}

	public void setSection(Integer section) {
		this.section = section;
	}

	public Township getTownship() {
		return this.township;
	}

	public void setTownship(Township township) {
		this.township = township;
	}

}