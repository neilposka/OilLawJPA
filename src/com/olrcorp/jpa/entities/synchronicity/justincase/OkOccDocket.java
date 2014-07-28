package com.olrcorp.jpa.entities.synchronicity.justincase;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ok_occ_dockets database table.
 * 
 */
@Entity
@Table(name="ok_occ_dockets")
@NamedQuery(name="OkOccDocket.findAll", query="SELECT o FROM OkOccDocket o")
public class OkOccDocket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String docket;

	private String descr;

	public OkOccDocket() {
	}

	public String getDocket() {
		return this.docket;
	}

	public void setDocket(String docket) {
		this.docket = docket;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}