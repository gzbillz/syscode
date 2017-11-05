package com.billz.util;

import java.io.File;

/**
 * @class PathUtils.java
 * @author billz
 * @date 2017年9月14日
 */
public class PathUtils {

	/**
	 * 获取classpath
	 */
	public static String getClasspath() {
		String path = (String.valueOf(Thread.currentThread()
				.getContextClassLoader().getResource("")) + "../../")
				.replaceAll("file:/", "").replaceAll("%20", " ").trim();
		if (path.indexOf(":") != 1) {
			path = File.separator + path;
		}
		return path;
	}
	
	/**
	 * 获取getClassResources
	 */
	public static String getClassResources() {
		String path = (String.valueOf(Thread.currentThread()
				.getContextClassLoader().getResource("")))
				.replaceAll("file:/", "").replaceAll("%20", " ").trim();
		if (path.indexOf(":") != 1) {
			path = File.separator + path;
		}
		return path;
	}
}
