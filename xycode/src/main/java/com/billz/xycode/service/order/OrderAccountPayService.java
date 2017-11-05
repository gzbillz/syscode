package com.billz.xycode.service.order;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.order.OrderAccountPay;

/**
 * @class OrderAccountPayService.java
 * @author billz
 * @date 2017-10-11
 */
public interface OrderAccountPayService {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<OrderAccountPay> findPageList(Psb<OrderAccountPay> psb);
	
	int updateByAoid(OrderAccountPay orderAccountPay);
	
	int insert(OrderAccountPay orderAccountPay);
	
	int delByAoid(Long aoid);
	
	OrderAccountPay findByAoid(Long aoid);
	
	OrderAccountPay findByOrdercode(String ordercode);
	
	/**
	 * 更新成功支付状态
	 * 
	 * @param aoid
	 *            订单主键
	 * @param paytype
	 *            支付方式
	 * @param ordercode 第三方支付订单号
	 * @return
	 */
	int updatePaySuccessByAoid(long aoid, String paytype, String ordercode);
}