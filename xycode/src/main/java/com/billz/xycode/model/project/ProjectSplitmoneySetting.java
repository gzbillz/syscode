package com.billz.xycode.model.project;

public class ProjectSplitmoneySetting {

	private Long pssid;
	private Long pid;
	private Long ruleid;
	private Long sellerid;
	private Boolean isfz;

	private String pname;
	private String sellername;
	private String rno;

	public Long getPssid() {
		return pssid;
	}

	public void setPssid(Long pssid) {
		this.pssid = pssid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getRuleid() {
		return ruleid;
	}

	public void setRuleid(Long ruleid) {
		this.ruleid = ruleid;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public Boolean getIsfz() {
		return isfz;
	}

	public void setIsfz(Boolean isfz) {
		this.isfz = isfz;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getSellername() {
		return this.sellername;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPname() {
		return this.pname;
	}
	
	public void setRno(String rno){
		this.rno = rno;
	}
	
	public String getRno(){
		return this.rno;
	}
}
