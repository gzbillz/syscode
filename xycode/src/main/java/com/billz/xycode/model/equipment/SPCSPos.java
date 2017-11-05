package com.billz.xycode.model.equipment;

/**
 * @class SPCSPos.java
 * @author billz
 * @date 2017年10月27日
 */
public class SPCSPos {

	private Long pewid;
	private Long eid;
	private String posid; // 设备编号
	private String logo;
	private Long sellerid; // 使用商家编号
	private Long pid; // 消费项目编号
	private Integer cateid; // 分类编号
	private Integer subcateid; // 规格编号
	private Integer status; // 状态
	private String ename; // 设备名称
	private String catename; // 分类名称

	public Long getPewid() {
		return pewid;
	}

	public Long getEid() {
		return eid;
	}

	public String getPosid() {
		return posid;
	}

	public String getLogo() {
		return logo;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public Long getPid() {
		return pid;
	}

	public Integer getCateid() {
		return cateid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public Integer getStatus() {
		return status;
	}

	public String getEname() {
		return ename;
	}

	public String getCatename() {
		return catename;
	}

	public void setPewid(Long pewid) {
		this.pewid = pewid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

}
