package com.billz.xycode.trans.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.xycode.model.seller.SellerAccount;
import com.billz.xycode.model.seller.SellerAccountHis;
import com.billz.xycode.service.seller.SellerAccountHisService;
import com.billz.xycode.service.seller.SellerAccountService;
import com.billz.xycode.trans.SATranService;

/**
 * 商家账户更新处理
 * @class SATranServiceImpl.java
 * @author billz
 * @date 2017年10月9日
 */
@Service
public class SATranServiceImpl implements SATranService {

	@Autowired
	private SellerAccountService saService;
	@Autowired
	private SellerAccountHisService hisService;
	
	@Override
	public int updateSellerAccount(Long sellerid, int satype, double price, boolean isRz, String remark) {
		if(price<=0){
			return 0;
		}
		SellerAccount sa = saService.findBySelleridAndSatype(sellerid, satype);
		if(sa != null){
			double balance = sa.getBalance().doubleValue() + price;
			if(!isRz){
				balance = sa.getBalance().doubleValue() - price;
				if(balance < 0){
					return 0;
				}
			}
			saService.updateBalanceBySaid(sa.getSaid(), balance);
			
			// 添加记录
			SellerAccountHis his = new SellerAccountHis();
			his.setBmoney(sa.getBalance());
			his.setMoney(price);
			his.setAmoney(balance);
			his.setRemark(remark);
			his.setSaid(sa.getSaid());
			his.setTranstype(isRz); // 入账
			hisService.insert(his);
		}
		return 0;
	}

}
