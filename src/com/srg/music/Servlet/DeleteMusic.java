package com.srg.music.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srg.music.dao.MusicDao;
import com.srg.music.dao.impl.MusicDaoImpl;

/**
 * Servlet implementation class DeleteMusic
 */
@WebServlet("/deleteMusic")
public class DeleteMusic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteMusic() {
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
		String music_id = request.getParameter("music_id");
		MusicDao music = new MusicDaoImpl();
		int result = music.delete(music_id);
		if (result > 0) {
			System.out.println("delete success!");
			response.sendRedirect("musicManage");
		}
	}

}
