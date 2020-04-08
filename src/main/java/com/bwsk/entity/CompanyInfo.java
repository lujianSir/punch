package com.bwsk.entity;

public class CompanyInfo {

	private String companyid;// 企业的ID

	private String companyname;// 企业的名称

	private String companylogo;// 企业的logo

	private String companyindustry;// 行业

	private String companyregion;// 地区

	private int companyscale;// 规模 1 ； 2 ；3 ；4 ； 5； 6

	private String companyscalename;// 规模名称 1~50人 ；51~100人 ；101~200人 ；201~500人 ；501~1000人；1001及以上

	private String companytel;// 联系方式

	private int userid;// 创建者的ID

	private String companycreatime;// 创建时间

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCompanycreatime() {
		return companycreatime;
	}

	public void setCompanycreatime(String companycreatime) {
		this.companycreatime = companycreatime;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getCompanylogo() {
		return companylogo;
	}

	public void setCompanylogo(String companylogo) {
		this.companylogo = companylogo;
	}

	public String getCompanyindustry() {
		return companyindustry;
	}

	public void setCompanyindustry(String companyindustry) {
		this.companyindustry = companyindustry;
	}

	public String getCompanyregion() {
		return companyregion;
	}

	public void setCompanyregion(String companyregion) {
		this.companyregion = companyregion;
	}

	public int getCompanyscale() {
		return companyscale;
	}

	public void setCompanyscale(int companyscale) {
		this.companyscale = companyscale;
	}

	public String getCompanyscalename() {
		return companyscalename;
	}

	public void setCompanyscalename(String companyscalename) {
		this.companyscalename = companyscalename;
	}

	public String getCompanytel() {
		return companytel;
	}

	public void setCompanytel(String companytel) {
		this.companytel = companytel;
	}

}
