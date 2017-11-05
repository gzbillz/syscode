package com.billz.xycode.service.consume.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.consume.ConsumeScanMapper;
import com.billz.xycode.model.consume.ConsumeScan;
import com.billz.xycode.service.consume.ConsumeScanService;

/**
 * @class ConsumeScanServiceImpl.java
 * @author billz
 * @date 2017-10-25
 */
@Service
public class ConsumeScanServiceImpl implements ConsumeScanService {

	@Autowired
	private ConsumeScanMapper mapper;
	
	@Override
	public Prb<ConsumeScan> findPageList(Psb<ConsumeScan> psb){
		return new Prb<ConsumeScan>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByDid(ConsumeScan consumeScan){
		return mapper.updateByDid(consumeScan);
	}
	
	@Override
	public int insert(ConsumeScan consumeScan){
		return mapper.insert(consumeScan);
	}
	
	@Override
	public int delByDid(Long did){
		return mapper.delByDid(did);
	}
	
	@Override
	public ConsumeScan findByDid(Long did){
		return mapper.findByDid(did);
	}
}