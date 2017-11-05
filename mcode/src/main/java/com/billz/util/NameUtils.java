package com.billz.util;

import com.mysql.jdbc.StringUtils;

/**
 * 字段名称转化成属性名称
 * @class NameUtils.java
 * @author billz
 * @date 2017年9月15日
 */
public class NameUtils {

	/**
	 * 字段名称转化成java有效的属性名称
	 * <ul>
	 * 	<li>1.将取消下划线，中间字母首字母大写，返回结果首字母小写</li>
	 *  <li>2.将没有下划线的内容，全部转化为小写字母</li>
	 *  <li>3.首字母为下划线，直接去掉下划线</li>
	 * </ul>
	 * @param colName 字段名称
	 * @return
	 */
	public String format(String colName){
		String name = colName;
		if(!StringUtils.isNullOrEmpty(name)){
			if(colName.indexOf("_") > 0){
				String[] cols = colName.split("_");
				StringBuffer tmp = new StringBuffer("");
				for(int i=0;i<cols.length;i++){
					if(i == 0){
						tmp.append(cols[i].substring(0, 1).toLowerCase() + cols[i].substring(1, cols[i].length()).toLowerCase());
					} else {
						tmp.append(cols[i].substring(0, 1).toUpperCase() + cols[i].substring(1, cols[i].length()).toLowerCase());						
					}
				}
				return tmp.toString();
			} else if((colName.indexOf("_") == 0)) {
				return colName.substring(1, colName.length());
			} else {
				return colName.toLowerCase();
			}
		}
		return name;
	}
}
