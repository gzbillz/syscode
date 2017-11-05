package com.billz.xycode.model.equipment;

import java.util.Date;

public class EquipmentWater {

	private Long weid;
	private Integer subcateid;
	private String posid;
	private String ename;
	private Long usid;
	private String usname;
	private String note;
	private Boolean status;
	private Date usedate;

	// 关联字段
	private String subname; // 规格

	public Long getWeid() {
		return weid;
	}

	public void setWeid(Long weid) {
		this.weid = weid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public String getPosid() {
		return posid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Long getUsid() {
		return usid;
	}

	public void setUsid(Long usid) {
		this.usid = usid;
	}

	public String getUsname() {
		return usname;
	}

	public void setUsname(String usname) {
		this.usname = usname;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getUsedate() {
		return usedate;
	}

	public void setUsedate(Date usedate) {
		this.usedate = usedate;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}
}
