package com.billz.xycode.trans;

/**
 * 用户账户余额更新
 * @class UATranService.java
 * @author billz
 * @date 2017年10月8日
 */

public interface UATranService {

	/**
	 * 用户账户余额【入账】，并添加交易记录
	 * 
	 * @param uid
	 *            用户主键
	 * @param userid
	 *            用户账号
	 * @param price
	 *            金额
	 * @param remark
	 *            交易描述代码
	 * @return
	 */
	public int doRz(Long uid, String userid, double price, int remark);

	/**
	 * 用户账户余额【出账】，并添加交易记录
	 * 
	 * @param uid
	 *            用户主键
	 * @param userid
	 *            用户账号
	 * @param price
	 *            金额
	 * @param remark
	 *            交易描述代码
	 * @return
	 */
	public int doCz(Long uid, String userid, double price, int remark);
}