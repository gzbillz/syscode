package com.billz.xycode.service.project.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.project.ProjectSplitmoneySettingMapper;
import com.billz.xycode.model.project.ProjectSplitmoneySetting;
import com.billz.xycode.service.project.ProjectSplitmoneySettingService;

/**
 * @class ProjectSplitmoneySettingServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class ProjectSplitmoneySettingServiceImpl implements ProjectSplitmoneySettingService {

	@Autowired
	private ProjectSplitmoneySettingMapper mapper;
	
	@Override
	public Prb<ProjectSplitmoneySetting> findPageList(Psb<ProjectSplitmoneySetting> psb){
		return new Prb<ProjectSplitmoneySetting>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByPssid(ProjectSplitmoneySetting projectSplitmoneySetting){
		return mapper.updateByPssid(projectSplitmoneySetting);
	}
	
	@Override
	public int insert(ProjectSplitmoneySetting projectSplitmoneySetting){
		return mapper.insert(projectSplitmoneySetting);
	}
	
	@Override
	public int delByPssid(Long pssid){
		return mapper.delByPssid(pssid);
	}
	
	@Override
	public ProjectSplitmoneySetting findByPssid(Long pssid){
		return mapper.findByPssid(pssid);
	}
	
	@Override
	public List<ProjectSplitmoneySetting> findFzByPid(Long pid) {
		return mapper.findFzByPid(pid);
	}
}