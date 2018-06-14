package com.wskj.archive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wskj.archive.pojo.User;
import com.wskj.archive.service.UserService;

@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username").trim();
		String password = request.getParameter("password");
		String phone = request.getParameter("phone").trim();
		String email = request.getParameter("email").trim();
		User user = new User();
		UserService us = new UserService();
		boolean NoUserExisted = us.userExisted(username);
		
		if (NoUserExisted ) {
			user.setUsername(username);
			user.setPassword(password);
			user.setPhone(phone);
			user.setEmail(email);
			us.add(user);
			response.sendRedirect("/SearchUserServlet");
		} else {
			request.setAttribute("UserExisted", "用户名已存在");
			request.getRequestDispatcher("/addUser.jsp").forward(request, response);
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
