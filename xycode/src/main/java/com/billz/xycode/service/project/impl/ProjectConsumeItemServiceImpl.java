package com.billz.xycode.service.project.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.project.ProjectConsumeItemMapper;
import com.billz.xycode.model.project.ProjectConsumeItem;
import com.billz.xycode.service.project.ProjectConsumeItemService;

/**
 * @class ProjectConsumeItemServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class ProjectConsumeItemServiceImpl implements ProjectConsumeItemService {

	@Autowired
	private ProjectConsumeItemMapper mapper;
	
	@Override
	public Prb<ProjectConsumeItem> findPageList(Psb<ProjectConsumeItem> psb){
		return new Prb<ProjectConsumeItem>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByItemid(ProjectConsumeItem projectConsumeItem){
		return mapper.updateByItemid(projectConsumeItem);
	}
	
	@Override
	public int insert(ProjectConsumeItem projectConsumeItem){
		return mapper.insert(projectConsumeItem);
	}
	
	@Override
	public int delByItemid(Long itemid){
		return mapper.delByItemid(itemid);
	}
	
	@Override
	public ProjectConsumeItem findByItemid(Long itemid){
		return mapper.findByItemid(itemid);
	}
	
	@Override
	public Double findLowPriceByPid(Long pid) {
		return mapper.findLowPriceByPid(pid);
	}
	
	@Override
	public List<ProjectConsumeItem> findByPid(Long pid, Integer cateid, Integer subcateid, Boolean status) {
		return mapper.findByPid(pid, cateid, subcateid, status);
	}
}