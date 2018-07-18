package com.srg.JudgeInput.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srg.user.dao.UsersDao;
import com.srg.user.dao.impl.UserDaoImpl;
import com.srg.user.entity.Users;

/**
 * Servlet implementation class Sin_Up
 */
@WebServlet("/sign_Up")
public class Sign_Up extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sign_Up() {
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
		String phoneNumber = request.getParameter("phone_number");
		String userName = request.getParameter("user_name");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		System.out.println(phoneNumber+" "+userName+" "+password);
		if (phoneNumber == "" || phoneNumber.equals(null)
				|| !(phoneNumber.startsWith("1") && phoneNumber.length() == 11)) {
			response.sendRedirect("popUpWeb/phoneInput.html");
		} else if (userName == "" || userName.equals(null) || userName.length() > 11) {
			response.sendRedirect("popUpWeb/userInput.html");
		} else if (password == "" || password.equals(null) || password.length() < 6
				|| !(password == repassword || password.equals(repassword))) {
			response.sendRedirect("popUpWeb/passwordInput.html");
		} else {
			Users user = new Users();
			user.setPhoneNumber(phoneNumber);
			user.setName(userName);
			user.setPassword(password);
			user.setHead_Icon_Address(userName+".jpg");
			UsersDao ud = new UserDaoImpl();
			int result = ud.insert(user);
			System.out.println("Sign Up Success--------��" + result);
			response.sendRedirect("sign_in.jsp");
		}
	}

}
