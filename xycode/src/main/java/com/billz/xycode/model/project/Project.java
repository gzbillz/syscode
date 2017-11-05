package com.billz.xycode.model.project;

import java.util.Date;

public class Project {

	private Long pid;
	private String logo;
	private String pname;
	private String remark;
	private String address;
	private Long sellerid;
	private String sbms;
	private Long yysellerid;
	private Long tzsellerid;
	private Long tgsellerid;
	private Boolean status;
	private Date createtime;
	private Double longitude; // 经度
	private Double latitude; // 纬度
	private Double distance; // 距离
	private Integer score; // 评分

	// 关联字段
	private String sellername; // 商家名称

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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

	public String getSbms() {
		return sbms;
	}

	public void setSbms(String sbms) {
		this.sbms = sbms;
	}

	public Long getYysellerid() {
		return yysellerid;
	}

	public void setYysellerid(Long yysellerid) {
		this.yysellerid = yysellerid;
	}

	public Long getTzsellerid() {
		return tzsellerid;
	}

	public void setTzsellerid(Long tzsellerid) {
		this.tzsellerid = tzsellerid;
	}

	public Long getTgsellerid() {
		return tgsellerid;
	}

	public void setTgsellerid(Long tgsellerid) {
		this.tgsellerid = tgsellerid;
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

	public Double getLongitude() {
		return longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getDistance() {
		return this.distance;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getScore() {
		return this.score;
	}
}
