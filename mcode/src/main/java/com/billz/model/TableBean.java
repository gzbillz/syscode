package com.billz.model;

/**
 * 表对象
 * @class TableBean.java
 * @author billz
 * @date 2017年9月15日
 */
public class TableBean {

	private String clsName; // 类名[首字母大写]
	private String clsLname; // 类名(首字母小写)
	private String tableName; // 表名
	private String remark; // 表描述
	private ColBean pkIdBean; // 主键列

	public String getClsName() {
		return clsName;
	}
	
	public String getClsLname() {
		return clsLname;
	}

	public String getTableName() {
		return tableName;
	}

	public String getRemark() {
		return remark;
	}

	public ColBean getPkIdBean() {
		return pkIdBean;
	}

	public void setClsName(String clsName) {
		this.clsName = clsName;
	}

	public void setClsLname(String clsLname) {
		this.clsLname = clsLname;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setPkIdBean(ColBean pkIdBean) {
		this.pkIdBean = pkIdBean;
	}

}
