package com.billz.xycode.service.user.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.user.UserEquipmentCollectMapper;
import com.billz.xycode.model.user.UserEquipmentCollect;
import com.billz.xycode.service.user.UserEquipmentCollectService;

/**
 * @class UserEquipmentCollectServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class UserEquipmentCollectServiceImpl implements UserEquipmentCollectService {

	@Autowired
	private UserEquipmentCollectMapper mapper;
	
	@Override
	public Prb<UserEquipmentCollect> findPageList(Psb<UserEquipmentCollect> psb){
		return new Prb<UserEquipmentCollect>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public Prb<UserEquipmentCollect> findPageListByUid(Psb<Map<String, Object>> psb) {
		return new Prb<UserEquipmentCollect>(mapper.findPageListByUid(psb), mapper.findPageCountByUid(psb));
	}
	
	@Override
	public int updateByUcid(UserEquipmentCollect userEquipmentCollect){
		return mapper.updateByUcid(userEquipmentCollect);
	}
	
	@Override
	public int insert(UserEquipmentCollect userEquipmentCollect){
		return mapper.insert(userEquipmentCollect);
	}
	
	@Override
	public int delByUcid(Long ucid){
		return mapper.delByUcid(ucid);
	}
	
	@Override
	public int delByUcids(String ucids) {
		return mapper.delByUcids(ucids);
	}
	
	@Override
	public UserEquipmentCollect findByUcid(Long ucid){
		return mapper.findByUcid(ucid);
	}
	
	@Override
	public Map<String, Object> findTopNewByUid(Long uid) {
		return mapper.findTopNewByUid(uid);
	}
}