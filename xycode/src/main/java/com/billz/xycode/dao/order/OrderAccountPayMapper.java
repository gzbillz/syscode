package com.billz.xycode.dao.order;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.order.OrderAccountPay;

/**
 * @class OrderAccountPayMapper.java
 * @author billz
 * @date 2017-10-11
 */
@Repository
public interface OrderAccountPayMapper {

	int findPageCount(Psb<OrderAccountPay> orderAccountPay);

	List<OrderAccountPay> findPageList(Psb<OrderAccountPay> orderAccountPay);

	OrderAccountPay findByAoid(@Param("aoid") Long aoid);

	/**
	 * 根据订单号，查询详细信息
	 * 
	 * @param ordercode
	 *            订单号
	 * @return
	 */
	OrderAccountPay findByOrdercode(@Param("ordercode") String ordercode);

	int delByAoid(@Param("aoid") Long aoid);

	int updateByAoid(OrderAccountPay orderAccountPay);

	int insert(OrderAccountPay orderAccountPay);

	/**
	 * 更新成功支付状态
	 * 
	 * @param aoid
	 *            订单主键
	 * @param paytype
	 *            支付方式
	 * @return
	 */
	int updatePaySuccessByAoid(@Param("aoid") long aoid, @Param("paytype") String paytype, @Param("othercode") String othercode);
}
