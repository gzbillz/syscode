package com.billz.sys.service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.sys.model.Dictionary;

/**
 * @class DictionaryService.java
 * @author billz
 * @date 2017-09-25
 */
public interface DictionaryService {

	/**
	 * 分页查询
	 * 
	 * @param psb
	 * @return
	 */
	Prb<Dictionary> findPageList(Psb<Dictionary> psb);

	int updateById(Dictionary dictionary);

	int insert(Dictionary dictionary);

	int delById(Integer id);

	Dictionary findById(Integer id);
}