package com.billz.xycode.service.equipment;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.equipment.EquipmentWater;

/**
 * @class EquipmentWaterService.java
 * @author billz
 * @date 2017-09-22
 */
public interface EquipmentWaterService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<EquipmentWater> findPageList(Psb<EquipmentWater> psb);
	
	int updateByWeid(EquipmentWater equipmentWater);
	
	int insert(EquipmentWater equipmentWater);
	
	int delByWeid(Long weid);
	
	EquipmentWater findByWeid(Long weid);
}