package com.billz.xycode.service.project;

import java.util.Map;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.project.Project;

/**
 * @class ProjectService.java
 * @author billz
 * @date 2017-09-22
 */
public interface ProjectService {
	 
	Prb<Project> findPageList(Psb<Project> psb);
	
	Prb<Project> findPageListByYyseller(Psb<Map<String, Object>> psb);
	
	Prb<Project> findDwPageList(Psb<Map<String, Object>> psb);
	
	int updateByPid(Project project);
	
	int insert(Project project);
	
	int delByPid(Long pid);
	
	Project findByPid(Long pid);
}