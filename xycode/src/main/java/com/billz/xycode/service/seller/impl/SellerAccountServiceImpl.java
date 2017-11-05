package com.billz.xycode.service.seller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.seller.SellerAccountMapper;
import com.billz.xycode.model.seller.SellerAccount;
import com.billz.xycode.service.seller.SellerAccountService;

/**
 * @class SellerAccountServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class SellerAccountServiceImpl implements SellerAccountService {

	@Autowired
	private SellerAccountMapper mapper;
	
	@Override
	public Prb<SellerAccount> findPageList(Psb<SellerAccount> psb){
		return new Prb<SellerAccount>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateBySaid(SellerAccount sellerAccount){
		return mapper.updateBySaid(sellerAccount);
	}
	
	@Override
	public int insert(SellerAccount sellerAccount){
		return mapper.insert(sellerAccount);
	}
	
	@Override
	public int delBySaid(Long said){
		return mapper.delBySaid(said);
	}
	
	@Override
	public SellerAccount findBySaid(Long said){
		return mapper.findBySaid(said);
	}
	
	@Override
	public SellerAccount findBySelleridAndSatype(Long sellerid, int satype) {
		return mapper.findBySelleridAndSatype(sellerid, satype);
	}
	
	@Override
	public int updateBalanceBySaid(Long said, double balance) {
		return mapper.updateBalanceBySaid(said, balance);
	}
	
	@Override
	public List<SellerAccount> findBySellerid(Long sellerid) {
		return mapper.findBySellerid(sellerid);
	}
}