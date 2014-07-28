package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the data_sources database table.
 * 
 */
@Entity
@Table(name="data_sources")
@NamedQuery(name="DataSource.findAll", query="SELECT d FROM DataSource d")
public class DataSource implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="display_as")
	private String displayAs;

	private Integer id;

	private String name;

	public DataSource() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayAs() {
		return this.displayAs;
	}

	public void setDisplayAs(String displayAs) {
		this.displayAs = displayAs;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}