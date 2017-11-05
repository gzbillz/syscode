package com.billz.xycode.service.project;

import java.util.List;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.project.ProjectConsumeItem;

/**
 * @class ProjectConsumeItemService.java
 * @author billz
 * @date 2017-09-22
 */
public interface ProjectConsumeItemService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<ProjectConsumeItem> findPageList(Psb<ProjectConsumeItem> psb);
	
	int updateByItemid(ProjectConsumeItem projectConsumeItem);
	
	int insert(ProjectConsumeItem projectConsumeItem);
	
	int delByItemid(Long itemid);
	
	ProjectConsumeItem findByItemid(Long itemid);
	
	/**
	 * 根据项目主键编号，查询对应的消费项最低金额
	 * @param pid
	 * @return
	 */
	Double findLowPriceByPid(Long pid);
	
	List<ProjectConsumeItem> findByPid(Long pid, Integer cateid, Integer subcateid, Boolean status);
}