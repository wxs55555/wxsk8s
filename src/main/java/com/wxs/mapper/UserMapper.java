package com.wxs.mapper;



import com.wxs.user.User;
import java.util.List;

public interface UserMapper {
	public User login(User user);
	
	public List<User> searchUser(User user);

	public int insertUser(User user);

	public int updateUser(User user);
}