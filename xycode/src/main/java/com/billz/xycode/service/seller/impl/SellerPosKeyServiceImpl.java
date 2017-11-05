package com.billz.xycode.service.seller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.seller.SellerPosKeyMapper;
import com.billz.xycode.model.seller.SellerPosKey;
import com.billz.xycode.service.seller.SellerPosKeyService;

/**
 * @class SellerPosKeyServiceImpl.java
 * @author billz
 * @date 2017-10-25
 */
@Service
public class SellerPosKeyServiceImpl implements SellerPosKeyService {

	@Autowired
	private SellerPosKeyMapper mapper;

	@Override
	public Prb<SellerPosKey> findPageList(Psb<SellerPosKey> psb) {
		return new Prb<SellerPosKey>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}

	@Override
	public int updateByKid(SellerPosKey sellerPosKey) {
		return mapper.updateByKid(sellerPosKey);
	}

	@Override
	public int insert(SellerPosKey sellerPosKey) {
		return mapper.insert(sellerPosKey);
	}

	@Override
	public int delByKid(Long kid) {
		return mapper.delByKid(kid);
	}

	@Override
	public SellerPosKey findByKid(Long kid) {
		return mapper.findByKid(kid);
	}
	
	@Override
	public String findKeyByPosid(String posid, Long sellerid, Long pid, Integer cateid, Integer subcateid) {
		return mapper.findKeyByPosid(posid, sellerid, pid, cateid, subcateid);
	}
	
	@Override
	public String findDjKeyByPosid(String posid, Long sellerid, Long pid, Integer cateid, Integer subcateid) {
		return mapper.findDjKeyByPosid(posid, sellerid, pid, cateid, subcateid);
	}
}