package com.billz.xycode.model.info;

import java.util.Date;

public class Suggestion {

	private Long sugid;
	private Long uid;
	private String name;
	private String phone;
	private String content;
	private String renote;
	private Date createtime;

	public Long getSugid() {
		return sugid;
	}

	public void setSugid(Long sugid) {
		this.sugid = sugid;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRenote() {
		return renote;
	}

	public void setRenote(String renote) {
		this.renote = renote;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
