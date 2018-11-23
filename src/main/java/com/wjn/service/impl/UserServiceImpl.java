package com.wjn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjn.dao.UserMapper;
import com.wjn.entity.User;
import com.wjn.entity.UserExample;
import com.wjn.entity.UserExample.Criteria;
import com.wjn.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	private UserExample example;
	private Criteria criteria;

	public User login(User user) {
		User login_user = null;
		init();

		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordEqualTo(user.getPassword());
		List<User> list = mapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			login_user = list.get(0);
		}

		endOp();
		return login_user;
	}

	private void init() {
		example = new UserExample();
		criteria = example.createCriteria();
	}

	private void endOp() {
		example = null;
		criteria = null;
	}

}
