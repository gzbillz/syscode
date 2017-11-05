package com.billz.xycode.trans;

import java.util.List;

import com.billz.xycode.model.project.ProjectSplitmoney;

/**
 * 商家分账处理
 * @class SSMTranService.java
 * @author billz
 * @date 2017年10月9日
 */
public interface SSMTranService {
	
	/**
	 * 项目商家分账
	 * @param cateid 设备分类
	 * @param pid 项目主键
	 * @param posid 设备编号
	 * @param price 消费金额
	 * @param remark 分账备注
	 * @param pslist 分账记录[回传记录]
	 * @return
	 */
	public int splitmoney(int cateid, Long pid, String posid, double price, String remark, List<ProjectSplitmoney> pslist);
}
