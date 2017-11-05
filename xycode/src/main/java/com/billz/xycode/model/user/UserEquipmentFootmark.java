package com.billz.xycode.model.user;

import java.util.Date;

public class UserEquipmentFootmark {

	private Long fmid;
	private Long uid;
	private Integer cateid;
	private Integer subcateid;
	private Long pid;
	private String logo;
	private String posid;
	private String pname;
	private Integer ucount;
	private Date usedate;
	
	// 关联字段
	private String catename;

	public Long getFmid() {
		return fmid;
	}

	public void setFmid(Long fmid) {
		this.fmid = fmid;
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

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getLogo() {
		return logo;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getUcount() {
		return ucount;
	}

	public void setUcount(Integer ucount) {
		this.ucount = ucount;
	}

	public Date getUsedate() {
		return usedate;
	}

	public void setUsedate(Date usedate) {
		this.usedate = usedate;
	}
	
	public String getCatename(){
		return catename;
	}
	
	public void setCatename(String catename){
		this.catename = catename;
	}
}
