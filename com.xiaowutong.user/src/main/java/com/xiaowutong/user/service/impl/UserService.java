package com.xiaowutong.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaowutong.user.dao.IUserDao;
import com.xiaowutong.user.entity.User;
import com.xiaowutong.user.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public String login(User user) {
//		userDao.insert(user);
		User users = userDao.selectUserById("xiaoxiong");
		return users.getPassword();
	}

}
