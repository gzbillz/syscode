package com.billz.xycode.dao.info;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.info.Suggestion;

/**
 * @class SuggestionMapper.java
 * @author billz
 * @date 2017-09-25
 */
@Repository
public interface SuggestionMapper {

	int findPageCount(Psb<Suggestion> suggestion);
	
	List<Suggestion> findPageList(Psb<Suggestion> suggestion);
	
	Suggestion findBySugid(@Param("sugid") Long sugid);
	
	int delBySugid(@Param("sugid") Long sugid);

	int updateBySugid(Suggestion suggestion);
	
	int insert(Suggestion suggestion);
}

