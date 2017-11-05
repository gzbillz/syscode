package com.billz.xycode.trans;

import com.billz.xycode.model.equipment.SPCSPos;
import com.billz.xycode.model.order.OrderConsume;
import com.billz.xycode.model.project.Project;
import com.billz.xycode.model.project.ProjectConsumeItem;

/**
 * 消费订单业务处理
 * @class OrderConsumeTranService.java
 * @author billz
 * @date 2017年10月30日
 */
public interface OrderConsumeTranService {
	
	/**
	 * 生成订单
	 * @param uid 用户主键
	 * @param userid 用户编号
	 * @param posid posid编号
	 * @param itemid 消费项目编号
	 * @param sycs 设备流水
	 * @return
	 */
	OrderConsume genOrder(Long uid, String userid, String posid, Long itemid, int sycs);
	
	/**
	 * 生成订单
	 * @param uid 用户主键
	 * @param userid 用户编号
	 * @param pos 设备信息
	 * @param project 项目
	 * @param item 消费项目
	 * @param sycs 设备流水
	 * @return
	 */
	OrderConsume genOrder(Long uid, String userid, SPCSPos pos, Project project, ProjectConsumeItem item, int sycs);
}
