package com.billz.xycode.trans.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.billz.xycode.model.user.UserAccount;
import com.billz.xycode.model.user.UserAccountTrans;
import com.billz.xycode.service.user.UserAccountService;
import com.billz.xycode.service.user.UserAccountTransService;
import com.billz.xycode.service.user.UserService;
import com.billz.xycode.trans.UATranService;

/**
 * 用户账户余额更新
 * @class UATranServiceImpl.java
 * @author billz
 * @date 2017年10月8日
 */
@Service
public class UATranServiceImpl implements UATranService {
 
	@Autowired
	private UserService userService;
	@Autowired
	private UserAccountService userAccountService;
	@Autowired
	private UserAccountTransService userAccountTransService;

	// 入账
	@Override
	public int doRz(Long uid, String userid, double price, int remark) {
		if(price <= 0){
			return 0;
		}
		UserAccount ua = userAccountService.findByUid(uid); // 1.获取用户账户 
		if(ua != null){
			if(userid == null || StringUtils.isEmpty(userid)){
				userid = userService.findUseridByUid(uid); // 用户编号
			}
			double balance = ua.getBalance().doubleValue() + price;
			userAccountService.updateBalanceByUaid(ua.getUaid(), balance); // 更新账户余额
			
			UserAccountTrans uat = new UserAccountTrans(); // 添加账户交易记录
			uat.setTtype(true);
			uat.setFromuid(uid);
			uat.setFname(userid);
			uat.setTouid(uid);
			uat.setTname(userid);
			uat.setRemark(remark);
			uat.setPrice(price);
			uat.setBprice(ua.getBalance());
			uat.setAprice(balance);
			userAccountTransService.insert(uat);
			return 1;
		}
 		return 0;
	}
	
	// 出账[验证余额不足]
	@Override
	public int doCz(Long uid, String userid, double price, int remark) {
		if(price <= 0){
			return 0;
		}
		UserAccount ua = userAccountService.findByUid(uid); // 1.获取用户账户 
		if(ua != null){
			double balance = ua.getBalance().doubleValue() - price;
			if(balance < 0){
				return 0; // 结束[余额不足]
			}
			userAccountService.updateBalanceByUaid(ua.getUaid(), balance); // 更新账户余额
			
			UserAccountTrans uat = new UserAccountTrans(); // 添加账户交易记录
			uat.setTtype(false);
			uat.setFromuid(uid);
			uat.setFname(userid);
			uat.setTouid(uid);
			uat.setTname(userid);
			uat.setRemark(remark);
			uat.setPrice(price);
			uat.setBprice(ua.getBalance());
			uat.setAprice(balance);
			userAccountTransService.insert(uat);
			return 1;
		}
 		return 0;
	}
	
}
