package com.billz.xycode.service.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.dao.order.OrderAccountPayMapper;
import com.billz.xycode.model.order.OrderAccountPay;
import com.billz.xycode.service.order.OrderAccountPayService;

/**
 * @class OrderAccountPayServiceImpl.java
 * @author billz
 * @date 2017-10-11
 */
@Service
public class OrderAccountPayServiceImpl implements OrderAccountPayService {

	@Autowired
	private OrderAccountPayMapper mapper;
	
	@Override
	public Prb<OrderAccountPay> findPageList(Psb<OrderAccountPay> psb){
		return new Prb<OrderAccountPay>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateByAoid(OrderAccountPay orderAccountPay){
		return mapper.updateByAoid(orderAccountPay);
	}
	
	@Override
	public int insert(OrderAccountPay orderAccountPay){
		return mapper.insert(orderAccountPay);
	}
	
	@Override
	public int delByAoid(Long aoid){
		return mapper.delByAoid(aoid);
	}
	
	@Override
	public OrderAccountPay findByAoid(Long aoid){
		return mapper.findByAoid(aoid);
	}
	
	@Override
	public OrderAccountPay findByOrdercode(String ordercode) {
		return mapper.findByOrdercode(ordercode);
	}
	
	@Override
	public int updatePaySuccessByAoid(long aoid, String paytype, String ordercode) {
		return mapper.updatePaySuccessByAoid(aoid, paytype, ordercode);
	}
}