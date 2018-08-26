package com.hu.dao.impl;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hu.dao.UserDao;
import com.hu.domain.User;


// µœ÷¿‡
public  class UserDaoImpl implements UserDao{
	public User findUserById(int id) throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory  factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		
		//--------------------
		
		User user = session.selectOne("user.findUserById", id);
		
		
		//----------------------
		
		session.close();
		
		
		return user;
	}
	public void insertUser(User user) throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		
		
		//-------------------------
		
		session.insert("user.insertUser",user);
		session.commit();
		
		//-------------------------
		
		session.close();
	}
	
	
	
	public void deleteUserById(int id) throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		
		//----------------------
		
		
		session.delete("user.deleteUserById",id);
		session.commit();
		
		//----------------------
		
		
		session.close();
	}
	
	public void updateUserPassword(User user) throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		
		
		//-------------------------
		
		session.update("user.updateUserPassword", user);
		session.commit();
		
		
		//-------------------------
	
		session.close();
	
	}
	public List<User> findAllUsers() throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		
		//---------------------
		
		List<User> users = session.selectList("user.findUserAll");
		
		//---------------------
		
		
		
		session.close();
		return users;
	}
	


	
}
