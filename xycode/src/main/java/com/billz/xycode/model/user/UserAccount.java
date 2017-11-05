package com.billz.xycode.model.user;

public class UserAccount {

	private Long uaid;
	private Long uid;
	private Double balance;
	private String pwd;
	private Boolean status;

	// 关联字段
	private String userid;

	public Long getUaid() {
		return uaid;
	}

	public void setUaid(Long uaid) {
		this.uaid = uaid;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
