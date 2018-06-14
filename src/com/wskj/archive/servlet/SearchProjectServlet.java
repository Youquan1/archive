package com.wskj.archive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wskj.archive.pojo.Project;
import com.wskj.archive.service.ProjectService;
import com.wskj.archive.util.PageInfo;

@WebServlet("/SearchProjectServlet")
public class SearchProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String projectName = request.getParameter("projectName");
		String proHead = request.getParameter("proHead");
		String categoryId = request.getParameter("categoryId");
		if (categoryId == null || categoryId.equals("")) {
			categoryId = "0";
		}

		int page = 1;
		int pageSize = 3;
		String spage = request.getParameter("page"); 	// 页码
		if(spage != null) {
			page = Integer.parseInt(spage);
		}
		ProjectService ps = new ProjectService();
		PageInfo<Project> pi = ps.findPageByParams(projectName, proHead, categoryId, page, pageSize);
		request.setAttribute("pi", pi);
		
		if (pi.getTotalSize() == 0) {
			request.setAttribute("NoResult", "在项目列表中没有检索到您想查询的信息，您可以尝试输入其他关键字。");
		}
		
		request.getRequestDispatcher("/projectList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
