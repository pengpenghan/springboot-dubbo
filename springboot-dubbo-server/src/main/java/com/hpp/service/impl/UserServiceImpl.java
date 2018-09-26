package com.hpp.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.hpp.service.IUserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService {

	@Override
	public List<String> getUserList() {
		List<String> list = new ArrayList<String>();
		list.add("hpp");
		list.add("djj");
		list.add("xlg");
		list.add("szl");
		return list;
	}

}
