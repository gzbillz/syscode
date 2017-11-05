package com.billz.xycode.service.seller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.seller.SellerMapper;
import com.billz.xycode.model.seller.Seller;
import com.billz.xycode.service.seller.SellerService;

/**
 * @class SellerServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerMapper mapper;
	
	@Override
	public Prb<Seller> findPageList(Psb<Seller> psb){
		return new Prb<Seller>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateBySellerid(Seller seller){
		return mapper.updateBySellerid(seller);
	}
	
	@Override
	public int insert(Seller seller){
		return mapper.insert(seller);
	}
	
	@Override
	public int delBySellerid(Long sellerid){
		return mapper.delBySellerid(sellerid);
	}
	
	@Override
	public Seller findBySellerid(Long sellerid){
		return mapper.findBySellerid(sellerid);
	}
}