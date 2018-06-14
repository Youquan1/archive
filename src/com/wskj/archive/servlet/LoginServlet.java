package com.wskj.archive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.wskj.archive.service.UserService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username").trim();
		String password = request.getParameter("password");
		
		if (username == null || password == null) {
			response.sendRedirect("/login.jsp");
			return;
		}
		
		UserService us = new UserService();
		boolean correct = us.matchUser(username,password);
		HttpSession session = request.getSession();
		
		if (correct) {			
			session.setAttribute("loginInfo", username);
			response.sendRedirect("index.jsp");
		} else {
			session.setAttribute("wrongInfo", "用户名或密码错误，请重新输入");
			request.getRequestDispatcher("/login.jsp").forward(request, response);			
		}	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
