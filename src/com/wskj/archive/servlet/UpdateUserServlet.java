package com.wskj.archive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wskj.archive.pojo.User;
import com.wskj.archive.service.UserService;

@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		UserService us = new UserService();
		User user = us.get(Integer.parseInt(id));
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("/updateUserInfo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String username = request.getParameter("username").trim();
		String phone = request.getParameter("phone").trim();
		String email = request.getParameter("email").trim();
		
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setUsername(username);
		user.setPhone(phone);
		user.setEmail(email);
		
		UserService us = new UserService();
		us.updateUserInfo(user);
		response.sendRedirect("/SearchUserServlet");
	}

}
