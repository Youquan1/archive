package com.wskj.archive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 本页面基本已失效
 * */
@WebServlet("/kdkkkd")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
//		String id = request.getParameter("id");
//		String username = request.getParameter("username");
//		String phone = request.getParameter("phone");
		
//		UserService us = new UserService();
//		List<User> list = us.selectAllUser();
		
//		request.setAttribute("list", list);
		request.getRequestDispatcher("/userList.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
