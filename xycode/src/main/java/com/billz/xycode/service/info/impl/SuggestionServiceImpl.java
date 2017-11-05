package com.billz.xycode.service.info.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.info.SuggestionMapper;
import com.billz.xycode.model.info.Suggestion;
import com.billz.xycode.service.info.SuggestionService;

/**
 * @class SuggestionServiceImpl.java
 * @author billz
 * @date 2017-09-25
 */
@Service
public class SuggestionServiceImpl implements SuggestionService {

	@Autowired
	private SuggestionMapper mapper;
	
	@Override
	public Prb<Suggestion> findPageList(Psb<Suggestion> psb){
		return new Prb<Suggestion>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateBySugid(Suggestion suggestion){
		return mapper.updateBySugid(suggestion);
	}
	
	@Override
	public int insert(Suggestion suggestion){
		return mapper.insert(suggestion);
	}
	
	@Override
	public int delBySugid(Long sugid){
		return mapper.delBySugid(sugid);
	}
	
	@Override
	public Suggestion findBySugid(Long sugid){
		return mapper.findBySugid(sugid);
	}
}