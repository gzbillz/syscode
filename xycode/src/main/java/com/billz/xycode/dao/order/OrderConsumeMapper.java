package com.billz.xycode.dao.order;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.order.OrderConsume;

/**
 * @class OrderConsumeMapper.java
 * @author billz
 * @date 2017-10-07
 */
@Repository
public interface OrderConsumeMapper {

	int findPageCount(Psb<OrderConsume> orderConsume);

	List<OrderConsume> findPageList(Psb<OrderConsume> orderConsume);

	OrderConsume findByOid(@Param("oid") Long oid);
	
	/**
	 * 根据订单号查询
	 * @param ordercode 订单号
	 * @return
	 */
	OrderConsume findByOrdercode(@Param("ordercode") String ordercode);

	int delByOid(@Param("oid") Long oid);
	
	/**
	 * 删除未支付的订单
	 * @param oid 订单主键
	 * @return
	 */
	int delUnpayByOid(@Param("oid") Long oid);

	int updateByOid(OrderConsume orderConsume);

	int insert(OrderConsume orderConsume);
	
	/**
	 * 分页查询用户订单
	 * @param psb
	 * @return
	 */
	List<OrderConsume> findPageListByUid(Psb<Map<String, Object>> psb);
	
	int findPageCountByUid(Psb<Map<String, Object>> psb);
	
	/**
	 * 更新返还金额
	 * @param oid 主键
	 * @param bkprice 返还金额
	 * @param xfprice 消费金额
	 * @return
	 */
	int updateStatusByOid(@Param("oid")Long oid, @Param("bkprice") double bkprice, @Param("xfprice") double xfprice);
	
	/**
	 * 获取用户待确认的消费订单
	 * @param uid 用户主键编号
	 * @param posid 设备编号
	 * @param sycs 流水号
	 * @param bkprice 返还金额
	 * @return
	 */
	OrderConsume findUnokByUid(@Param("uid")Long uid, @Param("posid") String posid, @Param("sycs") Integer sycs, @Param("bkprice") double bkprice);
	
	/**
	 * 更新支付状态
	 * @param oid 订单主键
	 * @param paytype 支付方式(微信,平台)
	 * @param othercode 第三方支付订单号
	 * @return
	 */
	int updatePaySuccessByOid(@Param("oid")Long oid, @Param("paytype") String paytype, @Param("othercode") String othercode);
	
	/**
	 * 根据支付状态，查询对应的数量
	 * @param uid 用户主键
	 * @param paystatus 支付状态
	 * @return
	 */
	int findPayStatusCountByUid(@Param("uid") Long uid, @Param("paystatus") int paystatus);
	
	/**
	 * 根据订单状态，查询[支付成功]的数据量
	 * @param uid 用户主键
	 * @param status 订单状态
	 * @return
	 */
	int findStatusCountByUid(@Param("uid") Long uid, @Param("status") int status);
}
