package com.helpDesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.helpDesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByEmail(String email);

}
