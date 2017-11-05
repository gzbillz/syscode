package com.billz.xycode.model.equipment;

/**
 * 设备规格
 * 
 * @class EquipmentSubcategory.java
 * @author billz
 * @date 2017年11月3日
 */
public class EquipmentSubcategory {

	private Integer subcateid;
	private Integer cateid;
	private String subname;
	private String remark;
	private Integer sn;

	// 关联字段
	private String catename;

	public Integer getSubcateid() {
		return subcateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public Integer getCateid() {
		return cateid;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSn() {
		return sn;
	}

	public void setSn(Integer sn) {
		this.sn = sn;
	}

	public String getCatename() {
		return this.catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}
}
