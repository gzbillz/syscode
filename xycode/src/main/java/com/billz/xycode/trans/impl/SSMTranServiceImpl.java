package com.billz.xycode.trans.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billz.util.ScriptUtil;
import com.billz.xycode.model.project.ProjectSplitmoney;
import com.billz.xycode.model.project.ProjectSplitmoneySetting;
import com.billz.xycode.model.seller.SplitmoneyRule;
import com.billz.xycode.service.project.ProjectSplitmoneyService;
import com.billz.xycode.service.project.ProjectSplitmoneySettingService;
import com.billz.xycode.service.seller.SplitmoneyRuleService;
import com.billz.xycode.trans.SSMTranService;

/**
 * 商家分账处理
 * @class SSMTranServiceImpl.java
 * @author billz
 * @date 2017年10月9日
 */
@Service
public class SSMTranServiceImpl implements SSMTranService {

	@Autowired
	private ProjectSplitmoneySettingService pssService;
	@Autowired
	private SplitmoneyRuleService splitmoneyRuleService;
	@Autowired
	private ProjectSplitmoneyService fzService;
	
	@Override
	public int splitmoney(int cateid, Long pid, String posid, double price, String remark, List<ProjectSplitmoney> pslist) {
		List<ProjectSplitmoneySetting> sslist = pssService.findFzByPid(pid);
		if(sslist != null && sslist.size() > 0){
 			double total = 0;
			SplitmoneyRule rule;
			for(ProjectSplitmoneySetting pss : sslist){
				// 1.获取计算规则
				rule = splitmoneyRuleService.findByRuleid(pss.getRuleid());
				if(rule == null){
					continue;
				}
				
				// 2.计算金额
				double fzmoney = ScriptUtil.eval(rule.getContent(), rule.getFunname(), price);
				if(fzmoney == 0){
					continue;
				}
				
				total += fzmoney; // 记录总的分账金额
				if(total > price){
					return 0;
				}
				
				// 3.保存分账记录
				ProjectSplitmoney psmoney = new ProjectSplitmoney();
				psmoney.setSellerid(pss.getSellerid());
				psmoney.setPid(pid);
				psmoney.setPosid(posid);
				psmoney.setMoney(fzmoney);
				psmoney.setCateid(cateid);
				psmoney.setRemark(remark);
				pslist.add(psmoney);
			}
			sslist.clear();
			
			for(ProjectSplitmoney ps : pslist){
				fzService.insert(ps); // 保存数据
			}
 			return 1;
		}
		return 0;
	}

}
