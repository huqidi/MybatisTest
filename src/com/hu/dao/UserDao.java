package com.hu.dao;

import java.util.List;

import com.hu.domain.User;

public interface UserDao {
	public User findUserById(int id) throws Exception;
	public List<User> findAllUsers() throws Exception;
	public void insertUser(User user) throws Exception ;
	public void deleteUserById(int id) throws Exception;
	public void updateUserPassword(User user) throws Exception;
	
}
