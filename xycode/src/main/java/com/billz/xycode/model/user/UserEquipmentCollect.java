package com.billz.xycode.model.user;

import java.util.Date;

public class UserEquipmentCollect {

	private Long ucid;
	private Long uid;
	private Integer cateid;
	private Integer subcateid;
	private Long eid;
	private String logo;
	private String posid;
	private String ename;
	private Date createtime;

	private String catename;

	public Long getUcid() {
		return ucid;
	}

	public void setUcid(Long ucid) {
		this.ucid = ucid;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Integer getCateid() {
		return cateid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public String getLogo() {
		return logo;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPosid() {
		return posid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}
}
