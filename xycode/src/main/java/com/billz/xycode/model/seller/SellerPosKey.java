package com.billz.xycode.model.seller;

public class SellerPosKey {

	private Long kid;
	private Long sellerid;
	private Long pid;
	private Integer cateid;
	private Integer subcateid;
	private String posid;
	private String dkey;
	private String djkey; // 加密秘钥(即：生成消费订单秘钥)
	private Boolean status;
	private Integer zyy;

	// 关联字段
	private String sellername;
	private String pname;
	private String catename;
	private String subname;

	public Long getKid() {
		return kid;
	}

	public void setKid(Long kid) {
		this.kid = kid;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Integer getCateid() {
		return cateid;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	public Integer getSubcateid() {
		return subcateid;
	}

	public void setSubcateid(Integer subcateid) {
		this.subcateid = subcateid;
	}

	public String getPosid() {
		return posid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	/**
	 * 解密秘钥(即：二维码解码秘钥)
	 * 
	 * @return
	 */
	public String getDkey() {
		return dkey;
	}

	public void setDkey(String dkey) {
		this.dkey = dkey;
	}

	/**
	 * 加密秘钥(即：生成消费订单秘钥)
	 * 
	 * @return
	 */
	public String getDjkey() {
		return djkey;
	}

	public void setDjkey(String djkey) {
		this.djkey = djkey;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getZyy() {
		return zyy;
	}

	public void setZyy(Integer zyy) {
		this.zyy = zyy;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}
}
