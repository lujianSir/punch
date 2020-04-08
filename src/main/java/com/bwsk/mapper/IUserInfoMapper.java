package com.bwsk.mapper;

import org.springframework.stereotype.Repository;

import com.bwsk.entity.UserInfo;

@Repository
public interface IUserInfoMapper {

	/**
	 * 通过用户名查询是否存在
	 * 
	 * @param loginname
	 * @return
	 */
	public UserInfo queryUserInfoByLoginname(String loginname);

	/**
	 * 添加用户信息、注册
	 * 
	 * @param userinfo
	 * @return
	 */
	public int insertUserInfo(UserInfo userinfo);

	/**
	 * 修改用户信息
	 * 
	 * @param userinfo
	 * @return
	 */
	public int updateUserInfo(UserInfo userinfo);
}
