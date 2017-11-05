package com.billz.sys.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.sys.model.SysUser;

/**
 * @class SysUserMapper.java
 * @author billz
 * @date 2017-09-25
 */
@Repository
public interface SysUserMapper {

	int findPageCount(Psb<SysUser> sysUser);
	
	List<SysUser> findPageList(Psb<SysUser> sysUser);
	
	SysUser findByUserid(@Param("userid") Long userid);
	
	int delByUserid(@Param("userid") Long userid);

	int updateByUserid(SysUser sysUser);
	
	int insert(SysUser sysUser);
	
	/**
	 * 登录
	 * @param uname 账号
	 * @param pwd 密码
	 * @return
	 */
	SysUser findByUnameAndPwd(@Param("uname") String uname, @Param("pwd") String pwd);
	
	/**
	 * 更新登录时间IP
	 * @param userid
	 * @param ip
	 * @return
	 */
	int updateLoginByUserid(@Param("userid") Long userid, @Param("ip") String ip);
}

