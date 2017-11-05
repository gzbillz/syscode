package com.billz.xycode.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.user.UserAccountTransMapper;
import com.billz.xycode.model.user.UserAccountTrans;
import com.billz.xycode.service.user.UserAccountTransService;

/**
 * @class UserAccountTransServiceImpl.java
 * @author billz
 * @date 2017-10-07
 */
@Service
public class UserAccountTransServiceImpl implements UserAccountTransService {

	@Autowired
	private UserAccountTransMapper mapper;

	@Override
	public Prb<UserAccountTrans> findPageList(Psb<UserAccountTrans> psb) {
		return new Prb<UserAccountTrans>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}

	@Override
	public int updateByTid(UserAccountTrans userAccountTrans) {
		return mapper.updateByTid(userAccountTrans);
	}

	@Override
	public int insert(UserAccountTrans userAccountTrans) {
		return mapper.insert(userAccountTrans);
	}

	@Override
	public int delByTid(Long tid) {
		return mapper.delByTid(tid);
	}

	@Override
	public UserAccountTrans findByTid(Long tid) {
		return mapper.findByTid(tid);
	}
}