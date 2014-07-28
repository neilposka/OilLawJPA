package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the meridians database table.
 * 
 */
@Entity
@Table(name="meridians")
@NamedQuery(name="Meridian.findAll", query="SELECT m FROM Meridian m")
public class Meridian implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String display;

	@Column(name="east_max")
	private BigDecimal eastMax;

	@Column(name="east_min")
	private BigDecimal eastMin;

	private String name;

	@Column(name="north_max")
	private BigDecimal northMax;

	@Column(name="north_min")
	private BigDecimal northMin;

	@Column(name="sort_by")
	private Integer sortBy;

	@Column(name="south_max")
	private BigDecimal southMax;

	@Column(name="south_min")
	private BigDecimal southMin;

	private Integer tdg;

	private Integer usgs95;

	private Integer usgs98;

	@Column(name="west_max")
	private BigDecimal westMax;

	@Column(name="west_min")
	private BigDecimal westMin;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="meridian1")
	private List<Location> locations1;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="meridian2")
	private List<Location> locations2;

	//bi-directional many-to-one association to State
	@ManyToOne
	private State state;

	//bi-directional many-to-one association to Township
	@OneToMany(mappedBy="meridian")
	private List<Township> townships;

	public Meridian() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDisplay() {
		return this.display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public BigDecimal getEastMax() {
		return this.eastMax;
	}

	public void setEastMax(BigDecimal eastMax) {
		this.eastMax = eastMax;
	}

	public BigDecimal getEastMin() {
		return this.eastMin;
	}

	public void setEastMin(BigDecimal eastMin) {
		this.eastMin = eastMin;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNorthMax() {
		return this.northMax;
	}

	public void setNorthMax(BigDecimal northMax) {
		this.northMax = northMax;
	}

	public BigDecimal getNorthMin() {
		return this.northMin;
	}

	public void setNorthMin(BigDecimal northMin) {
		this.northMin = northMin;
	}

	public Integer getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(Integer sortBy) {
		this.sortBy = sortBy;
	}

	public BigDecimal getSouthMax() {
		return this.southMax;
	}

	public void setSouthMax(BigDecimal southMax) {
		this.southMax = southMax;
	}

	public BigDecimal getSouthMin() {
		return this.southMin;
	}

	public void setSouthMin(BigDecimal southMin) {
		this.southMin = southMin;
	}

	public Integer getTdg() {
		return this.tdg;
	}

	public void setTdg(Integer tdg) {
		this.tdg = tdg;
	}

	public Integer getUsgs95() {
		return this.usgs95;
	}

	public void setUsgs95(Integer usgs95) {
		this.usgs95 = usgs95;
	}

	public Integer getUsgs98() {
		return this.usgs98;
	}

	public void setUsgs98(Integer usgs98) {
		this.usgs98 = usgs98;
	}

	public BigDecimal getWestMax() {
		return this.westMax;
	}

	public void setWestMax(BigDecimal westMax) {
		this.westMax = westMax;
	}

	public BigDecimal getWestMin() {
		return this.westMin;
	}

	public void setWestMin(BigDecimal westMin) {
		this.westMin = westMin;
	}

	public List<Location> getLocations1() {
		return this.locations1;
	}

	public void setLocations1(List<Location> locations1) {
		this.locations1 = locations1;
	}

	public Location addLocations1(Location locations1) {
		getLocations1().add(locations1);
		locations1.setMeridian1(this);

		return locations1;
	}

	public Location removeLocations1(Location locations1) {
		getLocations1().remove(locations1);
		locations1.setMeridian1(null);

		return locations1;
	}

	public List<Location> getLocations2() {
		return this.locations2;
	}

	public void setLocations2(List<Location> locations2) {
		this.locations2 = locations2;
	}

	public Location addLocations2(Location locations2) {
		getLocations2().add(locations2);
		locations2.setMeridian2(this);

		return locations2;
	}

	public Location removeLocations2(Location locations2) {
		getLocations2().remove(locations2);
		locations2.setMeridian2(null);

		return locations2;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<Township> getTownships() {
		return this.townships;
	}

	public void setTownships(List<Township> townships) {
		this.townships = townships;
	}

	public Township addTownship(Township township) {
		getTownships().add(township);
		township.setMeridian(this);

		return township;
	}

	public Township removeTownship(Township township) {
		getTownships().remove(township);
		township.setMeridian(null);

		return township;
	}

}