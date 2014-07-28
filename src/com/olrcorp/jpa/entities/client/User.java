package com.olrcorp.jpa.entities.client;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="approved_at")
	private Timestamp approvedAt;

	@Column(name="approved_by")
	private String approvedBy;

	@Column(name="confirmation_sent_at")
	private Timestamp confirmationSentAt;

	@Column(name="confirmation_token")
	private String confirmationToken;

	@Column(name="confirmed_at")
	private Timestamp confirmedAt;

	@Column(name="contact_info")
	private Object contactInfo;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="current_sign_in_at")
	private Timestamp currentSignInAt;

	@Column(name="current_sign_in_ip")
	private String currentSignInIp;

	private String dept;

	private String email;

	@Column(name="encrypted_password")
	private String encryptedPassword;

	@Temporal(TemporalType.DATE)
	@Column(name="expires_on")
	private Date expiresOn;

	@Column(name="failed_attempts")
	private Integer failedAttempts;

	@Column(name="last_sign_in_at")
	private Timestamp lastSignInAt;

	@Column(name="last_sign_in_ip")
	private String lastSignInIp;

	private String location;

	@Column(name="locked_at")
	private Timestamp lockedAt;

	private String name;

	private String phone;

	@Column(name="primary_state_id")
	private Integer primaryStateId;

	@Column(name="remember_created_at")
	private Timestamp rememberCreatedAt;

	@Column(name="reset_password_sent_at")
	private Timestamp resetPasswordSentAt;

	@Column(name="reset_password_token")
	private String resetPasswordToken;

	private Array roles;

	@Column(name="sign_in_count")
	private Integer signInCount;

	@Column(name="sled7_password")
	private String sled7Password;

	@Column(name="status_id")
	private Integer statusId;

	@Column(name="unconfirmed_email")
	private String unconfirmedEmail;

	@Column(name="unlock_token")
	private String unlockToken;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	private String username;

	//bi-directional many-to-one association to Site
	@ManyToOne
	private Site site;

	public User() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getApprovedAt() {
		return this.approvedAt;
	}

	public void setApprovedAt(Timestamp approvedAt) {
		this.approvedAt = approvedAt;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Timestamp getConfirmationSentAt() {
		return this.confirmationSentAt;
	}

	public void setConfirmationSentAt(Timestamp confirmationSentAt) {
		this.confirmationSentAt = confirmationSentAt;
	}

	public String getConfirmationToken() {
		return this.confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public Timestamp getConfirmedAt() {
		return this.confirmedAt;
	}

	public void setConfirmedAt(Timestamp confirmedAt) {
		this.confirmedAt = confirmedAt;
	}

	public Object getContactInfo() {
		return this.contactInfo;
	}

	public void setContactInfo(Object contactInfo) {
		this.contactInfo = contactInfo;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getCurrentSignInAt() {
		return this.currentSignInAt;
	}

	public void setCurrentSignInAt(Timestamp currentSignInAt) {
		this.currentSignInAt = currentSignInAt;
	}

	public String getCurrentSignInIp() {
		return this.currentSignInIp;
	}

	public void setCurrentSignInIp(String currentSignInIp) {
		this.currentSignInIp = currentSignInIp;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return this.encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public Date getExpiresOn() {
		return this.expiresOn;
	}

	public void setExpiresOn(Date expiresOn) {
		this.expiresOn = expiresOn;
	}

	public Integer getFailedAttempts() {
		return this.failedAttempts;
	}

	public void setFailedAttempts(Integer failedAttempts) {
		this.failedAttempts = failedAttempts;
	}

	public Timestamp getLastSignInAt() {
		return this.lastSignInAt;
	}

	public void setLastSignInAt(Timestamp lastSignInAt) {
		this.lastSignInAt = lastSignInAt;
	}

	public String getLastSignInIp() {
		return this.lastSignInIp;
	}

	public void setLastSignInIp(String lastSignInIp) {
		this.lastSignInIp = lastSignInIp;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getLockedAt() {
		return this.lockedAt;
	}

	public void setLockedAt(Timestamp lockedAt) {
		this.lockedAt = lockedAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getPrimaryStateId() {
		return this.primaryStateId;
	}

	public void setPrimaryStateId(Integer primaryStateId) {
		this.primaryStateId = primaryStateId;
	}

	public Timestamp getRememberCreatedAt() {
		return this.rememberCreatedAt;
	}

	public void setRememberCreatedAt(Timestamp rememberCreatedAt) {
		this.rememberCreatedAt = rememberCreatedAt;
	}

	public Timestamp getResetPasswordSentAt() {
		return this.resetPasswordSentAt;
	}

	public void setResetPasswordSentAt(Timestamp resetPasswordSentAt) {
		this.resetPasswordSentAt = resetPasswordSentAt;
	}

	public String getResetPasswordToken() {
		return this.resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public Array getRoles() {
		return this.roles;
	}

	public void setRoles(Array roles) {
		this.roles = roles;
	}

	public Integer getSignInCount() {
		return this.signInCount;
	}

	public void setSignInCount(Integer signInCount) {
		this.signInCount = signInCount;
	}

	public String getSled7Password() {
		return this.sled7Password;
	}

	public void setSled7Password(String sled7Password) {
		this.sled7Password = sled7Password;
	}

	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getUnconfirmedEmail() {
		return this.unconfirmedEmail;
	}

	public void setUnconfirmedEmail(String unconfirmedEmail) {
		this.unconfirmedEmail = unconfirmedEmail;
	}

	public String getUnlockToken() {
		return this.unlockToken;
	}

	public void setUnlockToken(String unlockToken) {
		this.unlockToken = unlockToken;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}