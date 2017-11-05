package com.billz.xycode.service.project.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.project.ProjectEquWaterMapper;
import com.billz.xycode.model.project.ProjectEquWater;
import com.billz.xycode.service.project.ProjectEquWaterService;

/**
 * @class ProjectEquWaterServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class ProjectEquWaterServiceImpl implements ProjectEquWaterService {

	@Autowired
	private ProjectEquWaterMapper mapper;
	
	@Override
	public Prb<ProjectEquWater> findPageList(Psb<ProjectEquWater> psb){
		return new Prb<ProjectEquWater>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public Prb<ProjectEquWater> findDwPageList(Psb<Map<String, Object>> psb) {
		return new Prb<ProjectEquWater>(mapper.findDwPageList(psb), mapper.findDwPageCount(psb));
	}
	
	@Override
	public Prb<ProjectEquWater> findPageListByPid(Psb<Map<String, Object>> psb) {
		return new Prb<ProjectEquWater>(mapper.findPageListByPid(psb), mapper.findPageCountByPid(psb));
	}
	
	@Override
	public int updateByPewid(ProjectEquWater projectEquWater){
		return mapper.updateByPewid(projectEquWater);
	}
	
	@Override
	public int insert(ProjectEquWater projectEquWater){
		return mapper.insert(projectEquWater);
	}
	
	@Override
	public int delByPewid(Long pewid){
		return mapper.delByPewid(pewid);
	}
	
	@Override
	public ProjectEquWater findByPewid(Long pewid){
		return mapper.findByPewid(pewid);
	}
	
	@Override
	public List<Map<String, Object>> findTopNewEqu() {
		return mapper.findTopNewEqu();
	}
	
	@Override
	public Map<String, Object> findEquByPosid(String posid) {
		return mapper.findEquByPosid(posid);
	}
	
	@Override
	public ProjectEquWater findByPosid(String posid) {
		return mapper.findByPosid(posid);
	}
}