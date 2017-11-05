package com.billz.xycode.service.seller;

import java.util.Map;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.seller.SellerAccountHis;

/**
 * @class SellerAccountHisService.java
 * @author billz
 * @date 2017-09-22
 */
public interface SellerAccountHisService {
 
	Prb<SellerAccountHis> findPageList(Psb<SellerAccountHis> psb);
	
	Prb<SellerAccountHis> findPageListBySaid(Psb<Map<String, Object>> psb);
	
	int updateBySahid(SellerAccountHis sellerAccountHis);
	
	int insert(SellerAccountHis sellerAccountHis);
	
	int delBySahid(Long sahid);
	
	SellerAccountHis findBySahid(Long sahid);
}