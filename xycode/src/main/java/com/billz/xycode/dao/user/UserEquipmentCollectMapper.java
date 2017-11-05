package com.billz.xycode.dao.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.user.UserEquipmentCollect;

/**
 * @class UserEquipmentCollectMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface UserEquipmentCollectMapper {

	int findPageCount(Psb<UserEquipmentCollect> userEquipmentCollect);
	
	List<UserEquipmentCollect> findPageList(Psb<UserEquipmentCollect> userEquipmentCollect);
	
	int findPageCountByUid(Psb<Map<String, Object>> params);
	
	List<UserEquipmentCollect> findPageListByUid(Psb<Map<String, Object>> params);
	
	UserEquipmentCollect findByUcid(@Param("ucid") Long ucid);
	
	int delByUcid(@Param("ucid") Long ucid);
	
	int delByUcids(@Param("ucids") String ucids);

	int updateByUcid(UserEquipmentCollect userEquipmentCollect);
	
	int insert(UserEquipmentCollect userEquipmentCollect);
	
	/**
	 * 查询用户最新收藏的设备
	 * @param uid 用户主键
	 * @return
	 */
	Map<String, Object> findTopNewByUid(@Param("uid") Long uid);
}

