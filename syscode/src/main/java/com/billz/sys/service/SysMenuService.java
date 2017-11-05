package com.billz.sys.service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.model.SysMenu;

/**
 * @class SysMenuService.java
 * @author billz
 * @date 2017-09-25
 */
public interface SysMenuService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<SysMenu> findPageList(Psb<SysMenu> psb);
	
	int updateByMenuid(SysMenu sysMenu);
	
	int insert(SysMenu sysMenu);
	
	int delByMenuid(Integer menuid);
	
	SysMenu findByMenuid(Integer menuid);
}