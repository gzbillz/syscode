package com.billz.xycode.model.seller;

import java.util.Date;

public class SellerAccount {

	private Long said;
	private Long sellerid;
	private Integer satype;
	private Double balance;
	private Boolean status;
	private Date createtime;

	// 关联字段
	private String catename;
	private String sellername;

	public Long getSaid() {
		return said;
	}

	public void setSaid(Long said) {
		this.said = said;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public Integer getSatype() {
		return satype;
	}

	public void setSatype(Integer satype) {
		this.satype = satype;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
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

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}
	
	public String getSellername(){
		return sellername;
	}
	
	public void setSellername(String sellername){
		this.sellername = sellername;
	}
}
