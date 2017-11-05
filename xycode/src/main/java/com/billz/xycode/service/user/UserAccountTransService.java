package com.billz.xycode.service.user;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.user.UserAccountTrans;

/**
 * @class UserAccountTransService.java
 * @author billz
 * @date 2017-10-07
 */
public interface UserAccountTransService {

	/**
	 * 分页查询
	 * 
	 * @param psb
	 * @return
	 */
	Prb<UserAccountTrans> findPageList(Psb<UserAccountTrans> psb);

	int updateByTid(UserAccountTrans userAccountTrans);

	int insert(UserAccountTrans userAccountTrans);

	int delByTid(Long tid);

	UserAccountTrans findByTid(Long tid);
}