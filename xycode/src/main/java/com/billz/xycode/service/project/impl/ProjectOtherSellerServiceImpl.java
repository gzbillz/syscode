package com.billz.xycode.service.project.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.project.ProjectOtherSellerMapper;
import com.billz.xycode.model.project.ProjectOtherSeller;
import com.billz.xycode.service.project.ProjectOtherSellerService;

/**
 * @class ProjectOtherSellerServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class ProjectOtherSellerServiceImpl implements ProjectOtherSellerService {

	@Autowired
	private ProjectOtherSellerMapper mapper;
	
	@Override
	public Prb<ProjectOtherSeller> findPageList(Psb<ProjectOtherSeller> psb){
		return new Prb<ProjectOtherSeller>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByOspid(ProjectOtherSeller projectOtherSeller){
		return mapper.updateByOspid(projectOtherSeller);
	}
	
	@Override
	public int insert(ProjectOtherSeller projectOtherSeller){
		return mapper.insert(projectOtherSeller);
	}
	
	@Override
	public int delByOspid(Long ospid){
		return mapper.delByOspid(ospid);
	}
	
	@Override
	public ProjectOtherSeller findByOspid(Long ospid){
		return mapper.findByOspid(ospid);
	}
}