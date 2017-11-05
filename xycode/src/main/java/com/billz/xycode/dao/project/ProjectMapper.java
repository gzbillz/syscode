package com.billz.xycode.dao.project;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.project.Project;

/**
 * @class ProjectMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface ProjectMapper {

	int findPageCount(Psb<Project> project);

	List<Project> findPageList(Psb<Project> project);

	int findPageCountByYyseller(Psb<Map<String, Object>> psb);

	List<Project> findPageListByYyseller(Psb<Map<String, Object>> psb);

	int findDwPageCount(Psb<Map<String, Object>> psb);

	List<Project> findDwPageList(Psb<Map<String, Object>> psb);

	Project findByPid(@Param("pid") Long pid);

	int delByPid(@Param("pid") Long pid);

	int updateByPid(Project project);

	int insert(Project project);
}
