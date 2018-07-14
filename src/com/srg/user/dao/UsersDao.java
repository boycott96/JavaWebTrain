package com.srg.user.dao;

import com.srg.user.entity.Users;

public interface UsersDao {
	public int insert(Users user);

	public int getUser(String name,String password);
}
