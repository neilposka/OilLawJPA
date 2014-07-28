package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the counties database table.
 * 
 */
@Entity
@Table(name="counties")
@NamedQuery(name="County.findAll", query="SELECT c FROM County c")
public class County implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="api_code")
	private Integer apiCode;

	@Column(name="fips_code")
	private Integer fipsCode;

	@Column(name="meridian_id")
	private Integer meridianId;

	private String name;

	private String state;

	//bi-directional many-to-one association to State
	@ManyToOne
	@JoinColumn(name="state_id")
	private State stateBean;

	//bi-directional many-to-one association to DocumentLocation
	@OneToMany(mappedBy="county")
	private List<DocumentLocation> documentLocations;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="countyBean")
	private List<Location> locations;

	//bi-directional many-to-one association to SourceLocation
	@OneToMany(mappedBy="county")
	private List<SourceLocation> sourceLocations;

	public County() {
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

	public Integer getFipsCode() {
		return this.fipsCode;
	}

	public void setFipsCode(Integer fipsCode) {
		this.fipsCode = fipsCode;
	}

	public Integer getMeridianId() {
		return this.meridianId;
	}

	public void setMeridianId(Integer meridianId) {
		this.meridianId = meridianId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public State getStateBean() {
		return this.stateBean;
	}

	public void setStateBean(State stateBean) {
		this.stateBean = stateBean;
	}

	public List<DocumentLocation> getDocumentLocations() {
		return this.documentLocations;
	}

	public void setDocumentLocations(List<DocumentLocation> documentLocations) {
		this.documentLocations = documentLocations;
	}

	public DocumentLocation addDocumentLocation(DocumentLocation documentLocation) {
		getDocumentLocations().add(documentLocation);
		documentLocation.setCounty(this);

		return documentLocation;
	}

	public DocumentLocation removeDocumentLocation(DocumentLocation documentLocation) {
		getDocumentLocations().remove(documentLocation);
		documentLocation.setCounty(null);

		return documentLocation;
	}

	public List<Location> getLocations() {
		return this.locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public Location addLocation(Location location) {
		getLocations().add(location);
		location.setCountyBean(this);

		return location;
	}

	public Location removeLocation(Location location) {
		getLocations().remove(location);
		location.setCountyBean(null);

		return location;
	}

	public List<SourceLocation> getSourceLocations() {
		return this.sourceLocations;
	}

	public void setSourceLocations(List<SourceLocation> sourceLocations) {
		this.sourceLocations = sourceLocations;
	}

	public SourceLocation addSourceLocation(SourceLocation sourceLocation) {
		getSourceLocations().add(sourceLocation);
		sourceLocation.setCounty(this);

		return sourceLocation;
	}

	public SourceLocation removeSourceLocation(SourceLocation sourceLocation) {
		getSourceLocations().remove(sourceLocation);
		sourceLocation.setCounty(null);

		return sourceLocation;
	}

}