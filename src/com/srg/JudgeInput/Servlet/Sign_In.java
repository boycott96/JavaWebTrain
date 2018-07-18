package com.srg.JudgeInput.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.srg.user.dao.UsersDao;
import com.srg.user.dao.impl.UserDaoImpl;
import com.srg.user.entity.Users;

/**
 * Servlet implementation class Log_In
 */
@WebServlet("/sign_In")
public class Sign_In extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sign_In() {
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
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		if (userName == "" || userName.equals(null)) {
			response.sendRedirect("popUpWeb/userNull.html");
		} else if (password == "" || password.equals(null)) {
			response.sendRedirect("popUpWeb/passwordNull.html");
		} else {
			System.out.println(userName + " " + password);
			UsersDao ud = new UserDaoImpl();
			Users user = ud.getUser(userName, password);
			if (user.getId() > 0) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				request.getRequestDispatcher("musicManage").forward(request, response);

			} else {
				response.sendRedirect("popUpWeb/passwordNull.html");
			}
		}

	}
}
