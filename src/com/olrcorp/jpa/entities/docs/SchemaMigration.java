package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the schema_migrations database table.
 * 
 */
@Entity
@Table(name="schema_migrations")
@NamedQuery(name="SchemaMigration.findAll", query="SELECT s FROM SchemaMigration s")
public class SchemaMigration implements Serializable {
	private static final long serialVersionUID = 1L;

	private String version;

	public SchemaMigration() {
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}