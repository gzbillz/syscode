package com.billz.xycode.service.equipment;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.equipment.EquipmentSubcategory;

/**
 * @class EquipmentSubcategoryService.java
 * @author billz
 * @date 2017-09-21
 */
public interface EquipmentSubcategoryService {

	/**
	 * 分页查询
	 * 
	 * @param psb
	 * @return
	 */
	Prb<EquipmentSubcategory> findPageList(Psb<EquipmentSubcategory> psb);

	int updateBySubcateid(EquipmentSubcategory equipmentSubcategory);

	int insert(EquipmentSubcategory equipmentSubcategory);

	int delBySubcateid(Integer subcateid);

	EquipmentSubcategory findBySubcateid(Integer subcateid);
	
	EquipmentSubcategory findSubCateByWeid(Long weid);
}