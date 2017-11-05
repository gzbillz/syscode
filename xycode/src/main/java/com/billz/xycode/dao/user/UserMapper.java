package com.billz.xycode.dao.user;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.user.User;

/**
 * @class UserMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface UserMapper {

	int findPageCount(Psb<User> user);

	List<User> findPageList(Psb<User> user);

	User findByUid(@Param("uid") Long uid);
	
	String findUseridByUid(@Param("uid") Long uid);

	int delByUid(@Param("uid") Long uid);

	int updateByUid(User user);
	
	int updateSampleByUid(User user);

	int insert(User user);

	/**
	 * 手机号查询
	 * 
	 * @param phone
	 *            手机号
	 * @return
	 */
	User findByPhone(@Param("phone") String phone);

	/**
	 * 根据用户编号查询用户
	 * 
	 * @param userid
	 *            用户编号
	 * @return
	 */
	User findByUserid(@Param("userid") String userid);

	/**
	 * 获取最大的userid
	 * 
	 * @return
	 */
	String findMaxUserid();

	/**
	 * 根据wxopenid查询用户详细信息
	 * 
	 * @param wxopenid
	 * @return
	 */
	User findByWxopenid(@Param("wxopenid") String wxopenid);
	
	/**
	 * 设置用户的wxopenid
	 * @param uid 用户主键
	 * @param wxopenid 微信openid
	 * @return
	 */
	int updateSetWxopenidByUid(@Param("uid") Long uid, @Param("wxopenid") String wxopenid);
}
