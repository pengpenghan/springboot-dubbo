package com.hpp.service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hpp.service.IUserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Reference(version = "1.0.0")
	IUserService userService;
	
	@RequestMapping(value = "/userlist")
	public List<String> name() {
		return userService.getUserList();
	}
	
}
