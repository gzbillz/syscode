package com.billz.xycode.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.user.UserAccountMapper;
import com.billz.xycode.model.user.UserAccount;
import com.billz.xycode.service.user.UserAccountService;

/**
 * @class UserAccountServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountMapper mapper;
	
	@Override
	public Prb<UserAccount> findPageList(Psb<UserAccount> psb){
		return new Prb<UserAccount>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByUaid(UserAccount userAccount){
		return mapper.updateByUaid(userAccount);
	}
	
	@Override
	public int insert(UserAccount userAccount){
		return mapper.insert(userAccount);
	}
	
	@Override
	public int delByUaid(Long uaid){
		return mapper.delByUaid(uaid);
	}
	
	@Override
	public UserAccount findByUaid(Long uaid){
		return mapper.findByUaid(uaid);
	}
	
	@Override
	public UserAccount findByUid(Long uid) {
		return mapper.findByUid(uid);
	}
	
	@Override
	public int updateBalanceByUaid(Long uaid, double balance) {
		return mapper.updateBalanceByUaid(uaid, balance);
	}
	
	@Override
	public double findBalanceByUid(Long uid) {
		return mapper.findBalanceByUid(uid);
	}
	
	@Override
	public long findUaidByUid(Long uid) {
		return mapper.findUaidByUid(uid);
	}
}