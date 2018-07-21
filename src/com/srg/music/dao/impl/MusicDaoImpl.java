package com.srg.music.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.srg.Dbutil.Dbutil;
import com.srg.music.dao.MusicDao;
import com.srg.music.entity.Music;

public class MusicDaoImpl implements MusicDao {

	@Override
	public int insertMusic(Music music) {
		String sql = "insert into music(music_name,music_author,music_time,music_address,unumber_id) values(?,?,?,?,?)";
		List<Object> sqlParams = new ArrayList<>();
		sqlParams.add(music.getMusic_name());
		sqlParams.add(music.getMusic_author());
		sqlParams.add(music.getMusic_time());
		sqlParams.add(music.getMusic_address());
		sqlParams.add(music.getUnumber_id());
		int result = Dbutil.executeUpdate(sql, sqlParams);
		return result;
	}

	@Override
	public List<Music> getMusicList(int user_id, int flag) {
		StringBuilder sb = new StringBuilder("select * from music where unumber_id=? order by ");
		if (flag == 1)
			sb.append("music_name");
		else {
			sb.append("music_time desc");
		}
		String sql = sb.toString();
		List<Object> sqlParams = new ArrayList<>();
		sqlParams.add(user_id);
		@SuppressWarnings("unchecked")
		List<Music> music = Dbutil.executeQuery(sql, sqlParams);
		return music;
	}

	@Override
	public List<Music> getMusic(String music_name,int unumber_id) {
		String sql = "select * from music where music_name like ? and unumber_id=? order by music_name";
		List<Object> sqlParams = new ArrayList<>();
		sqlParams.add(music_name);
		sqlParams.add(unumber_id);
		@SuppressWarnings("unchecked")
		List<Music> music = Dbutil.executeQuery(sql, sqlParams);
		return music;
	}

	@Override
	public int delete(String music_id) {
		String sql = "delete from music where music_id=?";
		List<Object> sqlParams = new ArrayList<>();
		sqlParams.add(music_id);
		int result = Dbutil.executeUpdate(sql, sqlParams);
		return result;
	}

	@Override
	public Music getMusic(int music_id) {
		String sql = "select * from music where music_id=?";
		List<Object> sqlParams = new ArrayList<>();
		sqlParams.add(music_id);
		Connection con = Dbutil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Music music = new Music();
		try {
			ps = con.prepareStatement(sql);
			if (sqlParams != null && sqlParams.size() > 0) {
				Dbutil.bindParams(ps, sqlParams);
			}
			rs = ps.executeQuery();
			while (rs != null & rs.next()) {
				music.setMusic_name(rs.getString("music_name"));
				music.setMusic_author(rs.getString("music_author"));
				music.setMusic_time(rs.getInt("music_time"));
				music.setMusic_id(rs.getInt("music_id"));
				music.setMusic_address(rs.getString("music_address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dbutil.close(rs, ps, con);
		}
		return music;
	}

	@Override
	public int updateMusic(Music music) {
		String sql = "update music set music_name=?,music_author=?,music_time=?,music_address=? where music_id=?";
		List<Object> sqlParams = new ArrayList<>();
		sqlParams.add(music.getMusic_name());
		sqlParams.add(music.getMusic_author());
		sqlParams.add(music.getMusic_time());
		sqlParams.add(music.getMusic_address());
		sqlParams.add(music.getMusic_id());
		int result = Dbutil.executeUpdate(sql, sqlParams);
		return result;
	}

}
