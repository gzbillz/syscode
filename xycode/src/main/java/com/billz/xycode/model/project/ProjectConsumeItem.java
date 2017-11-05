package com.billz.xycode.model.project;

public class ProjectConsumeItem {

	private Long itemid;
	private Long pid;
	private Integer cateid;
	private Integer subcateid;
	private String itemname;
	private Double price;
	private String remark;
	private Boolean status;
	private Integer sn;

	// 关联字段
	private String pname; // 项目名称
	private String catename; // 设备分类
	private String subname; // 设备规格

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Integer getCateid() {
		return cateid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getSn() {
		return sn;
	}

	public void setSn(Integer sn) {
		this.sn = sn;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPname() {
		return pname;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public String getCatename() {
		return catename;
	}
	
	public void setSubname(String subname){
		this.subname = subname;
	}
	
	public String getSubname(){
		return subname;
	}
}
