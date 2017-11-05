package com.billz.xycode.service.user.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.user.UserEquipmentFootmarkMapper;
import com.billz.xycode.model.user.UserEquipmentFootmark;
import com.billz.xycode.service.user.UserEquipmentFootmarkService;

/**
 * @class UserEquipmentFootmarkServiceImpl.java
 * @author billz
 * @date 2017-10-07
 */
@Service
public class UserEquipmentFootmarkServiceImpl implements UserEquipmentFootmarkService {

	@Autowired
	private UserEquipmentFootmarkMapper mapper;

	@Override
	public Prb<UserEquipmentFootmark> findPageList(Psb<UserEquipmentFootmark> psb) {
		return new Prb<UserEquipmentFootmark>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public Prb<UserEquipmentFootmark> findPageListByUid(Psb<Map<String, Object>> psb) {
		return new Prb<UserEquipmentFootmark>(mapper.findPageListByUid(psb), mapper.findPageCountByUid(psb));
	}

	@Override
	public int updateByFmid(UserEquipmentFootmark userEquipmentFootmark) {
		return mapper.updateByFmid(userEquipmentFootmark);
	}

	@Override
	public int insert(UserEquipmentFootmark userEquipmentFootmark) {
		return mapper.insert(userEquipmentFootmark);
	}

	@Override
	public int delByFmid(Long fmid) {
		return mapper.delByFmid(fmid);
	}

	@Override
	public int delByFmids(String fmids) {
		return mapper.delByFmids(fmids);
	}
	
	@Override
	public UserEquipmentFootmark findByFmid(Long fmid) {
		return mapper.findByFmid(fmid);
	}
	
	@Override
	public List<Map<String, Object>> findTopNewByUid(Long uid) {
		return mapper.findTopNewByUid(uid);
	}
	
	@Override
	public Long findFmidByUidAndPidAndPosid(Long uid, Long pid, String posid) {
		return mapper.findFmidByUidAndPidAndPosid(uid, pid, posid);
	}
	
	@Override
	public int updateUcountByFmid(Long fmid) {
		return mapper.updateUcountByFmid(fmid);
	}
}