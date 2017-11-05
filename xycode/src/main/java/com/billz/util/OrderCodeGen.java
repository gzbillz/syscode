package com.billz.util;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *  订单号的生成
 * @class OrderCodeGen.java
 * @author billz
 * @date 2017年7月26日
 */
public class OrderCodeGen implements Serializable {

	private static final long serialVersionUID = 1L;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSS");
	
	
	/**
	 * 生成16位订单号,订单号格式[80+年月日+时分秒+毫秒]
	 */
	public synchronized static String gen80OrderCode(){
		return "80" + sdf.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * 用户账户，充值订单号
	 * 生成16位订单号,订单号格式[80+年月日+时分秒+毫秒]
	 */
	public synchronized static String gen20OrderCode(){
		return "20" + sdf.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * 生成16位订单号,订单号格式[80+年月日+时分秒+毫秒]
	 */
	public synchronized static String genOrderCode(int cateid){
		return "80" + sdf.format(Calendar.getInstance().getTime());
	}
}
