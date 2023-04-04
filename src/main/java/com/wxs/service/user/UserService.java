package com.wxs.service.user;

import com.wxs.mapper.UserMapper;
import com.wxs.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public User login(User user){
		return userMapper.login(user);
	};
	
	public List<User> searchUser(User user){
		return userMapper.searchUser(user);
	};

	public int insertUser(User user){
		return userMapper.insertUser(user);
	};

	public int updateUser(User user){
		return userMapper.updateUser(user);
	};
}