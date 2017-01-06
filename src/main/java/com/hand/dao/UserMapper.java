package com.hand.dao;

import org.springframework.stereotype.Component;

import com.hand.dto.Customer;
@Component
public interface UserMapper {
	Customer getUserByName(String first_name);
}
