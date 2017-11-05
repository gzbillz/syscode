package com.billz.xycode.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.xycode.model.equipment.SPCSPos;
import com.billz.xycode.service.project.ProjectEquWaterService;

/**
 * @class ProjectEquFactory.java
 * @author billz
 * @date 2017年10月9日
 */
@Service
public class ProjectEquFactory {

	@Autowired
	private ProjectEquWaterService waterService;
 
	/**
	 * 根据posid设备编号，查询设备所有的详细信息<br/>
	 * @param posid
	 *            设备编号
	 * @return SPCSPos
	 */
	public SPCSPos findByPosid(String posid) {
		Map<String, Object> map = waterService.findEquByPosid(posid);
		if(map != null && map.size() > 0){
			SPCSPos pos = new SPCSPos();
			pos.setPewid(Long.valueOf(map.get("pewid").toString()));
			pos.setSellerid(map.get("sellerid") != null ? Long.valueOf(map.get("sellerid").toString()) : null);
			pos.setEid(map.get("eid") != null ? Long.valueOf(map.get("eid").toString()) : null);
			pos.setEname(map.get("ename") != null ? map.get("ename").toString() : "");
			pos.setLogo(map.get("logo") != null ? map.get("logo").toString() : "");
			pos.setPosid(map.get("posid").toString());
			pos.setSellerid(map.get("sellerid") != null ? Long.valueOf(map.get("sellerid").toString()) : null);
			pos.setPid(map.get("pid") != null ? Long.valueOf(map.get("pid").toString()) : null);
			pos.setCateid(map.get("cateid") != null ? Integer.valueOf(map.get("cateid").toString()) : null);
			pos.setCatename(map.get("catename") != null ? map.get("catename").toString() : "");
			pos.setSubcateid(map.get("subcateid") != null ? Integer.valueOf(map.get("subcateid").toString()) : null);
			return pos;
		}
		return null;
	}
	
}
