package com.olrcorp.jpa.entities.client;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the site_types database table.
 * 
 */
@Entity
@Table(name="site_types")
@NamedQuery(name="SiteType.findAll", query="SELECT s FROM SiteType s")
public class SiteType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String description;

	@Column(name="display_as")
	private String displayAs;

	private String name;

	//bi-directional many-to-one association to Site
	@OneToMany(mappedBy="siteType")
	private List<Site> sites;

	public SiteType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayAs() {
		return this.displayAs;
	}

	public void setDisplayAs(String displayAs) {
		this.displayAs = displayAs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Site> getSites() {
		return this.sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}

	public Site addSite(Site site) {
		getSites().add(site);
		site.setSiteType(this);

		return site;
	}

	public Site removeSite(Site site) {
		getSites().remove(site);
		site.setSiteType(null);

		return site;
	}

}