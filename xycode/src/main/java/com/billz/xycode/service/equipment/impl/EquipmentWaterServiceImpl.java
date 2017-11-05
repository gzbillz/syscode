package com.billz.xycode.service.equipment.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.equipment.EquipmentWaterMapper;
import com.billz.xycode.model.equipment.EquipmentWater;
import com.billz.xycode.service.equipment.EquipmentWaterService;

/**
 * @class EquipmentWaterServiceImpl.java
 * @author billz
 * @date 2017-09-22
 */
@Service
public class EquipmentWaterServiceImpl implements EquipmentWaterService {

	@Autowired
	private EquipmentWaterMapper mapper;
	
	@Override
	public Prb<EquipmentWater> findPageList(Psb<EquipmentWater> psb){
		return new Prb<EquipmentWater>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByWeid(EquipmentWater equipmentWater){
		return mapper.updateByWeid(equipmentWater);
	}
	
	@Override
	public int insert(EquipmentWater equipmentWater){
		return mapper.insert(equipmentWater);
	}
	
	@Override
	public int delByWeid(Long weid){
		return mapper.delByWeid(weid);
	}
	
	@Override
	public EquipmentWater findByWeid(Long weid){
		return mapper.findByWeid(weid);
	}

}