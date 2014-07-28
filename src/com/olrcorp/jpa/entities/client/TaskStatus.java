package com.olrcorp.jpa.entities.client;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the task_status database table.
 * 
 */
@Entity
@Table(name="task_status")
@NamedQuery(name="TaskStatus.findAll", query="SELECT t FROM TaskStatus t")
public class TaskStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String description;

	@Column(name="display_as")
	private String displayAs;

	private String name;

	public TaskStatus() {
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

	public String getDisplayAs() {
		return this.displayAs;
	}

	public void setDisplayAs(String displayAs) {
		this.displayAs = displayAs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}