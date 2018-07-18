package com.srg.music.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srg.music.dao.MusicDao;
import com.srg.music.dao.impl.MusicDaoImpl;
import com.srg.music.entity.Music;

/**
 * Servlet implementation class SerachMusic
 */
@WebServlet("/serachMusic")
public class SerachMusic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SerachMusic() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String music_name = request.getParameter("music_name");
		StringBuilder sb = new StringBuilder("%");
		sb.append(music_name);
		sb.append("%");
		MusicDao music = new MusicDaoImpl();
		List<Music> musicList = music.getMusic(sb.toString());
		request.setAttribute("musicList", musicList);
		request.getRequestDispatcher("home_page.jsp").forward(request, response);
	}

}
