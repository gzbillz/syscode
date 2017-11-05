package com.billz.xycode.model.seller;

import java.util.Date;

public class Seller {

	private Long sellerid;
	private String sellername;
	private String sdm;
	private String logo;
	private String address;
	private String telname;
	private String telphone;
	private String wxshh;
	private Double wxfl; // 微信支付手续费
	private String wxgzh;
	private String stype;
	private Long parentid;
	private Boolean status;
	private Date createtime;

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getSdm() {
		return sdm;
	}

	public void setSdm(String sdm) {
		this.sdm = sdm;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelname() {
		return telname;
	}

	public void setTelname(String telname) {
		this.telname = telname;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getWxshh() {
		return wxshh;
	}

	public void setWxshh(String wxshh) {
		this.wxshh = wxshh;
	}

	public Double getWxfl() {
		return wxfl;
	}

	public void setWxfl(Double wxfl) {
		this.wxfl = wxfl;
	}

	public String getWxgzh() {
		return wxgzh;
	}

	public void setWxgzh(String wxgzh) {
		this.wxgzh = wxgzh;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
