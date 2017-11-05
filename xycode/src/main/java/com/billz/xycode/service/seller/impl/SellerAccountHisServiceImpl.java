package com.billz.xycode.service.seller.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.seller.SellerAccountHisMapper;
import com.billz.xycode.model.seller.SellerAccountHis;
import com.billz.xycode.service.seller.SellerAccountHisService;

/**
 * @class SellerAccountHisServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class SellerAccountHisServiceImpl implements SellerAccountHisService {

	@Autowired
	private SellerAccountHisMapper mapper;
	
	@Override
	public Prb<SellerAccountHis> findPageList(Psb<SellerAccountHis> psb){
		return new Prb<SellerAccountHis>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public Prb<SellerAccountHis> findPageListBySaid(Psb<Map<String, Object>> psb) {
		return new Prb<SellerAccountHis>(mapper.findPageListBySaid(psb), mapper.findPageCountBySaid(psb));
	}
	
	@Override
	public int updateBySahid(SellerAccountHis sellerAccountHis){
		return mapper.updateBySahid(sellerAccountHis);
	}
	
	@Override
	public int insert(SellerAccountHis sellerAccountHis){
		return mapper.insert(sellerAccountHis);
	}
	
	@Override
	public int delBySahid(Long sahid){
		return mapper.delBySahid(sahid);
	}
	
	@Override
	public SellerAccountHis findBySahid(Long sahid){
		return mapper.findBySahid(sahid);
	}
}