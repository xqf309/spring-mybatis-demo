package com.jd.feima.service;

import com.jd.feima.domain.UserInfo;

import java.util.List;

public interface UserService {

	UserInfo getUserById(int id);

	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
}