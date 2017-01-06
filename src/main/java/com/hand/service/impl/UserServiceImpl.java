package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.UserMapper;
import com.hand.dto.Customer;
import com.hand.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public Customer getUserByName(String first_name) {
		return userMapper.getUserByName(first_name);
	}

}
