package com.billz.xycode.model.project;

public class ProjectOtherSeller {

	private Long ospid;
	private Long pid;
	private Long sellerid;
	private String rolename;
	private String remark;

	private String pname;
	private String sellername;

	public Long getOspid() {
		return ospid;
	}

	public void setOspid(Long ospid) {
		this.ospid = ospid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPname() {
		return this.pname;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getSellername() {
		return this.sellername;
	}
}
