package com.billz.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

/**
 * Base64加密，解密
 * @class Base64Util.java
 * @author billz
 * @date 2017年10月6日
 */
public class Base64Util {

	private static final String UTF_8 = "UTF-8";

	/**
	 * 对给定的字符串进行base64解码操作
	 * @param inputData
	 */
	public static String decodeData(String inputData) {
		try {
			if (null == inputData) {
				return null;
			}
			return new String(Base64.decodeBase64(inputData.getBytes(UTF_8)), UTF_8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 对给定的字符串进行base64加密操作
	 * @param inputData
	 */
	public static String encodeData(String inputData) {
		try {
			if (null == inputData) {
				return null;
			}
			return new String(Base64.encodeBase64(inputData.getBytes(UTF_8)), UTF_8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return null;
	}

}
