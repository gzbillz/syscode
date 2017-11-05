package com.billz.xycode.model.project;

import java.util.Date;

public class ProjectSplitmoney {

	private Long id;
	private Long sellerid;
	private Long pid;
	private Double money;
	private String remark;
	private Integer cateid;
	private String posid;
	private Date createtime;
	
	// 关联字段
	private String pname;
	private String catename;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getRemark() {
		return remark;
	}

	public Integer getCateid() {
		return cateid;
	}

	public String getPosid() {
		return posid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getPname(){
		return this.pname;
	}
	
	public void setPname(String pname){
		this.pname = pname;
	}
	
	public String getCatename(){
		return this.catename;
	}
	
	public void setCatename(String catename){
		this.catename = catename;
	}
}
