package com.billz.xycode.dao.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.user.UserEquipmentFootmark;

/**
 * @class UserEquipmentFootmarkMapper.java
 * @author billz
 * @date 2017-10-07
 */
@Repository
public interface UserEquipmentFootmarkMapper {

	int findPageCount(Psb<UserEquipmentFootmark> userEquipmentFootmark);

	List<UserEquipmentFootmark> findPageList(Psb<UserEquipmentFootmark> userEquipmentFootmark);

	int findPageCountByUid(Psb<Map<String, Object>> psb);
	
	List<UserEquipmentFootmark> findPageListByUid(Psb<Map<String, Object>> psb);
	
	UserEquipmentFootmark findByFmid(@Param("fmid") Long fmid);

	int delByFmid(@Param("fmid") Long fmid);
	
	int delByFmids(@Param("fmids") String fmids);

	int updateByFmid(UserEquipmentFootmark userEquipmentFootmark);

	int insert(UserEquipmentFootmark userEquipmentFootmark);
	
	/**
	 * 查询用户最近使用最新的设备
	 * @param uid 用户主键
	 * @return
	 */
	List<Map<String, Object>> findTopNewByUid(@Param("uid") Long uid);
	
	/**
	 * 查询用户是否已经加为个人足迹中，并返回对应的主键
	 * @param uid 用户主键
	 * @param pid 项目主键
	 * @param posid 设备编号
	 * @return 主键
	 */
	Long findFmidByUidAndPidAndPosid(@Param("uid") Long uid, @Param("pid") Long pid, @Param("posid") String posid);
	
	/**
	 * 更新设备使用次数[足迹设备]
	 * @param fmid 主键编号
	 * @return
	 */
	int updateUcountByFmid(@Param("fmid") Long fmid);
}
