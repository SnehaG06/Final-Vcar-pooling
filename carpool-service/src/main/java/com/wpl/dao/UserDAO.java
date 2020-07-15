package com.wpl.dao;


import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import com.wpl.model.User;
import com.wpl.model.Login;

@Component
public interface UserDAO extends Repository<User,Integer> {
	
	void save(User user);
	void update(User user);
	void register(User user);
	 User validateUser(Login login);
	void delete(User user);
	User findByUserId(String userId);
	int checkUserInDB(String userId,String password);
	int getIncorrectAttempts(String userId);
	void updateIncorrectAttempts(String userId);
}
