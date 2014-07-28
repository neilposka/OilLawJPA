package com.olrcorp.jpa.entities.docs;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the document_dates database table.
 * 
 */
@Entity
@Table(name="document_dates")
@NamedQuery(name="DocumentDate.findAll", query="SELECT d FROM DocumentDate d")
public class DocumentDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="date_id")
	private Integer dateId;

	@Temporal(TemporalType.DATE)
	@Column(name="doc_date")
	private Date docDate;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Document
	@ManyToOne
	@JoinColumn(name="doc_id")
	private Document document;

	public DocumentDate() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getDateId() {
		return this.dateId;
	}

	public void setDateId(Integer dateId) {
		this.dateId = dateId;
	}

	public Date getDocDate() {
		return this.docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}