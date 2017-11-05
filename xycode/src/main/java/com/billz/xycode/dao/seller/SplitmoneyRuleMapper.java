package com.billz.xycode.dao.seller;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.seller.SplitmoneyRule;

/**
 * @class SplitmoneyRuleMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface SplitmoneyRuleMapper {

	int findPageCount(Psb<SplitmoneyRule> splitmoneyRule);

	List<SplitmoneyRule> findPageList(Psb<SplitmoneyRule> splitmoneyRule);

	SplitmoneyRule findByRuleid(@Param("ruleid") Long ruleid);

	int delByRuleid(@Param("ruleid") Long ruleid);

	int updateByRuleid(SplitmoneyRule splitmoneyRule);

	int insert(SplitmoneyRule splitmoneyRule);
}
