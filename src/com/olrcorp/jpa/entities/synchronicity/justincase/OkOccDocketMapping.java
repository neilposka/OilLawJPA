package com.olrcorp.jpa.entities.synchronicity.justincase;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ok_occ_docket_mappings database table.
 * 
 */
@Entity
@Table(name="ok_occ_docket_mappings")
@NamedQuery(name="OkOccDocketMapping.findAll", query="SELECT o FROM OkOccDocketMapping o")
public class OkOccDocketMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String original;

	private String replacement;

	public OkOccDocketMapping() {
	}

	public String getOriginal() {
		return this.original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getReplacement() {
		return this.replacement;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}

}