package com.srg.Dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Dbutil {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/user?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT",
					"root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static int executeUpdate(String sql, List<Object> sqlParams) {
		Connection con = null;
		PreparedStatement ps = null;
		int i = 0;
		con = Dbutil.getConnection();
		try {
			ps = con.prepareStatement(sql);
			if (sqlParams != null && sqlParams.size() > 0) {
				Dbutil.bindParams(ps, sqlParams);
			}
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbutil.close(null, ps, con);
		}
		return i;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List executeQuery(String sql,List<Object> sqlParams) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList<>();
		con = Dbutil.getConnection();
		try {
			ps = con.prepareStatement(sql);
			if (sqlParams != null && sqlParams.size() > 0) {
				Dbutil.bindParams(ps, sqlParams);
			}
			rs = ps.executeQuery();
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			Map rowData = new HashMap();
			
			while(rs.next()) {
				rowData = new HashMap(columnCount);
				for(int i = 1;i<=columnCount;i++) {
					rowData.put(md.getColumnName(i), rs.getObject(i));
				}
				list.add(rowData);
				System.out.println("list:"+list.toString());
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Dbutil.close(rs, ps, con);
		}
		return list;
		
	}

	private static void bindParams(PreparedStatement ps, List<Object> sqlParams) {
		for (int i = 0; i < sqlParams.size(); i++) {
			try {
				ps.setObject(i + 1, sqlParams.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void close(ResultSet rs, PreparedStatement ps, Connection con) {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		if (ps != null)
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				ps = null;
			}
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				con = null;
			}
	}
}
