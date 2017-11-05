package com.billz.xycode.service.project.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.project.ProjectMapper;
import com.billz.xycode.model.project.Project;
import com.billz.xycode.service.project.ProjectService;

/**
 * @class ProjectServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectMapper mapper;
	
	@Override
	public Prb<Project> findPageList(Psb<Project> psb){
		return new Prb<Project>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public Prb<Project> findDwPageList(Psb<Map<String, Object>> psb) {
		return new Prb<Project>(mapper.findDwPageList(psb), mapper.findDwPageCount(psb));
	}
	
	@Override
	public Prb<Project> findPageListByYyseller(Psb<Map<String, Object>> psb) {
		return new Prb<Project>(mapper.findPageListByYyseller(psb), mapper.findPageCountByYyseller(psb));
	}
	
	@Override
	public int updateByPid(Project project){
		return mapper.updateByPid(project);
	}
	
	@Override
	public int insert(Project project){
		return mapper.insert(project);
	}
	
	@Override
	public int delByPid(Long pid){
		return mapper.delByPid(pid);
	}
	
	@Override
	public Project findByPid(Long pid){
		return mapper.findByPid(pid);
	}
}