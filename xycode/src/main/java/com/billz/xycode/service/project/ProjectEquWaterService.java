package com.billz.xycode.service.project;

import java.util.List;
import java.util.Map;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectEquWater;

/**
 * @class ProjectEquWaterService.java
 * @author billz
 * @date 2017-09-22
 */
public interface ProjectEquWaterService {

	Prb<ProjectEquWater> findPageList(Psb<ProjectEquWater> psb);
	
	Prb<ProjectEquWater> findDwPageList(Psb<Map<String, Object>> psb);
	
	Prb<ProjectEquWater> findPageListByPid(Psb<Map<String, Object>> psb);
	
	int updateByPewid(ProjectEquWater projectEquWater);
	
	int insert(ProjectEquWater projectEquWater);
	
	int delByPewid(Long pewid);
	
	ProjectEquWater findByPewid(Long pewid);
	
	/**
	 * 获取最新的设备
	 * @return
	 */
	List<Map<String, Object>> findTopNewEqu();
	
	/**
	 * 根据机器编号查询
	 * @param posid 机器编号
	 * @return
	 */
	Map<String, Object> findEquByPosid(String posid);
	
	/**
	 * 根据设备编号，查询水控设备
	 * @param posid
	 * @return
	 */
	ProjectEquWater findByPosid(String posid);
}