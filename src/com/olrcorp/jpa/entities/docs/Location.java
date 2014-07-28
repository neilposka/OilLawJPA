package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name="locations")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String county;

	private String coverage;

	private Object geom;

	private double lat;

	private String location;

	private double lon;

	private String notes;

	@Column(name="range_direction")
	private String rangeDirection;

	@Column(name="range_number")
	private BigDecimal rangeNumber;

	private Integer section;

	@Column(name="township_direction")
	private String townshipDirection;

	@Column(name="township_number")
	private BigDecimal townshipNumber;

	//bi-directional many-to-one association to AoiGroupLocation
	@OneToMany(mappedBy="location")
	private List<AoiGroupLocation> aoiGroupLocations;

	//bi-directional many-to-one association to DocumentFormation
	@OneToMany(mappedBy="location")
	private List<DocumentFormation> documentFormations;

	//bi-directional many-to-one association to DocumentLocation
	@OneToMany(mappedBy="location")
	private List<DocumentLocation> documentLocations;

	//bi-directional many-to-one association to County
	@ManyToOne
	@JoinColumn(name="county_id")
	private County countyBean;

	//bi-directional many-to-one association to Meridian
	@ManyToOne
	@JoinColumn(name="meridian_id")
	private Meridian meridian1;

	//bi-directional many-to-one association to Meridian
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="meridian", referencedColumnName="abbreviation"),
		@JoinColumn(name="state_id", referencedColumnName="state_id")
		})
	private Meridian meridian2;

	//bi-directional many-to-one association to State
	@ManyToOne
	@JoinColumn(name="state", referencedColumnName="abbreviation")
	private State state1;

	//bi-directional many-to-one association to State
	@ManyToOne
	@JoinColumn(name="state_id")
	private State state2;

	//bi-directional many-to-one association to SourceLocation
	@OneToMany(mappedBy="location")
	private List<SourceLocation> sourceLocations;

	public Location() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCoverage() {
		return this.coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public Object getGeom() {
		return this.geom;
	}

	public void setGeom(Object geom) {
		this.geom = geom;
	}

	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getLon() {
		return this.lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
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

	public Integer getSection() {
		return this.section;
	}

	public void setSection(Integer section) {
		this.section = section;
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

	public List<AoiGroupLocation> getAoiGroupLocations() {
		return this.aoiGroupLocations;
	}

	public void setAoiGroupLocations(List<AoiGroupLocation> aoiGroupLocations) {
		this.aoiGroupLocations = aoiGroupLocations;
	}

	public AoiGroupLocation addAoiGroupLocation(AoiGroupLocation aoiGroupLocation) {
		getAoiGroupLocations().add(aoiGroupLocation);
		aoiGroupLocation.setLocation(this);

		return aoiGroupLocation;
	}

	public AoiGroupLocation removeAoiGroupLocation(AoiGroupLocation aoiGroupLocation) {
		getAoiGroupLocations().remove(aoiGroupLocation);
		aoiGroupLocation.setLocation(null);

		return aoiGroupLocation;
	}

	public List<DocumentFormation> getDocumentFormations() {
		return this.documentFormations;
	}

	public void setDocumentFormations(List<DocumentFormation> documentFormations) {
		this.documentFormations = documentFormations;
	}

	public DocumentFormation addDocumentFormation(DocumentFormation documentFormation) {
		getDocumentFormations().add(documentFormation);
		documentFormation.setLocation(this);

		return documentFormation;
	}

	public DocumentFormation removeDocumentFormation(DocumentFormation documentFormation) {
		getDocumentFormations().remove(documentFormation);
		documentFormation.setLocation(null);

		return documentFormation;
	}

	public List<DocumentLocation> getDocumentLocations() {
		return this.documentLocations;
	}

	public void setDocumentLocations(List<DocumentLocation> documentLocations) {
		this.documentLocations = documentLocations;
	}

	public DocumentLocation addDocumentLocation(DocumentLocation documentLocation) {
		getDocumentLocations().add(documentLocation);
		documentLocation.setLocation(this);

		return documentLocation;
	}

	public DocumentLocation removeDocumentLocation(DocumentLocation documentLocation) {
		getDocumentLocations().remove(documentLocation);
		documentLocation.setLocation(null);

		return documentLocation;
	}

	public County getCountyBean() {
		return this.countyBean;
	}

	public void setCountyBean(County countyBean) {
		this.countyBean = countyBean;
	}

	public Meridian getMeridian1() {
		return this.meridian1;
	}

	public void setMeridian1(Meridian meridian1) {
		this.meridian1 = meridian1;
	}

	public Meridian getMeridian2() {
		return this.meridian2;
	}

	public void setMeridian2(Meridian meridian2) {
		this.meridian2 = meridian2;
	}

	public State getState1() {
		return this.state1;
	}

	public void setState1(State state1) {
		this.state1 = state1;
	}

	public State getState2() {
		return this.state2;
	}

	public void setState2(State state2) {
		this.state2 = state2;
	}

	public List<SourceLocation> getSourceLocations() {
		return this.sourceLocations;
	}

	public void setSourceLocations(List<SourceLocation> sourceLocations) {
		this.sourceLocations = sourceLocations;
	}

	public SourceLocation addSourceLocation(SourceLocation sourceLocation) {
		getSourceLocations().add(sourceLocation);
		sourceLocation.setLocation(this);

		return sourceLocation;
	}

	public SourceLocation removeSourceLocation(SourceLocation sourceLocation) {
		getSourceLocations().remove(sourceLocation);
		sourceLocation.setLocation(null);

		return sourceLocation;
	}

}