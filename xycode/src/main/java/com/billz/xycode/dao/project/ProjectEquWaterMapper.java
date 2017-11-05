package com.billz.xycode.dao.project;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectEquWater;

/**
 * @class ProjectEquWaterMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface ProjectEquWaterMapper {

	int findPageCount(Psb<ProjectEquWater> psb);
	List<ProjectEquWater> findPageList(Psb<ProjectEquWater> psb);
	
	int findDwPageCount(Psb<Map<String, Object>> psb);
	List<ProjectEquWater> findDwPageList(Psb<Map<String, Object>> psb);
	
	int findPageCountByPid(Psb<Map<String, Object>> psb);
	List<ProjectEquWater> findPageListByPid(Psb<Map<String, Object>> psb);
	
	ProjectEquWater findByPewid(@Param("pewid") Long pewid);
	
	int delByPewid(@Param("pewid") Long pewid);

	int updateByPewid(ProjectEquWater projectEquWater);
	
	int insert(ProjectEquWater projectEquWater);
	
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
	Map<String, Object> findEquByPosid(@Param("posid")String posid);
	
	/**
	 * 根据设备编号，查询水控设备
	 * @param posid
	 * @return
	 */
	ProjectEquWater findByPosid(@Param("posid") String posid);
}

