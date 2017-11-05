package com.billz.xycode.service.project.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.project.ProjectSplitmoneyMapper;
import com.billz.xycode.model.project.ProjectSplitmoney;
import com.billz.xycode.service.project.ProjectSplitmoneyService;

/**
 * @class ProjectSplitmoneyServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class ProjectSplitmoneyServiceImpl implements ProjectSplitmoneyService {

	@Autowired
	private ProjectSplitmoneyMapper mapper;
	
	@Override
	public Prb<ProjectSplitmoney> findPageList(Psb<ProjectSplitmoney> psb){
		return new Prb<ProjectSplitmoney>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateById(ProjectSplitmoney projectSplitmoney){
		return mapper.updateById(projectSplitmoney);
	}
	
	@Override
	public int insert(ProjectSplitmoney projectSplitmoney){
		return mapper.insert(projectSplitmoney);
	}
	
	@Override
	public int delById(Long id){
		return mapper.delById(id);
	}
	
	@Override
	public ProjectSplitmoney findById(Long id){
		return mapper.findById(id);
	}
}