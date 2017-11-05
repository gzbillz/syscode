package com.billz.sys.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.sys.model.Dictionary;

/**
 * @class DictionaryMapper.java
 * @author billz
 * @date 2017-09-25
 */
@Repository
public interface DictionaryMapper {

	int findPageCount(Psb<Dictionary> dictionary);
	
	List<Dictionary> findPageList(Psb<Dictionary> dictionary);
	
	Dictionary findById(@Param("id") Integer id);
	
	int delById(@Param("id") Integer id);

	int updateById(Dictionary dictionary);
	
	int insert(Dictionary dictionary);
}

