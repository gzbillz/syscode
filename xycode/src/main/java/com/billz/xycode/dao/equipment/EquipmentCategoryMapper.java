package com.billz.xycode.dao.equipment;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.equipment.EquipmentCategory;

/**
 * @class EquipmentCategoryMapper.java
 * @author billz
 * @date 2017-09-21
 */
@Repository
public interface EquipmentCategoryMapper {

	int findPageCount(Psb<EquipmentCategory> equipmentCategory);

	List<EquipmentCategory> findPageList(Psb<EquipmentCategory> equipmentCategory);

	EquipmentCategory findByCateid(@Param("cateid") Integer cateid);

	int delByCateid(@Param("cateid") Integer cateid);

	int updateByCateid(EquipmentCategory equipmentCategory);

	int insert(EquipmentCategory equipmentCategory);
	
	/**
	 * 获取可用的设备分类
	 * @return
	 */
	List<EquipmentCategory> findUseList();
	
	/**
	 * 获取所有设备分类
	 * @return
	 */
	List<EquipmentCategory> findAllList();
}
