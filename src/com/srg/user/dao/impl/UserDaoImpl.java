package com.srg.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.srg.Dbutil.Dbutil;
import com.srg.user.dao.UsersDao;
import com.srg.user.entity.Users;

public class UserDaoImpl implements UsersDao {

	@Override
	public int insert(Users user) {
		String sql = "insert into usernumber(name,password,phone,head_Icon_Address) values(?,?,?,?)";
		ArrayList<Object> sqlParams = new ArrayList<>();
		sqlParams.add(user.getName());
		sqlParams.add(user.getPassword());
		sqlParams.add(user.getPhoneNumber());
		sqlParams.add(user.getHead_Icon_Address());
		int result = Dbutil.executeUpdate(sql, sqlParams);
		return result;
	}

	@Override
	public Users getUser(String name,String password) {
		String sql = "select * from usernumber where name=? and password=?";
		ArrayList<Object> sqlParams = new ArrayList<>();
		sqlParams.add(name);
		sqlParams.add(password);
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Users user = new Users();
		con = Dbutil.getConnection();
		try {
			ps= con.prepareStatement(sql);
			if (sqlParams != null && sqlParams.size() > 0) {
				Dbutil.bindParams(ps, sqlParams);
			}
			rs = ps.executeQuery();
			while(rs!=null & rs.next()) {
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setPhoneNumber(rs.getString("phone"));
				user.setHead_Icon_Address(rs.getString("head_Icon_Address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Dbutil.close(rs, ps, con);
		}
		
		return user;
	}

}
