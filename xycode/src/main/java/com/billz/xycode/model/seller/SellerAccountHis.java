package com.billz.xycode.model.seller;

import java.util.Date;

public class SellerAccountHis {

	private Long sahid;
	private Long said;
	private Boolean transtype;
	private Double money;
	private Double bmoney;
	private Double amoney;
	private String remark;
	private Date createtime;

	public Long getSahid() {
		return sahid;
	}

	public void setSahid(Long sahid) {
		this.sahid = sahid;
	}

	public Long getSaid() {
		return said;
	}

	public void setSaid(Long said) {
		this.said = said;
	}

	public Boolean getTranstype() {
		return transtype;
	}

	public void setTranstype(Boolean transtype) {
		this.transtype = transtype;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Double getBmoney() {
		return bmoney;
	}

	public Double getAmoney() {
		return amoney;
	}

	public void setBmoney(Double bmoney) {
		this.bmoney = bmoney;
	}

	public void setAmoney(Double amoney) {
		this.amoney = amoney;
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
