package com.srg.music.entity;

public class Music {
	private String music_name;
	private String music_author;
	private int music_time;
	private int music_id;
	private String music_address;

	public Music() {
		super();
	}

	public String getMusic_name() {
		return music_name;
	}

	public void setMusic_name(String music_name) {
		this.music_name = music_name;
	}

	public String getMusic_author() {
		return music_author;
	}

	public void setMusic_author(String music_author) {
		this.music_author = music_author;
	}

	public int getMusic_time() {
		return music_time;
	}

	public void setMusic_time(int music_time) {
		this.music_time = music_time;
	}

	public int getMusic_id() {
		return music_id;
	}

	public void setMusic_id(int music_id) {
		this.music_id = music_id;
	}

	public String getMusic_address() {
		return music_address;
	}

	public void setMusic_address(String music_address) {
		this.music_address = music_address;
	}

	@Override
	public String toString() {
		return "Music [music_name=" + music_name + ", music_author=" + music_author + ", music_time=" + music_time
				+ ", music_id=" + music_id + ", music_address=" + music_address + "]";
	}

}
