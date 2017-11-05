package com.billz.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.dao.SysMenuMapper;
import com.billz.sys.model.SysMenu;
import com.billz.sys.service.SysMenuService;

/**
 * @class SysMenuServiceImpl.java
 * @author billz
 * @date 2017-09-25
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

	@Autowired
	private SysMenuMapper mapper;

	@Override
	public Prb<SysMenu> findPageList(Psb<SysMenu> psb) {
		return new Prb<SysMenu>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}

	@Override
	public int updateByMenuid(SysMenu sysMenu) {
		return mapper.updateByMenuid(sysMenu);
	}

	@Override
	public int insert(SysMenu sysMenu) {
		return mapper.insert(sysMenu);
	}

	@Override
	public int delByMenuid(Integer menuid) {
		return mapper.delByMenuid(menuid);
	}

	@Override
	public SysMenu findByMenuid(Integer menuid) {
		return mapper.findByMenuid(menuid);
	}
}