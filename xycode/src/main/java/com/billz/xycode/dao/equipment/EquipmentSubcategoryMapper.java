package com.billz.xycode.dao.equipment;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.equipment.EquipmentSubcategory;

/**
 * @class EquipmentSubcategoryMapper.java
 * @author billz
 * @date 2017-09-21
 */
@Repository
public interface EquipmentSubcategoryMapper {

	int findPageCount(Psb<EquipmentSubcategory> equipmentSubcategory);

	List<EquipmentSubcategory> findPageList(Psb<EquipmentSubcategory> equipmentSubcategory);

	EquipmentSubcategory findBySubcateid(@Param("subcateid") Integer subcateid);

	int delBySubcateid(@Param("subcateid") Integer subcateid);

	int updateBySubcateid(EquipmentSubcategory equipmentSubcategory);

	int insert(EquipmentSubcategory equipmentSubcategory);
	
	/**
	 * 获取水控设备分类，规格
	 * @param weid 水控设备主键
	 * @return
	 */
	EquipmentSubcategory findSubCateByWeid(@Param("weid")Long weid);
}
