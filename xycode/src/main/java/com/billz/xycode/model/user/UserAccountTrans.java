package com.billz.xycode.model.user;

import java.util.Date;

public class UserAccountTrans {

	private Long tid;
	private Boolean ttype;
	private Long fromuid;
	private String fname;
	private Long touid;
	private String tname;
	private Integer remark;
	private Date createtime;
	private Double price;
	private Double bprice; // 交易前金额
	private Double aprice; // 交易后金额

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Boolean getTtype() {
		return ttype;
	}

	public void setTtype(Boolean ttype) {
		this.ttype = ttype;
	}

	public Long getFromuid() {
		return fromuid;
	}

	public void setFromuid(Long fromuid) {
		this.fromuid = fromuid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Long getTouid() {
		return touid;
	}

	public void setTouid(Long touid) {
		this.touid = touid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getRemark() {
		return remark;
	}

	public void setRemark(Integer remark) {
		this.remark = remark;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getBprice() {
		return bprice;
	}

	public Double getAprice() {
		return aprice;
	}

	public void setBprice(Double bprice) {
		this.bprice = bprice;
	}

	public void setAprice(Double aprice) {
		this.aprice = aprice;
	}
}
