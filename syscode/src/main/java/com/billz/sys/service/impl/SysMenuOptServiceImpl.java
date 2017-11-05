package com.billz.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.dao.SysMenuOptMapper;
import com.billz.sys.model.SysMenuOpt;
import com.billz.sys.service.SysMenuOptService;

/**
 * @class SysMenuOptServiceImpl.java
 * @author billz
 * @date 2017-09-25
 */
@Service
public class SysMenuOptServiceImpl implements SysMenuOptService {

	@Autowired
	private SysMenuOptMapper mapper;

	@Override
	public Prb<SysMenuOpt> findPageList(Psb<SysMenuOpt> psb) {
		return new Prb<SysMenuOpt>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}

	@Override
	public int updateByOptid(SysMenuOpt sysMenuOpt) {
		return mapper.updateByOptid(sysMenuOpt);
	}

	@Override
	public int insert(SysMenuOpt sysMenuOpt) {
		return mapper.insert(sysMenuOpt);
	}

	@Override
	public int delByOptid(Integer optid) {
		return mapper.delByOptid(optid);
	}

	@Override
	public SysMenuOpt findByOptid(Integer optid) {
		return mapper.findByOptid(optid);
	}
}