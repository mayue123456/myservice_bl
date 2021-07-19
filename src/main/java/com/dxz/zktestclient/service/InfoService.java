package com.dxz.zktestclient.service;

import com.dxz.zktestclient.entity.User;

public interface InfoService {

	User selectUserByName(String userName);
}
