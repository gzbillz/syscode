package com.billz.xycode.service.order.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.order.OrderConsumeMapper;
import com.billz.xycode.model.order.OrderConsume;
import com.billz.xycode.service.order.OrderConsumeService;

/**
 * @class OrderConsumeServiceImpl.java
 * @author billz
 * @date 2017-10-07
 */
@Service
public class OrderConsumeServiceImpl implements OrderConsumeService {

	@Autowired
	private OrderConsumeMapper mapper;

	@Override
	public Prb<OrderConsume> findPageList(Psb<OrderConsume> psb) {
		return new Prb<OrderConsume>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}

	@Override
	public int updateByOid(OrderConsume orderConsume) {
		return mapper.updateByOid(orderConsume);
	}

	@Override
	public int insert(OrderConsume orderConsume) {
		return mapper.insert(orderConsume);
	}

	@Override
	public int delByOid(Long oid) {
		return mapper.delByOid(oid);
	}
	
	@Override
	public int delUnpayByOid(Long oid) {
		return mapper.delUnpayByOid(oid);
	}

	@Override
	public OrderConsume findByOid(Long oid) {
		return mapper.findByOid(oid);
	}
	
	@Override
	public OrderConsume findByOrdercode(String ordercode) {
		return mapper.findByOrdercode(ordercode);
	}
	
	@Override
	public Prb<OrderConsume> findPageListByUid(Psb<Map<String, Object>> psb) {
		return new Prb<OrderConsume>(mapper.findPageListByUid(psb), mapper.findPageCountByUid(psb));
	}
	
	@Override
	public int findPageCountByUid(Psb<Map<String, Object>> psb) {
		return mapper.findPageCountByUid(psb);
	}
	
	@Override
	public int updateStatusByOid(Long oid, double bkprice, double xfprice) {
		return mapper.updateStatusByOid(oid, bkprice, xfprice);
	}
	
	@Override
	public OrderConsume findUnokByUid(Long uid, String posid, Integer sycs, double bkprice) {
		return mapper.findUnokByUid(uid, posid, sycs, bkprice);
	}
	
	@Override
	public int updatePaySuccessByOid(Long oid, String paytype, String othercode) {
		return mapper.updatePaySuccessByOid(oid, paytype, othercode);
	}
	
	@Override
	public int findPayStatusCountByUid(Long uid, int paystatus) {
		return mapper.findPayStatusCountByUid(uid, paystatus);
	}
	
	@Override
	public int findStatusCountByUid(Long uid, int status) {
		return mapper.findStatusCountByUid(uid, status);
	}
}