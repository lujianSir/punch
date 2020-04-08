package com.bwsk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwsk.entity.UserInfo;
import com.bwsk.mapper.IUserInfoMapper;
import com.bwsk.service.IUserInfoService;
import com.bwsk.util.CheckUtils;
import com.bwsk.util.Md5;
import com.bwsk.util.Result;
import com.bwsk.util.TimeUtils;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	private IUserInfoMapper userInfoMapper;

	@Override
	public Result<?> loginUserInfo(String loginname, String password) throws Exception {
		// TODO Auto-generated method stub
		if (CheckUtils.checkString(loginname)) {// 判断用户名是否为空
			UserInfo userInfo = userInfoMapper.queryUserInfoByLoginname(loginname);
			if (userInfo == null) {
				return Result.error(500, "用户不存在");
			} else {
				String oldpassword = userInfo.getPassword();
				if (CheckUtils.checkString(password)) {// 判断密码是否为空
					if (Md5.EncoderByMd5(password).equals(oldpassword)) {
						userInfo.setPassword("");
						return Result.success(userInfo);
					} else {
						return Result.error(501, "用户或密码错误");
					}
				} else {
					return Result.error(502, "密码不能为空");
				}
			}
		} else {
			return Result.error(503, "账号不能为空");
		}

	}

	@Override
	public Result<?> insertOrUpdateUserInfo(UserInfo userinfo) throws Exception {
		// TODO Auto-generated method stub
		if (CheckUtils.checkString(userinfo.getPassword())) {
			String password = userinfo.getPassword();
			userinfo.setPassword(Md5.EncoderByMd5(password));
		}
		if (CheckUtils.checkString(userinfo.getUsersexname())) {
			switch (userinfo.getUsersexname()) {
			case "男":
				userinfo.setUsersex(1);
				break;
			case "女":
				userinfo.setUsersex(0);
				break;
			default:
				break;
			}
		}
		int row = 0;
		if (userinfo.getUserid() > 0) {// 存在 修改
			row = userInfoMapper.updateUserInfo(userinfo);
			return Result.success(row);
		} else {
			String currentTime = TimeUtils.getCurrent();
			userinfo.setUsercreatime(currentTime);
			row = userInfoMapper.insertUserInfo(userinfo);
			return Result.success(userinfo.getUserid());
		}

	}

}
