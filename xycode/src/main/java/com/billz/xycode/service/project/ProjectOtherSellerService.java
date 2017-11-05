package com.billz.xycode.service.project;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectOtherSeller;

/**
 * @class ProjectOtherSellerService.java
 * @author billz
 * @date 2017-09-22
 */
public interface ProjectOtherSellerService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<ProjectOtherSeller> findPageList(Psb<ProjectOtherSeller> psb);
	
	int updateByOspid(ProjectOtherSeller projectOtherSeller);
	
	int insert(ProjectOtherSeller projectOtherSeller);
	
	int delByOspid(Long ospid);
	
	ProjectOtherSeller findByOspid(Long ospid);
}