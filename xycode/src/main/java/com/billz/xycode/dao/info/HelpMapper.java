package com.billz.xycode.dao.info;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.info.Help;

/**
 * @class HelpMapper.java
 * @author billz
 * @date 2017-09-25
 */
@Repository
public interface HelpMapper {

	int findPageCount(Psb<Help> help);
	
	List<Help> findPageList(Psb<Help> help);
	
	Help findById(@Param("id") Integer id);
	
	int delById(@Param("id") Integer id);

	int updateById(Help help);
	
	int insert(Help help);
}

