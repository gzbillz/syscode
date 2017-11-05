package com.billz.xycode.service.equipment.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.equipment.EquipmentSubcategoryMapper;
import com.billz.xycode.model.equipment.EquipmentSubcategory;
import com.billz.xycode.service.equipment.EquipmentSubcategoryService;

/**
 * @class EquipmentSubcategoryServiceImpl.java
 * @author billz
 * @date 2017-09-21
 */
@Service
public class EquipmentSubcategoryServiceImpl implements EquipmentSubcategoryService {

	@Autowired
	private EquipmentSubcategoryMapper mapper;

	@Override
	public Prb<EquipmentSubcategory> findPageList(Psb<EquipmentSubcategory> psb) {
		return new Prb<EquipmentSubcategory>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}

	@Override
	public int updateBySubcateid(EquipmentSubcategory equipmentSubcategory) {
		return mapper.updateBySubcateid(equipmentSubcategory);
	}

	@Override
	public int insert(EquipmentSubcategory equipmentSubcategory) {
		return mapper.insert(equipmentSubcategory);
	}

	@Override
	public int delBySubcateid(Integer subcateid) {
		return mapper.delBySubcateid(subcateid);
	}

	@Override
	public EquipmentSubcategory findBySubcateid(Integer subcateid) {
		return mapper.findBySubcateid(subcateid);
	}
	
	@Override
	public EquipmentSubcategory findSubCateByWeid(Long weid) {
		return mapper.findSubCateByWeid(weid);
	}
}