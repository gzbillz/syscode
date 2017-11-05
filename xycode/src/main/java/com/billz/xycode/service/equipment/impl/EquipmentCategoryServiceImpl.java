package com.billz.xycode.service.equipment.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.equipment.EquipmentCategoryMapper;
import com.billz.xycode.model.equipment.EquipmentCategory;
import com.billz.xycode.service.equipment.EquipmentCategoryService;

/**
 * @class EquipmentCategoryServiceImpl.java
 * @author billz
 * @date 2017-09-21
 */
@Service
public class EquipmentCategoryServiceImpl implements EquipmentCategoryService {

	@Autowired
	private EquipmentCategoryMapper equipmentCategoryMapper;
	
	@Override
	public Prb<EquipmentCategory> findPageList(Psb<EquipmentCategory> psb){
		return new Prb<EquipmentCategory>(equipmentCategoryMapper.findPageList(psb), equipmentCategoryMapper.findPageCount(psb));
	}
	
	@Override
	public int updateByCateid(EquipmentCategory equipmentCategory){
		return equipmentCategoryMapper.updateByCateid(equipmentCategory);
	}
	
	@Override
	public int insert(EquipmentCategory equipmentCategory){
		return equipmentCategoryMapper.insert(equipmentCategory);
	}
	
	@Override
	public int delByCateid(Integer cateid){
		return equipmentCategoryMapper.delByCateid(cateid);
	}
	
	@Override
	public EquipmentCategory findByCateid(Integer cateid){
		return equipmentCategoryMapper.findByCateid(cateid);
	}
	
	@Override
	public List<EquipmentCategory> findUseList() {
		return equipmentCategoryMapper.findUseList();
	}
	
	@Override
	public List<EquipmentCategory> findAllList() {
		return equipmentCategoryMapper.findAllList();
	}
}