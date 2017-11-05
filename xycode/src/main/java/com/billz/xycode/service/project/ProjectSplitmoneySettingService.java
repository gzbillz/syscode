package com.billz.xycode.service.project;

import java.util.List;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectSplitmoneySetting;

/**
 * @class ProjectSplitmoneySettingService.java
 * @author billz
 * @date 2017-09-22
 */
public interface ProjectSplitmoneySettingService {

	Prb<ProjectSplitmoneySetting> findPageList(Psb<ProjectSplitmoneySetting> psb);
	
	int updateByPssid(ProjectSplitmoneySetting projectSplitmoneySetting);
	
	int insert(ProjectSplitmoneySetting projectSplitmoneySetting);
	
	int delByPssid(Long pssid);
	
	ProjectSplitmoneySetting findByPssid(Long pssid);
	
	/**
	 * 查询分账的商家
	 * @param pid 项目主键
	 * @return
	 */
	List<ProjectSplitmoneySetting> findFzByPid(Long pid);
}