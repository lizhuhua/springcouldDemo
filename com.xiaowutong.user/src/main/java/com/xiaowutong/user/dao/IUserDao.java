package com.xiaowutong.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaowutong.user.entity.User;

public interface IUserDao extends BaseMapper<User> {

	User selectUserById(String username);
	
}
