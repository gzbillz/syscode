package com.billz.xycode.service.order;

import java.util.Map;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.order.OrderConsume;

/**
 * @class OrderConsumeService.java
 * @author billz
 * @date 2017-10-07
 */
public interface OrderConsumeService {

	Prb<OrderConsume> findPageList(Psb<OrderConsume> psb);

	int updateByOid(OrderConsume orderConsume);

	int insert(OrderConsume orderConsume);

	int delByOid(Long oid);
	
	int delUnpayByOid(Long oid);

	OrderConsume findByOid(Long oid);
	
	/**
	 * 根据订单号查询
	 * @param ordercode 订单号
	 * @return
	 */
	OrderConsume findByOrdercode(String ordercode);

	/**
	 * 分页查询用户订单
	 * 
	 * @param psb
	 * @return
	 */
	Prb<OrderConsume> findPageListByUid(Psb<Map<String, Object>> psb);

	int findPageCountByUid(Psb<Map<String, Object>> psb);

	/**
	 * 更新返还金额
	 * 
	 * @param oid
	 *            主键
	 * @param bkprice
	 *            返还金额
	 * @param xfprice
	 *            消费金额
	 * @return
	 */
	int updateStatusByOid(Long oid, double bkprice, double xfprice);

	/**
	 * 获取用户待确认的消费订单
	 * 
	 * @param uid
	 *            用户主键编号
	 * @param posid
	 *            设备编号
	 * @param sycs 流水号
	 * @param bkprice
	 *            返还金额
	 * @return
	 */
	OrderConsume findUnokByUid(Long uid, String posid, Integer sycs, double bkprice);
	
	/**
	 * 更新支付成功订单状态
	 * @param oid 订单主键
	 * @param paytype 支付方式
	 * @param othercode 第三方支付订单号
	 * @return 
	 */
	int updatePaySuccessByOid(Long oid, String paytype, String othercode);
	
	/**
	 * 根据支付状态，查询对应的数量
	 * @param uid 用户主键
	 * @param paystatus 支付状态
	 * @return
	 */
	int findPayStatusCountByUid(Long uid, int paystatus);
	
	/**
	 * 根据订单状态，查询[支付成功]的数据量
	 * @param uid 用户主键
	 * @param status 订单状态
	 * @return
	 */
	int findStatusCountByUid(Long uid, int status);
}