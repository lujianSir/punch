package com.bwsk.entity;

/**
 * 用户的信息
 * 
 * @author Administrator
 *
 */
public class UserInfo {

	private int userid;// 用户ID

	private String loginname;// 账号名称

	private String password;// 密码

	private String userpic;// 头像

	private String username;// 姓名

	private int usersex;// 1是男生 0是女生

	private String usersexname;// 性别

	private String userbirthday;// 生日

	private String usertelphone;// 联系方式

	private String companyemail;// 邮箱

	private String companytelphone;// 内部电话

	private String worknumber;// 工号

	private String companyposition;// 职位

	private String incompany;// 入职时间

	private String remark;// 备注名

	private String usercreatime;// 创建的时间

	public String getUsercreatime() {
		return usercreatime;
	}

	public void setUsercreatime(String usercreatime) {
		this.usercreatime = usercreatime;
	}

	public String getCompanyposition() {
		return companyposition;
	}

	public void setCompanyposition(String companyposition) {
		this.companyposition = companyposition;
	}

	public String getCompanyemail() {
		return companyemail;
	}

	public void setCompanyemail(String companyemail) {
		this.companyemail = companyemail;
	}

	public String getCompanytelphone() {
		return companytelphone;
	}

	public void setCompanytelphone(String companytelphone) {
		this.companytelphone = companytelphone;
	}

	public String getWorknumber() {
		return worknumber;
	}

	public void setWorknumber(String worknumber) {
		this.worknumber = worknumber;
	}

	public String getIncompany() {
		return incompany;
	}

	public void setIncompany(String incompany) {
		this.incompany = incompany;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUserpic() {
		return userpic;
	}

	public void setUserpic(String userpic) {
		this.userpic = userpic;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserbirthday() {
		return userbirthday;
	}

	public void setUserbirthday(String userbirthday) {
		this.userbirthday = userbirthday;
	}

	public String getUsertelphone() {
		return usertelphone;
	}

	public void setUsertelphone(String usertelphone) {
		this.usertelphone = usertelphone;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsersexname() {
		return usersexname;
	}

	public void setUsersexname(String usersexname) {
		this.usersexname = usersexname;
	}

	public int getUsersex() {
		return usersex;
	}

	public void setUsersex(int usersex) {
		this.usersex = usersex;
	}

}
