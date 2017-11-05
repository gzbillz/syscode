package com.billz.xycode.model.seller;

import java.util.Date;

public class SellerWithdraw {

	private Long swid;
	private Long sellerid;
	private Integer said;
	private Double money;
	private Integer status;
	private String remark;
	private String wxshh;
	private Date createtime;
	
	// 关联字段
	private String sellername; // 商家名称
	private String catename; // 钱包类型

	public Long getSwid() {
		return swid;
	}

	public void setSwid(Long swid) {
		this.swid = swid;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public Integer getSaid() {
		return said;
	}

	public void setSaid(Integer said) {
		this.said = said;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getWxshh() {
		return wxshh;
	}

	public void setWxshh(String wxshh) {
		this.wxshh = wxshh;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	public String getSellername(){
		return sellername;
	}
	
	public void setSellername(String sellername){
		this.sellername = sellername;
	}
	
	public String getCatename(){
		return catename;
	}
	
	public void setCatename(String catename){
		this.catename = catename;
	}
}
