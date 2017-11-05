package com.billz.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.dao.SysRoleMapper;
import com.billz.sys.model.SysRole;
import com.billz.sys.service.SysRoleService;

/**
 * @class SysRoleServiceImpl.java
 * @author billz
 * @date 2017-09-25
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleMapper mapper;
	
	@Override
	public Prb<SysRole> findPageList(Psb<SysRole> psb){
		return new Prb<SysRole>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByRoleid(SysRole sysRole){
		return mapper.updateByRoleid(sysRole);
	}
	
	@Override
	public int insert(SysRole sysRole){
		return mapper.insert(sysRole);
	}
	
	@Override
	public int delByRoleid(Long roleid){
		return mapper.delByRoleid(roleid);
	}
	
	@Override
	public SysRole findByRoleid(Long roleid){
		return mapper.findByRoleid(roleid);
	}
}