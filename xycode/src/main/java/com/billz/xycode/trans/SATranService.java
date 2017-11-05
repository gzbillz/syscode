package com.billz.xycode.trans;

/**
 * 商家账户更新处理
 * @class SATranService.java
 * @author billz
 * @date 2017年10月9日
 */
public interface SATranService {

	/**
	 * 更新商家钱包余额，并添加交易记录
 	 * @param sellerid 商家主键
 	 * @param satype 商家钱包类型
	 * @param price 金额
	 * @param isRz 是否入账
	 * @param remark 交易描述
	 * @return
	 */
	public int updateSellerAccount(Long sellerid, int satype, double price, boolean isRz, String remark);
}
