package com.billz.xycode.model.project;

/**
 * 项目设备，顶级类
 * 
 * @class ProjectEqu.java
 * @author billz
 * @date 2017年10月9日
 */
public class ProjectEqu {

	private Integer cateid;
	private String catename; // 分类
	private Integer subcateid;
	private Long pid;
	private String logo;
	private Long eid;
	private String posid;
	private Boolean status;
	private String ename; // 设备名称

	public Integer getCateid() {
		return cateid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public Long getPid() {
		return pid;
	}

	public String getLogo() {
		return logo;
	}

	public Long getEid() {
		return eid;
	}

	public String getPosid() {
		return posid;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
}
