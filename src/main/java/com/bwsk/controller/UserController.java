package com.bwsk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwsk.entity.UserInfo;
import com.bwsk.service.IUserInfoService;
import com.bwsk.util.Result;

/**
 * 用户相关的接口
 * 
 * @author lujian
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserInfoService userInfoService;

	/**
	 * 登录验证
	 * 
	 * @param loginname
	 * @param password
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loginUserInfo")
	public Result<?> loginUserInfo(String loginname, String password) throws Exception {
		return userInfoService.loginUserInfo(loginname, password);
	}

	/**
	 * 添加、修改、注册
	 * 
	 * @param userinfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertOrUpdateUserInfo")
	public Result<?> insertOrUpdateUserInfo(UserInfo userinfo) throws Exception {
		return userInfoService.insertOrUpdateUserInfo(userinfo);
	}
}
