package com.wskj.archive.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wskj.archive.pojo.User;
import com.wskj.archive.service.UserService;
import com.wskj.archive.util.PageInfo;

@WebServlet("/SearchUserServlet")
public class SearchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String phone = request.getParameter("phone");
		
		int page = 1;
		int pageSize = 3;
		String jsppage = request.getParameter("page");
		if (jsppage != null) {
			page = Integer.parseInt(jsppage);
		}
		
		UserService us = new UserService();
		PageInfo<User> pi = us.showPage(username,phone,page,pageSize);
		
		request.setAttribute("pi", pi);
		
		if (pi.getTotalSize() == 0) {
			request.setAttribute("NoResult", "在用户列表中没有检索到您想查询的信息，您可以尝试输入其他关键字。");
		} 
		
		request.getRequestDispatcher("/userList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
