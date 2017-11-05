package com.billz.sys.service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.model.SysRole;

/**
 * @class SysRoleService.java
 * @author billz
 * @date 2017-09-25
 */
public interface SysRoleService {

	/**
	 * 分页查询
	 * 
	 * @param psb
	 * @return
	 */
	Prb<SysRole> findPageList(Psb<SysRole> psb);

	int updateByRoleid(SysRole sysRole);

	int insert(SysRole sysRole);

	int delByRoleid(Long roleid);

	SysRole findByRoleid(Long roleid);
}