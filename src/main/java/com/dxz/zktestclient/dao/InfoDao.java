package com.dxz.zktestclient.dao;

import org.apache.ibatis.annotations.Mapper;

import com.dxz.zktestclient.entity.User;

@Mapper
public interface InfoDao {
	/**
	 * 根据user_name查询数据库
	 * (映射执行mapper文件中的sql语句selectUserByUserName)
	 * @param userName 名字
	 * @return User
	 */
	public User selectUserByUserName(String userName);
}
