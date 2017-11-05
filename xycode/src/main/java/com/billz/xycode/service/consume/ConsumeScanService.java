package com.billz.xycode.service.consume;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.consume.ConsumeScan;

/**
 * @class ConsumeScanService.java
 * @author billz
 * @date 2017-10-25
 */
public interface ConsumeScanService {
	 
	Prb<ConsumeScan> findPageList(Psb<ConsumeScan> psb);
	
	int updateByDid(ConsumeScan consumeScan);
	
	int insert(ConsumeScan consumeScan);
	
	int delByDid(Long did);
	
	ConsumeScan findByDid(Long did);
}