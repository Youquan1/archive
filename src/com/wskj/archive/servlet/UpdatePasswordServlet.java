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
 * 修改当前登录用户密码
 * */
@WebServlet("/UpdatePasswordServlet")
public class UpdatePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String oldpw = request.getParameter("oldpw");
		String newpw = request.getParameter("newpw");
		
		String username = (String) request.getSession().getAttribute("loginInfo");
		UserService us = new UserService();
		String pwd = us.getPW(username);
		if (!pwd.equals(oldpw)) {
			request.setAttribute("wrongOldPW", "旧密码有误，请重新输入");
			request.getRequestDispatcher("/updatepassword.jsp").forward(request, response);
			return;
		}

		User user = new User();
		user.setUsername(username);
		user.setPassword(newpw);
		us.updatePassword(user);
		response.sendRedirect("/logout");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
