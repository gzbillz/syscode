package com.billz.xycode.trans.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.OrderCodeGen;
import com.billz.util.QrCodeGen;
import com.billz.xycode.factory.ProjectEquFactory;
import com.billz.xycode.model.equipment.SPCSPos;
import com.billz.xycode.model.order.OrderConsume;
import com.billz.xycode.model.project.Project;
import com.billz.xycode.model.project.ProjectConsumeItem;
import com.billz.xycode.service.order.OrderConsumeService;
import com.billz.xycode.service.project.ProjectConsumeItemService;
import com.billz.xycode.service.project.ProjectService;
import com.billz.xycode.service.seller.SellerPosKeyService;
import com.billz.xycode.trans.OrderConsumeTranService;
import com.mysql.jdbc.StringUtils;

/**
 * 消费订单处理
 * @class OrderConsumeTranServiceImpl.java
 * @author billz
 * @date 2017年10月30日
 */
@Service
public class OrderConsumeTranServiceImpl implements OrderConsumeTranService {
 
	@Autowired
	private ProjectEquFactory projectEquFactory;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private OrderConsumeService orderConsumeService;
	@Autowired
	private ProjectConsumeItemService projectConsumeItemService;
	@Autowired
	private SellerPosKeyService sellerPosKeyService;
	
	/**
	 * 生成订单
	 * @param uid 用户主键
	 * @param userid 用户编号
	 * @param posid posid编号
	 * @param itemid 消费项目编号
	 * @param sycs 设备流水
	 * @return
	 */
	@Override
	public OrderConsume genOrder(Long uid, String userid, String posid, Long itemid, int sycs) {
		SPCSPos equ = projectEquFactory.findByPosid(posid);
		Project pro = projectService.findByPid(equ.getPid()); // 项目
		ProjectConsumeItem item = projectConsumeItemService.findByItemid(itemid);
		return insert(uid, userid, equ, pro, item, sycs);
	}

	@Override
	public OrderConsume genOrder(Long uid, String userid, SPCSPos pos, Project pro, ProjectConsumeItem item, int sycs) {
		return insert(uid, userid, pos, pro, item, sycs);
	}
	
	private OrderConsume insert(Long uid, String userid, SPCSPos equ, Project pro, ProjectConsumeItem item, int sycs){
		OrderConsume order = new OrderConsume();
		order.setUid(uid);
		order.setUserid(userid);
		order.setCateid(equ.getCateid());
		order.setSubcateid(equ.getSubcateid());
		order.setEid(equ.getEid());
		order.setPosid(equ.getPosid());
		order.setSycs(sycs);
		
		order.setSellerid(pro.getSellerid());
		order.setPid(pro.getPid());
		order.setLogo(pro.getLogo());
		order.setTitle(pro.getPname() + " " + item.getItemname());
		
		order.setItemid(item.getItemid());
		order.setPrice(item.getPrice().doubleValue());
		order.setFare(Double.valueOf(String.format("%.2f", item.getPrice()*0.006))); // 手续费:千分之六
		// 订单号生成
		order.setOrdercode(OrderCodeGen.genOrderCode(1));
		// 二维码生成
		
		String desKey = sellerPosKeyService.findDjKeyByPosid(order.getPosid(), order.getSellerid(), order.getPid(), order.getCateid(), order.getSubcateid());
		if(StringUtils.isNullOrEmpty(desKey)){
			desKey = "0000000000000000"; // 16个0(默认)
		}
		order.setDkey(desKey); // des秘钥
		
		double xfprice = new BigDecimal(order.getPrice()).subtract(new BigDecimal(order.getFare())).setScale(2, RoundingMode.HALF_UP).doubleValue(); // 减去手续费
		order.setQrcode(QrCodeGen.genDesOrderConsume(order.getPosid(), order.getSycs(), order.getUserid(), xfprice, desKey));
		orderConsumeService.insert(order);
		return order;
	}
}
