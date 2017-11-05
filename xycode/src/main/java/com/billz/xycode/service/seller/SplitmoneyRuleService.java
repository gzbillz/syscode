package com.billz.xycode.service.seller;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.seller.SplitmoneyRule;

/**
 * @class SplitmoneyRuleService.java
 * @author billz
 * @date 2017-09-22
 */
public interface SplitmoneyRuleService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<SplitmoneyRule> findPageList(Psb<SplitmoneyRule> psb);
	
	int updateByRuleid(SplitmoneyRule splitmoneyRule);
	
	int insert(SplitmoneyRule splitmoneyRule);
	
	int delByRuleid(Long ruleid);
	
	SplitmoneyRule findByRuleid(Long ruleid);
}