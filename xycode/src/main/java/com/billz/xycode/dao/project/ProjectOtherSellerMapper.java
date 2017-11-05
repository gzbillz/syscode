package com.billz.xycode.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectOtherSeller;

/**
 * @class ProjectOtherSellerMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface ProjectOtherSellerMapper {

	int findPageCount(Psb<ProjectOtherSeller> projectOtherSeller);
	
	List<ProjectOtherSeller> findPageList(Psb<ProjectOtherSeller> projectOtherSeller);
	
	ProjectOtherSeller findByOspid(@Param("ospid") Long ospid);
	
	int delByOspid(@Param("ospid") Long ospid);

	int updateByOspid(ProjectOtherSeller projectOtherSeller);
	
	int insert(ProjectOtherSeller projectOtherSeller);
}

