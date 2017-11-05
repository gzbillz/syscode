package com.billz.xycode.model.order;

import java.util.Date;

public class OrderConsume {

	private Long oid;
	private String ordercode;
	private String logo;
	private String title;
	private Integer status;
	private Long pid;
	private Long eid;
	private Integer cateid;
	private Integer subcateid;
	private String posid;
	private Long uid;
	private String userid;
	private Double price;
	private Double fare; // 手续费
	private Long sellerid;
	private Integer sycs;
	private Double xfprice;
	private Double bkprice;
	private Date bktime;
	private String qrcode;
	private String dkey;
	private Long itemid;
	private Date createtime;

	// start 支付字段
	private Integer paystatus; // 支付订单状态
	private Date paytime; // 支付时间
	private String othercode; // 第三方支付订单号
	private String paytype; // 支付方式(微信,平台)
	// end 支付字段

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public Integer getCateid() {
		return cateid;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public String getPosid() {
		return posid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public Integer getSycs() {
		return sycs;
	}

	public void setSycs(Integer sycs) {
		this.sycs = sycs;
	}

	public Double getXfprice() {
		return xfprice;
	}

	public void setXfprice(Double xfprice) {
		this.xfprice = xfprice;
	}

	public Double getBkprice() {
		return bkprice;
	}

	public void setBkprice(Double bkprice) {
		this.bkprice = bkprice;
	}

	public Date getBktime() {
		return bktime;
	}

	public void setBktime(Date bktime) {
		this.bktime = bktime;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public String getDkey() {
		return dkey;
	}

	public void setDkey(String dkey) {
		this.dkey = dkey;
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getPaystatus() {
		return paystatus;
	}

	public Date getPaytime() {
		return paytime;
	}

	public String getOthercode() {
		return othercode;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaystatus(Integer paystatus) {
		this.paystatus = paystatus;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	public void setOthercode(String othercode) {
		this.othercode = othercode;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
}
