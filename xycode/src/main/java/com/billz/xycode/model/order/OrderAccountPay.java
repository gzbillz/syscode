package com.billz.xycode.model.order;

import java.util.Date;

public class OrderAccountPay {

	private Long aoid;
	private String ordercode;
	private String othercode;
	private Long uaid;
	private Double money;
	private Double fare;
	private Long fuid;
	private Long tuid;
	private String paytype;
	private String apptype;
	private String appversion;
	private Integer paystatus;
	private Date paytime;
	private String remark;
	private Date createtime;

	public Long getAoid() {
		return aoid;
	}

	public void setAoid(Long aoid) {
		this.aoid = aoid;
	}

	public String getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}

	public String getOthercode() {
		return othercode;
	}

	public void setOthercode(String othercode) {
		this.othercode = othercode;
	}

	public Long getUaid() {
		return uaid;
	}

	public void setUaid(Long uaid) {
		this.uaid = uaid;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public Long getFuid() {
		return fuid;
	}

	public void setFuid(Long fuid) {
		this.fuid = fuid;
	}

	public Long getTuid() {
		return tuid;
	}

	public void setTuid(Long tuid) {
		this.tuid = tuid;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getApptype() {
		return apptype;
	}

	public void setApptype(String apptype) {
		this.apptype = apptype;
	}

	public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

	public Integer getPaystatus() {
		return paystatus;
	}

	public void setPaystatus(Integer paystatus) {
		this.paystatus = paystatus;
	}

	public Date getPaytime() {
		return paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
