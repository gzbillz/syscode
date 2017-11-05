package com.billz.xycode.model.project;

/**
 * 项目设备：水控
 * 
 * @class ProjectEquWater.java
 * @author billz
 * @date 2017年10月9日
 */
public class ProjectEquWater extends ProjectEqu {

	private Long pewid;

	private Double longitude; // 经度
	private Double latitude; // 纬度
	private Double distance; // 距离

	// 关联字段
	private String pname; // 项目名称
	private String subname; // 设备规格

	public Long getPewid() {
		return pewid;
	}

	public void setPewid(Long pewid) {
		this.pewid = pewid;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getDistance() {
		return this.distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}
}
