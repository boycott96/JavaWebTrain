package com.srg.music.Servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class MusicManage
 */
@WebServlet("/musicManage")
public class MusicManage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MusicManage() {
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
		System.out.println(user.toString());
		String music_address = request.getParameter("music_address");
		if(music_address==null||music_address.equals(null)) 
			music_address = "452613551";
		MusicDao md = new MusicDaoImpl();
		List<Music> musicList = md.getMusicList(user.getId(),1);
		request.setAttribute("musicList", musicList);
		request.setAttribute("music_address", music_address);
		request.getRequestDispatcher("home_page.jsp").forward(request, response);
	}

}
