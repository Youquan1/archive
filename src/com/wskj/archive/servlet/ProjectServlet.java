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
@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		@SuppressWarnings("unused")
		String id = request.getParameter("id");
		@SuppressWarnings("unused")
		String projectName = request.getParameter("projectName");
		@SuppressWarnings("unused")
		String proHead = request.getParameter("proHead");
		
//		ProjectService ps = new ProjectService();
//		List<Project> list = ps.selectAll();

//		request.setAttribute("list", list);
		request.getRequestDispatcher("/projectList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
