package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the townships database table.
 * 
 */
@Entity
@Table(name="townships")
@NamedQuery(name="Township.findAll", query="SELECT t FROM Township t")
public class Township implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String notes;

	@Column(name="range_direction")
	private String rangeDirection;

	@Column(name="range_number")
	private BigDecimal rangeNumber;

	@Column(name="township_direction")
	private String townshipDirection;

	@Column(name="township_number")
	private BigDecimal townshipNumber;

	//bi-directional many-to-one association to Section
	@OneToMany(mappedBy="township")
	private List<Section> sections;

	//bi-directional many-to-one association to Meridian
	@ManyToOne
	private Meridian meridian;

	//bi-directional many-to-one association to State
	@ManyToOne
	private State state;

	public Township() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getRangeDirection() {
		return this.rangeDirection;
	}

	public void setRangeDirection(String rangeDirection) {
		this.rangeDirection = rangeDirection;
	}

	public BigDecimal getRangeNumber() {
		return this.rangeNumber;
	}

	public void setRangeNumber(BigDecimal rangeNumber) {
		this.rangeNumber = rangeNumber;
	}

	public String getTownshipDirection() {
		return this.townshipDirection;
	}

	public void setTownshipDirection(String townshipDirection) {
		this.townshipDirection = townshipDirection;
	}

	public BigDecimal getTownshipNumber() {
		return this.townshipNumber;
	}

	public void setTownshipNumber(BigDecimal townshipNumber) {
		this.townshipNumber = townshipNumber;
	}

	public List<Section> getSections() {
		return this.sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public Section addSection(Section section) {
		getSections().add(section);
		section.setTownship(this);

		return section;
	}

	public Section removeSection(Section section) {
		getSections().remove(section);
		section.setTownship(null);

		return section;
	}

	public Meridian getMeridian() {
		return this.meridian;
	}

	public void setMeridian(Meridian meridian) {
		this.meridian = meridian;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

}