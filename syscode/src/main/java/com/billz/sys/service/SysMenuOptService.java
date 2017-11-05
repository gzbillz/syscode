package com.billz.sys.service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.model.SysMenuOpt;

/**
 * @class SysMenuOptService.java
 * @author billz
 * @date 2017-09-25
 */
public interface SysMenuOptService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<SysMenuOpt> findPageList(Psb<SysMenuOpt> psb);
	
	int updateByOptid(SysMenuOpt sysMenuOpt);
	
	int insert(SysMenuOpt sysMenuOpt);
	
	int delByOptid(Integer optid);
	
	SysMenuOpt findByOptid(Integer optid);
}