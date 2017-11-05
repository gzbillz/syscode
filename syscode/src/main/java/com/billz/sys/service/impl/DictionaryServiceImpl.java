package com.billz.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.dao.DictionaryMapper;
import com.billz.sys.model.Dictionary;
import com.billz.sys.service.DictionaryService;

/**
 * @class DictionaryServiceImpl.java
 * @author billz
 * @date 2017-09-25
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {

	@Autowired
	private DictionaryMapper mapper;

	@Override
	public Prb<Dictionary> findPageList(Psb<Dictionary> psb) {
		return new Prb<Dictionary>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}

	@Override
	public int updateById(Dictionary dictionary) {
		return mapper.updateById(dictionary);
	}

	@Override
	public int insert(Dictionary dictionary) {
		return mapper.insert(dictionary);
	}

	@Override
	public int delById(Integer id) {
		return mapper.delById(id);
	}

	@Override
	public Dictionary findById(Integer id) {
		return mapper.findById(id);
	}
}