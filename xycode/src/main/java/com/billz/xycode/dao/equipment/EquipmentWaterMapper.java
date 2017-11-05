package com.billz.xycode.dao.equipment;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.equipment.EquipmentWater;

/**
 * @class EquipmentWaterMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface EquipmentWaterMapper {

	int findPageCount(Psb<EquipmentWater> equipmentWater);
	
	List<EquipmentWater> findPageList(Psb<EquipmentWater> equipmentWater);
	
	EquipmentWater findByWeid(@Param("weid") Long weid);
	
	int delByWeid(@Param("weid") Long weid);

	int updateByWeid(EquipmentWater equipmentWater);
	
	int insert(EquipmentWater equipmentWater);
}

