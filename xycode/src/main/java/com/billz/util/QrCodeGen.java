package com.billz.util;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 二维码生成
 * @class QrCodeGen.java
 * @author billz
 * @date 2017年10月12日
 */
public class QrCodeGen implements Serializable {
 
	private static final long serialVersionUID = 1L;

	/**
	 * 生成[消费订单]二维码(十六进制)
	 * @param posid 机器编号
	 * @param sycs 流水号
	 * @param userid 用户编号
	 * @param price 金额
	 * @param pwd des秘钥
	 * @return
	 */
	public synchronized static String genDesOrderConsume(String posid, int sycs, String userid, double price, String pwd){
		try {
			// 数据格式：设备编号[10位(16进制)],流水号[6位],用户编号[10位(16进制)],金额[4位],校验码[2位]是加密前的校验
			StringBuffer msg = new StringBuffer("");
			msg.append(posid); // 10位
			msg.append(String.format("%06X", sycs));
			msg.append(String.format("%s", userid));
			int ps = new BigDecimal(price).multiply(new BigDecimal(100)).intValue();
			msg.append(String.format("%04X", ps)); // 4位[X：大写16进制数字]
			msg.append(String.format("%02X", sycs)); // 2位
			
			// start.1.异或和，校验
			byte bb = ByteUtils.yhsum(ByteUtils.str2Bcd(msg.toString())); 
	 		String yhh = ByteUtils.bcd2Str(new byte[]{bb}); // 校验码
	 		// end.1.异或和，校验
	 		
			// start.2.des加密
			byte[] decryResult = new DesUtils().decrypt(ByteUtils.str2Bcd(msg.toString()), pwd); // 解密
			String descode = ByteUtils.bcd2Str(decryResult);
			// end.2.des加密
			
			return new StringBuffer(descode).append(yhh).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static void main(String[] args) { 
		String qr = genDesOrderConsume("3456789000", 1, "1000000001", 12, "0000000000000000");
		System.out.println("结果：" + qr);
		System.out.println("长度：" + qr.length());
	}
}
