package com.billz.xycode.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectSplitmoney;

/**
 * @class ProjectSplitmoneyMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface ProjectSplitmoneyMapper {

	int findPageCount(Psb<ProjectSplitmoney> projectSplitmoney);
	
	List<ProjectSplitmoney> findPageList(Psb<ProjectSplitmoney> projectSplitmoney);
	
	ProjectSplitmoney findById(@Param("id") Long id);
	
	int delById(@Param("id") Long id);

	int updateById(ProjectSplitmoney projectSplitmoney);
	
	int insert(ProjectSplitmoney projectSplitmoney);
}

