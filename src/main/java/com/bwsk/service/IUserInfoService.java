package com.bwsk.service;

import com.bwsk.entity.UserInfo;
import com.bwsk.util.Result;

public interface IUserInfoService {
	/**
	 * 通过账号密码登录
	 * 
	 * @param loginname
	 * @param password
	 * @return
	 */
	public Result<?> loginUserInfo(String loginname, String password) throws Exception;

	/**
	 * 注册、修改用户信息
	 * 
	 * @param userinfo
	 * @return
	 */
	public Result<?> insertOrUpdateUserInfo(UserInfo userinfo) throws Exception;
}
