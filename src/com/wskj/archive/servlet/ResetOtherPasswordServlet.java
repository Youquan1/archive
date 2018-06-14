package com.wskj.archive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wskj.archive.pojo.User;
import com.wskj.archive.service.UserService;

/**
 * 重置其他用户密码
 * */
@WebServlet("/ResetOtherPasswordServlet")
public class ResetOtherPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String id = request.getParameter("id");
		request.setAttribute("userId", id);
		request.getRequestDispatcher("/resetPassword.jsp").forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		request.setAttribute("userId", id);
		String oldpw = request.getParameter("oldpw");
		String newpw = request.getParameter("newpw");
		UserService us = new UserService();
		User user = us.get(Integer.parseInt(id));
		if (!user.getPassword().equals(oldpw)) {
			request.setAttribute("WrongOriginPW", "旧密码有误，请重新输入");
			request.getRequestDispatcher("/resetPassword.jsp").forward(request, response);
		} else {
			user.setId(Integer.parseInt(id));
			user.setPassword(newpw);
			us.resetPassword(user);
			response.sendRedirect("/SearchUserServlet");
		}
		
	}

}
