package com.srg.music.dao;

import java.util.List;

import com.srg.music.entity.Music;

public interface MusicDao {
	public int insertMusic(Music music);

	public int delete(String music_id);

	public List<Music> getMusic(String music_name,int unumber_id);

	public List<Music> getMusicList(int user_id, int flag);

	public Music getMusic(int music_id);

	public int updateMusic(Music music);
}
