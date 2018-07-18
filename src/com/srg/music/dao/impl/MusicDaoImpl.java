package com.srg.music.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.srg.Dbutil.Dbutil;
import com.srg.music.dao.MusicDao;
import com.srg.music.entity.Music;

public class MusicDaoImpl implements MusicDao {

	@Override
	public int insertMusic(Music music) {
		String sql = "insert into music(music_name,music_author,music_time,music_address) values(?,?,?,?)";
		List<Object> sqlParams = new ArrayList<>();
		sqlParams.add(music.getMusic_name());
		sqlParams.add(music.getMusic_author());
		sqlParams.add(music.getMusic_time());
		sqlParams.add(music.getMusic_address());
		int result = Dbutil.executeUpdate(sql, sqlParams);
		return result;
	}

	@Override
	public List<Music> getMusic() {
		String sql = "select * from music";
		@SuppressWarnings("unchecked")
		List<Music> music = Dbutil.executeQuery(sql, null);
		return music;
	}

	@Override
	public List<Music> getMusic(String music_name) {
		String sql = "select * from music where music_name like ?";
		List<Object> sqlParams = new ArrayList<>();
		sqlParams.add(music_name);
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

}
