package com.billz.xycode.service.seller.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.seller.SellerWithdrawMapper;
import com.billz.xycode.model.seller.SellerWithdraw;
import com.billz.xycode.service.seller.SellerWithdrawService;

/**
 * @class SellerWithdrawServiceImpl.java
 * @author billz
 * @date 2017-10-23
 */
@Service
public class SellerWithdrawServiceImpl implements SellerWithdrawService {

	@Autowired
	private SellerWithdrawMapper mapper;
	
	@Override
	public Prb<SellerWithdraw> findPageList(Psb<SellerWithdraw> psb){
		return new Prb<SellerWithdraw>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public Prb<SellerWithdraw> findPageListBySellerid(Psb<Map<String, Object>> psb) {
		return new Prb<SellerWithdraw>(mapper.findPageListBySellerid(psb), mapper.findPageCountBySellerid(psb));
	}
	
	@Override
	public int updateBySwid(SellerWithdraw sellerWithdraw){
		return mapper.updateBySwid(sellerWithdraw);
	}
	
	@Override
	public int insert(SellerWithdraw sellerWithdraw){
		return mapper.insert(sellerWithdraw);
	}
	
	@Override
	public int delBySwid(Long swid){
		return mapper.delBySwid(swid);
	}
	
	@Override
	public SellerWithdraw findBySwid(Long swid){
		return mapper.findBySwid(swid);
	}
}