package com.billz.xycode.dao.user;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.user.UserAccount;

/**
 * @class UserAccountMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface UserAccountMapper {

	int findPageCount(Psb<UserAccount> userAccount);

	List<UserAccount> findPageList(Psb<UserAccount> userAccount);

	UserAccount findByUaid(@Param("uaid") Long uaid);

	int delByUaid(@Param("uaid") Long uaid);

	int updateByUaid(UserAccount userAccount);

	int insert(UserAccount userAccount);

	UserAccount findByUid(@Param("uid") Long uid);

	/**
	 * 更新用户账户余额
	 * 
	 * @param uaid
	 *            账户主键
	 * @param balance
	 *            余额
	 * @return
	 */
	int updateBalanceByUaid(@Param("uaid") Long uaid, @Param("balance") double balance);

	/**
	 * 获取用户余额
	 * 
	 * @param uid
	 *            用户主键
	 * @return 用户账户余额
	 */
	double findBalanceByUid(@Param("uid") Long uid);

	/**
	 * 获取用户账户主键
	 * 
	 * @param uid
	 *            用户主键
	 * @return
	 */
	long findUaidByUid(@Param("uid") Long uid);
	 
}
