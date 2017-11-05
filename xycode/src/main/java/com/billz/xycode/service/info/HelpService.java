package com.billz.xycode.service.info;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.info.Help;

/**
 * @class HelpService.java
 * @author billz
 * @date 2017-09-25
 */
public interface HelpService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<Help> findPageList(Psb<Help> psb);
	
	int updateById(Help help);
	
	int insert(Help help);
	
	int delById(Integer id);
	
	Help findById(Integer id);
}