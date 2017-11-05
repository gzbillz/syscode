package com.billz.xycode.service.seller;

import java.util.List;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.seller.SellerAccount;

/**
 * @class SellerAccountService.java
 * @author billz
 * @date 2017-09-22
 */
public interface SellerAccountService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<SellerAccount> findPageList(Psb<SellerAccount> psb);
	
	int updateBySaid(SellerAccount sellerAccount);
	
	int insert(SellerAccount sellerAccount);
	
	int delBySaid(Long said);
	
	SellerAccount findBySaid(Long said);
	
	SellerAccount findBySelleridAndSatype(Long sellerid, int satype);
	
	/**
	 * 更新商家账户钱包余额
	 * @param said 钱包主键
	 * @param balance 余额
	 * @return
	 */
	int updateBalanceBySaid(Long said, double balance);
	
	/**
	 * 根据商家主键，查询对应的所有账户
	 * @param sellerid 商家编号
	 * @return
	 */
	List<SellerAccount> findBySellerid(Long sellerid);
}