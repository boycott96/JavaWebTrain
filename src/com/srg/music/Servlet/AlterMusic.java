package com.srg.music.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srg.music.dao.MusicDao;
import com.srg.music.dao.impl.MusicDaoImpl;
import com.srg.music.entity.Music;

/**
 * Servlet implementation class AlterMusic
 */
@WebServlet("/alterMusic")
public class AlterMusic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AlterMusic() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String music_id = request.getParameter("music_id");
		String music_name = request.getParameter("music_name");
		String music_author = request.getParameter("music_author");
		String music_time = request.getParameter("music_time");
		String music_web_address = request.getParameter("music_address");

		int index = music_web_address.indexOf("id=") + 3;
		int endIndex = music_web_address.indexOf("&");
		String music_address = music_web_address.substring(index, endIndex);
		
		Music music = new Music();
		music.setMusic_name(music_name);
		music.setMusic_author(music_author);
		music.setMusic_time(Integer.valueOf(music_time));
		music.setMusic_id(Integer.valueOf(music_id));
		music.setMusic_address(music_address);
		MusicDao musicDao = new MusicDaoImpl();
		int result = musicDao.updateMusic(music);
		if(result>0) {
			System.out.println("Alter Success");
		}else {
			System.out.println("Alter Fail");
		}
		response.sendRedirect("musicManage");
	}

}
