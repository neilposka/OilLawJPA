package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the respondents database table.
 * 
 */
@Entity
@Table(name="respondents")
@NamedQuery(name="Respondent.findAll", query="SELECT r FROM Respondent r")
public class Respondent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String address1;

	private String address2;

	@Column(name="cause_number")
	private String causeNumber;

	private String city;

	@Column(name="filing_id")
	private Integer filingId;

	private String name1;

	private String name2;

	private String state;

	private String zip;

	public Respondent() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCauseNumber() {
		return this.causeNumber;
	}

	public void setCauseNumber(String causeNumber) {
		this.causeNumber = causeNumber;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getFilingId() {
		return this.filingId;
	}

	public void setFilingId(Integer filingId) {
		this.filingId = filingId;
	}

	public String getName1() {
		return this.name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return this.name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}