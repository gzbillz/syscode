package com.billz.xycode.service.user;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.user.User;

/**
 * @class UserService.java
 * @author billz
 * @date 2017-09-22
 */
public interface UserService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<User> findPageList(Psb<User> psb);
	
	int updateByUid(User user);
	
	int updateSampleByUid(User user);
	
	int insert(User user);
	
	int delByUid(Long uid);
	
	User findByUid(Long uid);
	
	String findUseridByUid(Long uid);
	
	/**
	 * 手机号查询
	 * @param phone 手机号
	 * @return
	 */
	User findByPhone(String phone);
	
	User findByUserid(String userid);
	
	/**
	 * 获取最大的userid
	 * @return
	 */
	String findMaxUserid();
	
	/**
	 * 根据wxopenid添加数据
	 * @param user
	 * @return
	 */
	int insertByWxOpenid(User user);
	
	/**
	 * 根据wxopenid查询用户详细信息
	 * @param wxopenid
	 * @return
	 */
	User findByWxopenid(String wxopenid);
	
	/**
	 * 设置用户的wxopenid
	 * @param uid 用户主键
	 * @param wxopenid 微信openid
	 * @return
	 */
	int updateSetWxopenidByUid(Long uid, String wxopenid);
}