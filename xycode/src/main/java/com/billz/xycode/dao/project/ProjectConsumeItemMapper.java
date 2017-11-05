package com.billz.xycode.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectConsumeItem;

/**
 * @class ProjectConsumeItemMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface ProjectConsumeItemMapper {

	int findPageCount(Psb<ProjectConsumeItem> projectConsumeItem);

	List<ProjectConsumeItem> findPageList(Psb<ProjectConsumeItem> projectConsumeItem);

	ProjectConsumeItem findByItemid(@Param("itemid") Long itemid);

	int delByItemid(@Param("itemid") Long itemid);

	int updateByItemid(ProjectConsumeItem projectConsumeItem);

	int insert(ProjectConsumeItem projectConsumeItem);
	
	/**
	 * 根据项目编号，获取最低可用的消费项金额
	 * @param pid 项目主键编号
	 * @return 最低的消费项金额
	 */
	Double findLowPriceByPid(@Param("pid") Long pid);

	List<ProjectConsumeItem> findByPid(@Param("pid") Long pid, @Param("cateid") Integer cateid,
			@Param("subcateid") Integer subcateid, @Param("status") Boolean status);
}
