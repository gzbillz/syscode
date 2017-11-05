package com.billz.xycode.service.info;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.info.Suggestion;

/**
 * @class SuggestionService.java
 * @author billz
 * @date 2017-09-25
 */
public interface SuggestionService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<Suggestion> findPageList(Psb<Suggestion> psb);
	
	int updateBySugid(Suggestion suggestion);
	
	int insert(Suggestion suggestion);
	
	int delBySugid(Long sugid);
	
	Suggestion findBySugid(Long sugid);
}