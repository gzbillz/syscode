package com.billz.xycode.model.equipment;

public class EquipmentCategory {

	private Integer cateid;
	private String catename;
	private Boolean status;
	private Integer sn;
	private String icon;
	private String url;

	public Integer getCateid() {
		return cateid;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getSn() {
		return sn;
	}

	public void setSn(Integer sn) {
		this.sn = sn;
	}

	public String getIcon() {
		return icon;
	}

	public String getUrl() {
		return url;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
