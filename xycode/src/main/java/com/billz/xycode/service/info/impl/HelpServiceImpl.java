package com.billz.xycode.service.info.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.info.HelpMapper;
import com.billz.xycode.model.info.Help;
import com.billz.xycode.service.info.HelpService;

/**
 * @class HelpServiceImpl.java
 * @author billz
 * @date 2017-09-25
 */
@Service
public class HelpServiceImpl implements HelpService {

	@Autowired
	private HelpMapper mapper;
	
	@Override
	public Prb<Help> findPageList(Psb<Help> psb){
		return new Prb<Help>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateById(Help help){
		return mapper.updateById(help);
	}
	
	@Override
	public int insert(Help help){
		return mapper.insert(help);
	}
	
	@Override
	public int delById(Integer id){
		return mapper.delById(id);
	}
	
	@Override
	public Help findById(Integer id){
		return mapper.findById(id);
	}
}