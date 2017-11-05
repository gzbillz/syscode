package com.billz.xycode.service.user;

import java.util.List;
import java.util.Map;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.user.UserEquipmentFootmark;

/**
 * @class UserEquipmentFootmarkService.java
 * @author billz
 * @date 2017-10-07
 */
public interface UserEquipmentFootmarkService {

	Prb<UserEquipmentFootmark> findPageList(Psb<UserEquipmentFootmark> psb);

	Prb<UserEquipmentFootmark> findPageListByUid(Psb<Map<String, Object>> psb);
	
	int updateByFmid(UserEquipmentFootmark userEquipmentFootmark);

	int insert(UserEquipmentFootmark userEquipmentFootmark);

	int delByFmid(Long fmid);
	
	int delByFmids(String fmids);

	UserEquipmentFootmark findByFmid(Long fmid);
	
	/**
	 * 查询用户最近使用最新的设备
	 * @param uid 用户主键
	 * @return
	 */
	List<Map<String, Object>> findTopNewByUid(Long uid);
	
	/**
	 * 查询用户是否已经加为个人足迹中，并返回对应的主键
	 * @param uid 用户主键
	 * @param pid 项目主键
	 * @param posid 设备编号
	 * @return 主键
	 */
	Long findFmidByUidAndPidAndPosid(Long uid, Long pid, String posid);
	
	/**
	 * 更新设备使用次数[足迹设备]
	 * @param fmid 主键编号
	 * @return
	 */
	int updateUcountByFmid(Long fmid);
}