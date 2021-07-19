package com.dxz.zktestclient.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxz.zktestclient.dao.InfoDao;
import com.dxz.zktestclient.entity.User;

@Service
public class InfoServiceImpl implements InfoService {


	@Autowired
	private InfoDao infoDao;//注入UserDao
	
	@Override
	public User selectUserByName(String userName) {
		return infoDao.selectUserByUserName(userName);
	}


}
