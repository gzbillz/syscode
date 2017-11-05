package com.billz.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.dao.SysUserMapper;
import com.billz.sys.model.SysUser;
import com.billz.sys.service.SysUserService;

/**
 * @class SysUserServiceImpl.java
 * @author billz
 * @date 2017-09-25
 */
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper mapper;

	@Override
	public Prb<SysUser> findPageList(Psb<SysUser> psb) {
		return new Prb<SysUser>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}

	@Override
	public int updateByUserid(SysUser sysUser) {
		return mapper.updateByUserid(sysUser);
	}

	@Override
	public int insert(SysUser sysUser) {
		return mapper.insert(sysUser);
	}

	@Override
	public int delByUserid(Long userid) {
		return mapper.delByUserid(userid);
	}

	@Override
	public SysUser findByUserid(Long userid) {
		return mapper.findByUserid(userid);
	}
	
	/**
	 * 登录操作
	 */
	 @Override
	public SysUser findByUnameAndPwd(String uname, String pwd) {
		return mapper.findByUnameAndPwd(uname, pwd);
	}
	 
	 @Override
	public int updateLoginByUserid(Long userid, String ip) {
		return mapper.updateLoginByUserid(userid, ip);
	}
}