package com.srg.music.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.srg.music.dao.MusicDao;
import com.srg.music.dao.impl.MusicDaoImpl;
import com.srg.music.entity.Music;
import com.srg.user.entity.Users;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addMusic")
public class AddMusic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddMusic() {
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
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		String music_name = request.getParameter("music_name");
		String music_author = request.getParameter("music_author");
		String music_web_address = request.getParameter("music_address");

		int index = music_web_address.indexOf("id=") + 3;
		int endIndex = music_web_address.indexOf("&");
		String music_address = music_web_address.substring(index, endIndex);
		Music music = new Music();
		music.setMusic_name(music_name);
		music.setMusic_author(music_author);
		music.setMusic_time(0);
		music.setMusic_address(music_address);
		music.setUnumber_id(user.getId());

		MusicDao musicDao = new MusicDaoImpl();
		int result = musicDao.insertMusic(music);
		if (result > 0) {
			System.out.println("insert success");
			response.sendRedirect("musicManage");
		}else {
			System.out.println("insert fail");
			response.sendRedirect("add_music.jsp");
		}
	}
}
