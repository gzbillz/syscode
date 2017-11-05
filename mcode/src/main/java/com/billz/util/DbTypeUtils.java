package com.billz.util;

/**
 * @class DbTypeUtils.java
 * @author billz
 * @date 2017年9月15日
 */
public class DbTypeUtils {

	/**
	 * 数据库类型转化成java对应的类型
	 * 
	 * @param 数据库字段类型
	 * @return java对应的数据类型
	 */
	public String mapper(String jdbcType) {
		String tp = "String";
		switch (jdbcType.toLowerCase()) {
		case "bigint":
			tp = "Long";
			break;
		case "int":
			tp = "Integer";
			break;
		case "decimal":
		case "double":
		case "float":
			tp = "Double";
			break;
		case "smallint":
			tp = "Short";
			break;
		case "bool":
		case "bit":
			tp = "Boolean";
			break;
		case "date":
		case "datetime":
			tp = "Date";
			break;
		}
		return tp;
	}
}
