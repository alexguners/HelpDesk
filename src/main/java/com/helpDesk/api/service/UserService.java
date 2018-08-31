package com.helpDesk.api.service;

import org.springframework.data.domain.Page;

import com.helpDesk.api.entity.User;

public interface UserService {

	User findbyEmail(String email);
	
	User createOrUpdate(User user);
	
	User findById(String id);
	
	void delete (String id);
	
	Page<User> findAll(int page,int count);
}
