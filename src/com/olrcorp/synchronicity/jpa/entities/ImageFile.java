package com.olrcorp.synchronicity.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="image_files")
public class ImageFile implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer imageid;

	@Column(name="docName")
    private String docname;

    private String state;

    private String type;

    private String dir1;

    private String dir2;

    private String filename;

    private Integer pages;

    private Integer bytes;

    private Integer hits;

    private String volume;

    @Column(name="orderStart")
    private Integer orderstart;

    @Column(name="OrderEnd")
    private Integer orderend;

    private String notes;

    @Column(name="docId")
    private Integer docid;

	@Temporal(TemporalType.DATE)
    @Column(name="updated_at")
    private Date updatedAt;

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname == null ? null : docname.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDir1() {
        return dir1;
    }

    public void setDir1(String dir1) {
        this.dir1 = dir1 == null ? null : dir1.trim();
    }

    public String getDir2() {
        return dir2;
    }

    public void setDir2(String dir2) {
        this.dir2 = dir2 == null ? null : dir2.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public Integer getOrderstart() {
        return orderstart;
    }

    public void setOrderstart(Integer orderstart) {
        this.orderstart = orderstart;
    }

    public Integer getOrderend() {
        return orderend;
    }

    public void setOrderend(Integer orderend) {
        this.orderend = orderend;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


}