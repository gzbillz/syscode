package com.billz.xycode.dao.user;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.user.UserAccountTrans;

/**
 * @class UserAccountTransMapper.java
 * @author billz
 * @date 2017-10-07
 */
@Repository
public interface UserAccountTransMapper {

	int findPageCount(Psb<UserAccountTrans> userAccountTrans);

	List<UserAccountTrans> findPageList(Psb<UserAccountTrans> userAccountTrans);

	UserAccountTrans findByTid(@Param("tid") Long tid);

	int delByTid(@Param("tid") Long tid);

	int updateByTid(UserAccountTrans userAccountTrans);

	int insert(UserAccountTrans userAccountTrans);
}
