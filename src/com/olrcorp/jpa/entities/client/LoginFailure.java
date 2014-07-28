package com.olrcorp.jpa.entities.client;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the login_failures database table.
 * 
 */
@Entity
@Table(name="login_failures")
@NamedQuery(name="LoginFailure.findAll", query="SELECT l FROM LoginFailure l")
public class LoginFailure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="failed_at")
	private Timestamp failedAt;

	private String host;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String password;

	@Column(name="user_agent")
	private String userAgent;

	private String username;

	public LoginFailure() {
	}

	public Timestamp getFailedAt() {
		return this.failedAt;
	}

	public void setFailedAt(Timestamp failedAt) {
		this.failedAt = failedAt;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}