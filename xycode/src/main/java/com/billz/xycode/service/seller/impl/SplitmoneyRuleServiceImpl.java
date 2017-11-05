package com.billz.xycode.service.seller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.seller.SplitmoneyRuleMapper;
import com.billz.xycode.model.seller.SplitmoneyRule;
import com.billz.xycode.service.seller.SplitmoneyRuleService;

/**
 * @class SplitmoneyRuleServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class SplitmoneyRuleServiceImpl implements SplitmoneyRuleService {

	@Autowired
	private SplitmoneyRuleMapper mapper;
	
	@Override
	public Prb<SplitmoneyRule> findPageList(Psb<SplitmoneyRule> psb){
		return new Prb<SplitmoneyRule>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByRuleid(SplitmoneyRule splitmoneyRule){
		return mapper.updateByRuleid(splitmoneyRule);
	}
	
	@Override
	public int insert(SplitmoneyRule splitmoneyRule){
		return mapper.insert(splitmoneyRule);
	}
	
	@Override
	public int delByRuleid(Long ruleid){
		return mapper.delByRuleid(ruleid);
	}
	
	@Override
	public SplitmoneyRule findByRuleid(Long ruleid){
		return mapper.findByRuleid(ruleid);
	}
}