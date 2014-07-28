package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the states database table.
 * 
 */
@Entity
@Table(name="states")
@NamedQuery(name="State.findAll", query="SELECT s FROM State s")
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="api_code")
	private Integer apiCode;

	@Column(name="di_state_id")
	private Integer diStateId;

	@Column(name="fips_code")
	private Integer fipsCode;

	@Column(name="has_fractional_ranges")
	private Boolean hasFractionalRanges;

	@Column(name="has_fractional_sections")
	private Boolean hasFractionalSections;

	@Column(name="has_fractional_townships")
	private Boolean hasFractionalTownships;

	@Column(name="mapping_enabled")
	private Boolean mappingEnabled;

	@Column(name="max_section_number")
	private Integer maxSectionNumber;

	private String name;

	@Column(name="primary_meridian_id")
	private Integer primaryMeridianId;

	@Column(name="search_enabled")
	private Boolean searchEnabled;

	//bi-directional many-to-one association to County
	@OneToMany(mappedBy="stateBean")
	private List<County> counties;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="state1")
	private List<Location> locations1;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="state2")
	private List<Location> locations2;

	//bi-directional many-to-one association to Meridian
	@OneToMany(mappedBy="state")
	private List<Meridian> meridians;

	//bi-directional many-to-one association to Township
	@OneToMany(mappedBy="state")
	private List<Township> townships;

	public State() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApiCode() {
		return this.apiCode;
	}

	public void setApiCode(Integer apiCode) {
		this.apiCode = apiCode;
	}

	public Integer getDiStateId() {
		return this.diStateId;
	}

	public void setDiStateId(Integer diStateId) {
		this.diStateId = diStateId;
	}

	public Integer getFipsCode() {
		return this.fipsCode;
	}

	public void setFipsCode(Integer fipsCode) {
		this.fipsCode = fipsCode;
	}

	public Boolean getHasFractionalRanges() {
		return this.hasFractionalRanges;
	}

	public void setHasFractionalRanges(Boolean hasFractionalRanges) {
		this.hasFractionalRanges = hasFractionalRanges;
	}

	public Boolean getHasFractionalSections() {
		return this.hasFractionalSections;
	}

	public void setHasFractionalSections(Boolean hasFractionalSections) {
		this.hasFractionalSections = hasFractionalSections;
	}

	public Boolean getHasFractionalTownships() {
		return this.hasFractionalTownships;
	}

	public void setHasFractionalTownships(Boolean hasFractionalTownships) {
		this.hasFractionalTownships = hasFractionalTownships;
	}

	public Boolean getMappingEnabled() {
		return this.mappingEnabled;
	}

	public void setMappingEnabled(Boolean mappingEnabled) {
		this.mappingEnabled = mappingEnabled;
	}

	public Integer getMaxSectionNumber() {
		return this.maxSectionNumber;
	}

	public void setMaxSectionNumber(Integer maxSectionNumber) {
		this.maxSectionNumber = maxSectionNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrimaryMeridianId() {
		return this.primaryMeridianId;
	}

	public void setPrimaryMeridianId(Integer primaryMeridianId) {
		this.primaryMeridianId = primaryMeridianId;
	}

	public Boolean getSearchEnabled() {
		return this.searchEnabled;
	}

	public void setSearchEnabled(Boolean searchEnabled) {
		this.searchEnabled = searchEnabled;
	}

	public List<County> getCounties() {
		return this.counties;
	}

	public void setCounties(List<County> counties) {
		this.counties = counties;
	}

	public County addCounty(County county) {
		getCounties().add(county);
		county.setStateBean(this);

		return county;
	}

	public County removeCounty(County county) {
		getCounties().remove(county);
		county.setStateBean(null);

		return county;
	}

	public List<Location> getLocations1() {
		return this.locations1;
	}

	public void setLocations1(List<Location> locations1) {
		this.locations1 = locations1;
	}

	public Location addLocations1(Location locations1) {
		getLocations1().add(locations1);
		locations1.setState1(this);

		return locations1;
	}

	public Location removeLocations1(Location locations1) {
		getLocations1().remove(locations1);
		locations1.setState1(null);

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
		locations2.setState2(this);

		return locations2;
	}

	public Location removeLocations2(Location locations2) {
		getLocations2().remove(locations2);
		locations2.setState2(null);

		return locations2;
	}

	public List<Meridian> getMeridians() {
		return this.meridians;
	}

	public void setMeridians(List<Meridian> meridians) {
		this.meridians = meridians;
	}

	public Meridian addMeridian(Meridian meridian) {
		getMeridians().add(meridian);
		meridian.setState(this);

		return meridian;
	}

	public Meridian removeMeridian(Meridian meridian) {
		getMeridians().remove(meridian);
		meridian.setState(null);

		return meridian;
	}

	public List<Township> getTownships() {
		return this.townships;
	}

	public void setTownships(List<Township> townships) {
		this.townships = townships;
	}

	public Township addTownship(Township township) {
		getTownships().add(township);
		township.setState(this);

		return township;
	}

	public Township removeTownship(Township township) {
		getTownships().remove(township);
		township.setState(null);

		return township;
	}

}