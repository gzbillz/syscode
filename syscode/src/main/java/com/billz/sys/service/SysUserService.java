package com.billz.sys.service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.model.SysUser;

/**
 * @class SysUserService.java
 * @author billz
 * @date 2017-09-25
 */
public interface SysUserService {

	/**
	 * 分页查询
	 * 
	 * @param psb
	 * @return
	 */
	Prb<SysUser> findPageList(Psb<SysUser> psb);

	int updateByUserid(SysUser sysUser);

	int insert(SysUser sysUser);

	int delByUserid(Long userid);

	SysUser findByUserid(Long userid);
	
	/**
	 * 登录操作
	 * @param uname
	 * @param pwd
	 * @return
	 */
	SysUser findByUnameAndPwd(String uname, String pwd);
	
	/**
	 * 更新登录信息
	 * @param userid
	 * @param ip
	 * @return
	 */
	int updateLoginByUserid(Long userid, String ip);
}