package com.billz.xycode.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.user.UserMapper;
import com.billz.xycode.model.user.User;
import com.billz.xycode.service.user.UserService;

/**
 * @class UserServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public Prb<User> findPageList(Psb<User> psb){
		return new Prb<User>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByUid(User user){
		return mapper.updateByUid(user);
	}
	
	@Override
	public int updateSampleByUid(User user) {
		return mapper.updateSampleByUid(user);
	}
	
	@Override
	public int insert(User user){
		return mapper.insert(user);
	}
	
	@Override
	public int delByUid(Long uid){
		return mapper.delByUid(uid);
	}
	
	@Override
	public User findByUid(Long uid){
		return mapper.findByUid(uid);
	}
	
	@Override
	public String findUseridByUid(Long uid) {
		return mapper.findUseridByUid(uid);
	}

	@Override
	public User findByPhone(String phone) {
		return mapper.findByPhone(phone);
	}
	
	@Override
	public User findByUserid(String userid) {
		return mapper.findByUserid(userid);
	}
	
	@Override
	public String findMaxUserid() {
		return mapper.findMaxUserid();
	}
	
	@Override
	public int insertByWxOpenid(User user) {
		String maxUserid = mapper.findMaxUserid();
		user.setUserid(String.valueOf(Long.valueOf(maxUserid) + 1));
		user.setNickname(user.getUserid());
		user.setStatus(true);
		return mapper.insert(user);
	}
	
	@Override
	public User findByWxopenid(String wxopenid) {
		return mapper.findByWxopenid(wxopenid);
	}
	
	@Override
	public int updateSetWxopenidByUid(Long uid, String wxopenid) {
		return mapper.updateSetWxopenidByUid(uid, wxopenid);
	}
}