package com.hu.test;

import java.util.List;

import org.junit.Test;

import com.hu.dao.UserDao;
import com.hu.dao.impl.UserDaoImpl;
import com.hu.domain.User;

public class Test1 {

	@Test
	public void testFindUserById()throws Exception {
		UserDao userDao = new UserDaoImpl();
		User user = userDao.findUserById(1);
		System.out.println(user);
	}
	@Test
	public void testFindAllUser()throws Exception{
		UserDao userDao = new UserDaoImpl();
		List<User> findAllUsers = userDao.findAllUsers();
		for(User user2 :findAllUsers) {
			System.out.println(user2);
		}
	
	}
	@Test
	public void testInsertUser()throws Exception{
		UserDao userDao = new UserDaoImpl();
		User user = new User();
		user.setUsername("°×¸ë¸ë");
		user.setPassword("123");
		user.setAge(13);
		userDao.insertUser(user);
	}
	
	@Test
	public void testDeleteUserById()throws Exception {
		UserDao userDao = new UserDaoImpl();
		userDao.deleteUserById(2);
	}
	
	@Test
	public void testUpdateUserPassword() throws Exception{
		UserDao userDao = new UserDaoImpl();
		User user = new User();
		user.setId(4);
		user.setPassword("newpassword");
		userDao.updateUserPassword(user);
	}
}