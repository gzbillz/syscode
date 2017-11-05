package com.billz.xycode.model.equipment;

/**
 * @class EquipmentBean.java
 * @author billz
 * @date 2017年10月7日
 */
public class EquipmentBean {

	private Long eid;
	private Integer cateid;
	private Integer subcateid;
	private String posid;
	private String logo;
	private String ename;

	public Long getEid() {
		return eid;
	}

	public Integer getCateid() {
		return cateid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public String getPosid() {
		return posid;
	}

	public String getLogo() {
		return logo;
	}

	public String getEname() {
		return ename;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
