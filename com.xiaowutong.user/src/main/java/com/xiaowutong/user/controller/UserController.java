package com.xiaowutong.user.controller;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiaowutong.user.entity.User;
import com.xiaowutong.user.service.IUserService;

@RestController
@Path("/user")
public class UserController {
	
	@Autowired
	private IUserService userServcie;	
	
	@RequestMapping(path = "/{login}", method = RequestMethod.POST)
	public String login(@RequestBody User user) {
		return userServcie.login(user);
	}
}
