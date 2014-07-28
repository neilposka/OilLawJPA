package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the voters database table.
 * 
 */
@Entity
@Table(name="voters")
@NamedQuery(name="Voter.findAll", query="SELECT v FROM Voter v")
public class Voter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	private String city;

	@Temporal(TemporalType.DATE)
	@Column(name="last_voted")
	private Date lastVoted;

	@Column(name="mailing_address")
	private String mailingAddress;

	@Column(name="mailing_city")
	private String mailingCity;

	@Column(name="mailing_state")
	private String mailingState;

	@Column(name="mailing_zip")
	private String mailingZip;

	private String name;

	private String party;

	private String phone;

	@Temporal(TemporalType.DATE)
	private Date registered;

	private String state;

	private String status;

	private String zip;

	public Voter() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getLastVoted() {
		return this.lastVoted;
	}

	public void setLastVoted(Date lastVoted) {
		this.lastVoted = lastVoted;
	}

	public String getMailingAddress() {
		return this.mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getMailingCity() {
		return this.mailingCity;
	}

	public void setMailingCity(String mailingCity) {
		this.mailingCity = mailingCity;
	}

	public String getMailingState() {
		return this.mailingState;
	}

	public void setMailingState(String mailingState) {
		this.mailingState = mailingState;
	}

	public String getMailingZip() {
		return this.mailingZip;
	}

	public void setMailingZip(String mailingZip) {
		this.mailingZip = mailingZip;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return this.party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRegistered() {
		return this.registered;
	}

	public void setRegistered(Date registered) {
		this.registered = registered;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}