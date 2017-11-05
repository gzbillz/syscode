package com.billz.util;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 * DES加密和解密过程中，密钥长度都必须是8的倍数
 * @class DesUtils.java
 * @author billz
 * @date 2017-07-18
 */
public class DesUtils {

	public static void main(String[] args) {
		DesUtils ts = new DesUtils();
		try {
			// 加密(08CAD3E0613CADC1)
			// 解密(0123456789003001)
 			byte[] t2 = ByteUtils.str2Bcd("0123456789003001");
  	 
			String password = "0000000000000000";
			byte[] result = ts.desCrypto(t2, password); // 加密
			System.out.println("加密后：" + bytes2HexString(result));
			
			byte[] t3 = ByteUtils.str2Bcd("08CAD3E0613CADC1");
			byte[] decryResult = ts.decrypt(t3, password); // 解密
			System.out.println("解密内容：" + ByteUtils.bcd2Str(decryResult));
			
 			byte[] t31 = ByteUtils.str2Bcd("08CAD3E0613CADC1");
			byte[] decryResult1 = ts.decrypt(t31, password); // 解密
			System.out.println("解密内容：" + ByteUtils.bcd2Str(decryResult1));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	/** 
	 * Convert hex string to byte[] 
	 * @param hexString the hex string 
	 * @return byte[] 
	 */  
	public static byte[] hexStringToBytes(String hexString) {  
	    if (hexString == null || hexString.equals("")) {  
	        return null;  
	    }  
	    hexString = hexString.toUpperCase();  
	    int length = hexString.length() / 2;  
	    char[] hexChars = hexString.toCharArray();  
	    byte[] d = new byte[length];  
	    for (int i = 0; i < length; i++) {  
	        int pos = i * 2;  
	        d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));  
	    }  
	    return d;  
	}  
	/** 
	 * Convert char to byte 
	 * @param c char 
	 * @return byte 
	 */  
	 private static byte charToByte(char c) {  
	    return (byte) "0123456789ABCDEF".indexOf(c);  
	}  
	
	public static String bytes2HexString(byte[] b) {   
		String ret = "";   
		for (int i = 0; i < b.length; i++) {   
			String hex = Integer.toHexString(b[ i ] & 0xFF);   
			if (hex.length() == 1) {   
				hex = '0' + hex;   
			}   
			ret += hex.toUpperCase();   
		}   
		return ret;   
	} 
 
	/** 
	 * des加密 
	 * @param datasource
	 * @param password 秘钥
	 * @return
	 */
	public byte[] desCrypto(byte[] datasource, String password) {
		try {
 			// 创建一个密匙工厂，然后用它把DESKeySpec转换成
			SecretKey securekey = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(ByteUtils.str2Bcd(password)));
			// Cipher对象实际完成加密操作
			Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
			// 用密匙初始化Cipher对象
			cipher.init(Cipher.ENCRYPT_MODE, securekey, new SecureRandom());
			// 现在，获取数据并加密
			// 正式执行加密操作
			return cipher.doFinal(datasource);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * des解密 
	 * @param src
	 * @param password 秘钥
	 * @return 
	 */
	public byte[] decrypt(byte[] src, String password) throws Exception {
		// 将DESKeySpec对象转换成SecretKey对象
		SecretKey securekey = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(ByteUtils.str2Bcd(password)));
		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.DECRYPT_MODE, securekey, new SecureRandom());
		// 真正开始解密操作
		return cipher.doFinal(src);
	}
	
	/**
	 * des解密处理
	 * @param deskey des解密秘钥
	 * @param code 加密的数据
	 * @return
	 */
	public String desJm(String deskey, String code){
		try { 
			return ByteUtils.bcd2Str(decrypt(ByteUtils.str2Bcd(code), deskey));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return "";
	}
}
