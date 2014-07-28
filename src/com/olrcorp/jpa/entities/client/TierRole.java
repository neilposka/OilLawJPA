package com.olrcorp.jpa.entities.client;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the tier_roles database table.
 * 
 */
@Entity
@Table(name="tier_roles")
@NamedQuery(name="TierRole.findAll", query="SELECT t FROM TierRole t")
public class TierRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="plan_id")
	private Integer planId;

	private String role;

	public TierRole() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlanId() {
		return this.planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}