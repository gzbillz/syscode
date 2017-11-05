package com.billz.sys.model;

import java.util.Date;

public class SysUser {
	
	private Long userid;
	private String uname;
	private String nickname;
	private String logo;
	private String pwd;
	private Boolean status;
	private Long roleid;
	private Long sellerid;
	private String loginip;
	private Date logindate;
	private Date createtime;
	
	public Long getUserid(){
		return userid;
	}
	
	public void setUserid(Long userid){
		this.userid = userid;
	}
	
	public String getUname(){
		return uname;
	}
	
	public void setUname(String uname){
		this.uname = uname;
	}
	public String getNickname(){
		return nickname;
	}
	
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	public String getLogo(){
		return logo;
	}
	
	public void setLogo(String logo){
		this.logo = logo;
	}
	public String getPwd(){
		return pwd;
	}
	
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
	public Boolean getStatus(){
		return status;
	}
	
	public void setStatus(Boolean status){
		this.status = status;
	}
	public Long getRoleid(){
		return roleid;
	}
	
	public void setRoleid(Long roleid){
		this.roleid = roleid;
	}
	public Long getSellerid(){
		return sellerid;
	}
	
	public void setSellerid(Long sellerid){
		this.sellerid = sellerid;
	}
	public String getLoginip(){
		return loginip;
	}
	
	public void setLoginip(String loginip){
		this.loginip = loginip;
	}
	public Date getLogindate(){
		return logindate;
	}
	
	public void setLogindate(Date logindate){
		this.logindate = logindate;
	}
	public Date getCreatetime(){
		return createtime;
	}
	
	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}
}
