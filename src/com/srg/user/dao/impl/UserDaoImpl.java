package com.srg.user.dao.impl;

import java.util.ArrayList;

import com.srg.Dbutil.Dbutil;
import com.srg.user.dao.UsersDao;
import com.srg.user.entity.Users;

public class UserDaoImpl implements UsersDao {

	@Override
	public int insert(Users user) {
		String sql = "insert into usernumber(name,password,phone) values(?,?,?)";
		ArrayList<Object> sqlParams = new ArrayList<>();
		sqlParams.add(user.getName());
		sqlParams.add(user.getPassword());
		sqlParams.add(user.getPhoneNumber());
		int result = Dbutil.executeUpdate(sql, sqlParams);
		return result;
	}

	@Override
	public int getUser(String name,String password) {
		String sql = "select * from usernumber where name=? and password=?";
		ArrayList<Object> sqlParams = new ArrayList<>();
		sqlParams.add(name);
		sqlParams.add(password);
		int result = Dbutil.executeQuery(sql, sqlParams).size();
		return result;
	}

}
