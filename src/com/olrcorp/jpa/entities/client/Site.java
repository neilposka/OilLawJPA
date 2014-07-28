package com.olrcorp.jpa.entities.client;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sites database table.
 * 
 */
@Entity
@Table(name="sites")
@NamedQuery(name="Site.findAll", query="SELECT s FROM Site s")
public class Site implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="allow_simultaneous_logins")
	private Boolean allowSimultaneousLogins;

	private String company;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="enabled_states")
	private String enabledStates;

	@Temporal(TemporalType.DATE)
	@Column(name="expires_on")
	private Date expiresOn;

	@Column(name="ip_filter")
	private String ipFilter;

	@Column(name="max_logins")
	private Integer maxLogins;

	private String notes;

	private Array roles;

	@Column(name="sub_additional_user_amount")
	private Integer subAdditionalUserAmount;

	@Column(name="sub_amount")
	private Integer subAmount;

	@Column(name="sub_login_max")
	private Integer subLoginMax;

	@Column(name="sub_tier")
	private Integer subTier;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-many association to Role
	@ManyToMany
	@JoinTable(
		name="site_roles"
		, joinColumns={
			@JoinColumn(name="site_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="role_id")
			}
		)
	private List<Role> rolesSet;

	//bi-directional many-to-one association to SiteStatus
	@ManyToOne
	@JoinColumn(name="site_status_id")
	private SiteStatus siteStatus;

	//bi-directional many-to-one association to SiteType
	@ManyToOne
	@JoinColumn(name="site_type_id")
	private SiteType siteType;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="site")
	private List<User> users;

	public Site() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAllowSimultaneousLogins() {
		return this.allowSimultaneousLogins;
	}

	public void setAllowSimultaneousLogins(Boolean allowSimultaneousLogins) {
		this.allowSimultaneousLogins = allowSimultaneousLogins;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEnabledStates() {
		return this.enabledStates;
	}

	public void setEnabledStates(String enabledStates) {
		this.enabledStates = enabledStates;
	}

	public Date getExpiresOn() {
		return this.expiresOn;
	}

	public void setExpiresOn(Date expiresOn) {
		this.expiresOn = expiresOn;
	}

	public String getIpFilter() {
		return this.ipFilter;
	}

	public void setIpFilter(String ipFilter) {
		this.ipFilter = ipFilter;
	}

	public Integer getMaxLogins() {
		return this.maxLogins;
	}

	public void setMaxLogins(Integer maxLogins) {
		this.maxLogins = maxLogins;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Array getRoles() {
		return this.roles;
	}

	public void setRoles(Array roles) {
		this.roles = roles;
	}

	public Integer getSubAdditionalUserAmount() {
		return this.subAdditionalUserAmount;
	}

	public void setSubAdditionalUserAmount(Integer subAdditionalUserAmount) {
		this.subAdditionalUserAmount = subAdditionalUserAmount;
	}

	public Integer getSubAmount() {
		return this.subAmount;
	}

	public void setSubAmount(Integer subAmount) {
		this.subAmount = subAmount;
	}

	public Integer getSubLoginMax() {
		return this.subLoginMax;
	}

	public void setSubLoginMax(Integer subLoginMax) {
		this.subLoginMax = subLoginMax;
	}

	public Integer getSubTier() {
		return this.subTier;
	}

	public void setSubTier(Integer subTier) {
		this.subTier = subTier;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Role> getRolesSet() {
		return this.rolesSet;
	}

	public void setRolesSet(List<Role> rolesSet) {
		this.rolesSet = rolesSet;
	}

	public SiteStatus getSiteStatus() {
		return this.siteStatus;
	}

	public void setSiteStatus(SiteStatus siteStatus) {
		this.siteStatus = siteStatus;
	}

	public SiteType getSiteType() {
		return this.siteType;
	}

	public void setSiteType(SiteType siteType) {
		this.siteType = siteType;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setSite(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setSite(null);

		return user;
	}

}