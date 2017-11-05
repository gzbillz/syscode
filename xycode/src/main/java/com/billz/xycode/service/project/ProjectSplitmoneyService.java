package com.billz.xycode.service.project;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectSplitmoney;

/**
 * @class ProjectSplitmoneyService.java
 * @author billz
 * @date 2017-09-22
 */
public interface ProjectSplitmoneyService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<ProjectSplitmoney> findPageList(Psb<ProjectSplitmoney> psb);
	
	int updateById(ProjectSplitmoney projectSplitmoney);
	
	int insert(ProjectSplitmoney projectSplitmoney);
	
	int delById(Long id);
	
	ProjectSplitmoney findById(Long id);
}