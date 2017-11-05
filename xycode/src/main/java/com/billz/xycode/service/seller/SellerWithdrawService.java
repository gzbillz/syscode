package com.billz.xycode.service.seller;

import java.util.Map;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.seller.SellerWithdraw;

/**
 * @class SellerWithdrawService.java
 * @author billz
 * @date 2017-10-23
 */
public interface SellerWithdrawService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<SellerWithdraw> findPageList(Psb<SellerWithdraw> psb);
	
	Prb<SellerWithdraw> findPageListBySellerid(Psb<Map<String, Object>> psb);
	
	int updateBySwid(SellerWithdraw sellerWithdraw);
	
	int insert(SellerWithdraw sellerWithdraw);
	
	int delBySwid(Long swid);
	
	SellerWithdraw findBySwid(Long swid);
}