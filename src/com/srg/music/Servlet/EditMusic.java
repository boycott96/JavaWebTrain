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
 * Servlet implementation class EditMusic
 */
@WebServlet("/editMusic")
public class EditMusic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditMusic() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String music_id = request.getParameter("music_id");
		MusicDao musicDao = new MusicDaoImpl();
		Music music = musicDao.getMusic(Integer.valueOf(music_id));
		request.setAttribute("music", music);
		request.getRequestDispatcher("alter_music.jsp").forward(request, response);
	}

}
