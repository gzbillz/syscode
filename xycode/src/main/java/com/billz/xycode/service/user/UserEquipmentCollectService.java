package com.billz.xycode.service.user;

import java.util.Map;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.user.UserEquipmentCollect;

/**
 * @class UserEquipmentCollectService.java
 * @author billz
 * @date 2017-09-22
 */
public interface UserEquipmentCollectService {
	 
	Prb<UserEquipmentCollect> findPageList(Psb<UserEquipmentCollect> psb);

	Prb<UserEquipmentCollect> findPageListByUid(Psb<Map<String, Object>> psb);
	
	int updateByUcid(UserEquipmentCollect userEquipmentCollect);
	
	int insert(UserEquipmentCollect userEquipmentCollect);
	
	int delByUcid(Long ucid);
	
	int delByUcids(String ucids);
	
	UserEquipmentCollect findByUcid(Long ucid);
	
	/**
	 * 获取最新的收藏的设备信息
	 * @param uid 用户主键
	 * @return
	 */
	Map<String, Object> findTopNewByUid(Long uid);
}