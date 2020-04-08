package com.bwsk.entity;

/**
 * 用户和企业绑定
 * 
 * @author Administrator
 *
 */
public class UserCompany {

	private int userid;// 用户ID

	private String companyid;// 企业ID

	private String companyname;// 企业名称

	private String remark;// 备注信息

	private int uctype; // 绑定的状态 0 未绑定 1绑定

	private int ucstatus;// 判断是否是当前企业登录 1登录 0 未登录

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getUcstatus() {
		return ucstatus;
	}

	public void setUcstatus(int ucstatus) {
		this.ucstatus = ucstatus;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getUctype() {
		return uctype;
	}

	public void setUctype(int uctype) {
		this.uctype = uctype;
	}

}
