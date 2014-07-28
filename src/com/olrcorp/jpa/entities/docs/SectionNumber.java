package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the section_numbers database table.
 * 
 */
@Entity
@Table(name="section_numbers")
@NamedQuery(name="SectionNumber.findAll", query="SELECT s FROM SectionNumber s")
public class SectionNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer section;

	public SectionNumber() {
	}

	public Integer getSection() {
		return this.section;
	}

	public void setSection(Integer section) {
		this.section = section;
	}

}