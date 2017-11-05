package com.billz.xycode.service.user;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.user.UserAccount;

/**
 * @class UserAccountService.java
 * @author billz
 * @date 2017-09-22
 */
public interface UserAccountService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<UserAccount> findPageList(Psb<UserAccount> psb);
	
	int updateByUaid(UserAccount userAccount);
	
	int insert(UserAccount userAccount);
	
	int delByUaid(Long uaid);
	
	UserAccount findByUaid(Long uaid);
	
	UserAccount findByUid(Long uid);
	
	/**
	 * 更新用户账户余额
	 * @param uaid 账户主键
	 * @param balance 余额
	 * @return
	 */
	int updateBalanceByUaid(Long uaid, double balance);
	
	/**
	 * 获取用户余额
	 * @param uid 用户主键
	 * @return 用户账户余额
	 */
	double findBalanceByUid(Long uid);
	
	/**
	 * 获取用户账户主键
	 * 
	 * @param uid
	 *            用户主键
	 * @return
	 */
	long findUaidByUid(Long uid);
}