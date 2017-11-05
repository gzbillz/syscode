package com.billz.xycode.service.equipment;

import java.util.List;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.equipment.EquipmentCategory;

/**
 * @class EquipmentCategoryService.java
 * @author billz
 * @date 2017-09-21
 */
public interface EquipmentCategoryService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<EquipmentCategory> findPageList(Psb<EquipmentCategory> psb);
	
	int updateByCateid(EquipmentCategory equipmentCategory);
	
	int insert(EquipmentCategory equipmentCategory);
	
	int delByCateid(Integer cateid);
	
	EquipmentCategory findByCateid(Integer cateid);
	
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