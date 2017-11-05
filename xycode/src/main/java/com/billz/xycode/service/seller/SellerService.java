package com.billz.xycode.service.seller;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.seller.Seller;

/**
 * @class SellerService.java
 * @author billz
 * @date 2017-09-22
 */
public interface SellerService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<Seller> findPageList(Psb<Seller> psb);
	
	int updateBySellerid(Seller seller);
	
	int insert(Seller seller);
	
	int delBySellerid(Long sellerid);
	
	Seller findBySellerid(Long sellerid);
}