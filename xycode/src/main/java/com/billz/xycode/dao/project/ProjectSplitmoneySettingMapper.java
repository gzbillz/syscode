package com.billz.xycode.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectSplitmoneySetting;

/**
 * @class ProjectSplitmoneySettingMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface ProjectSplitmoneySettingMapper {

	int findPageCount(Psb<ProjectSplitmoneySetting> projectSplitmoneySetting);
	
	List<ProjectSplitmoneySetting> findPageList(Psb<ProjectSplitmoneySetting> projectSplitmoneySetting);
	
	ProjectSplitmoneySetting findByPssid(@Param("pssid") Long pssid);
	
	int delByPssid(@Param("pssid") Long pssid);

	int updateByPssid(ProjectSplitmoneySetting projectSplitmoneySetting);
	
	int insert(ProjectSplitmoneySetting projectSplitmoneySetting);
	
	/**
	 * 查询分账的商家
	 * @param pid 项目主键
	 * @return
	 */
	List<ProjectSplitmoneySetting> findFzByPid(@Param("pid") Long pid);
}

