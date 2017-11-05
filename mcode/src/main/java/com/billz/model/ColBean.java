package com.billz.model;

/**
 * 字段信息
 * 
 * @class ColBean.java
 * @author billz
 * @date 2017年9月14日
 */
public class ColBean {

	private boolean pk; // 是否为主键
	private String colName; // 表字段名称
	private String name; // 属性名称[首字母小写]
	private String uname; // 属性名称[首字母大写]
	private String colType; // 数据类型[java类型]
	private String jdbcType; // jdbc类型
	private String title; // 字段中文名称
	private String comment; // 字段备注

	public boolean getPk() {
		return pk;
	}

	public void setPk(boolean pk) {
		this.pk = pk;
	}

	public String getColName() {
		return colName;
	}

	public String getName() {
		return name;
	}

	public String getUname() {
		return uname;
	}

	public String getColType() {
		return colType;
	}

	public String getTitle() {
		return title;
	}

	public String getComment() {
		return comment;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setColType(String colType) {
		this.colType = colType;
	}

	public String getJdbcType() {
		return jdbcType;
	}

	public void setJdbcType(String jdbcType) {
		this.jdbcType = jdbcType;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
