package com.wskj.archive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wskj.archive.pojo.Project;
import com.wskj.archive.service.ProjectService;

@WebServlet("/AddProjectServlet")
public class AddProjectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String projectName = request.getParameter("projectName").trim();
		String proArea = request.getParameter("proArea").trim();
		String proDocNo = request.getParameter("proDocNo").trim();
		String proScope = request.getParameter("proScope").trim();
		String proPopulation = request.getParameter("proPopulation").trim();
		String proHead = request.getParameter("proHead").trim();
		String proYear = request.getParameter("proYear").trim();
		String proArcYear = request.getParameter("proArcYear").trim();
		String proAwardYear = request.getParameter("proAwardYear").trim();
		String proAwardLeavel = request.getParameter("proAwardLeavel").trim();
		String proAwardOrg = request.getParameter("proAwardOrg").trim();
		
		String appraiseArea = request.getParameter("appraiseArea").trim();
		String appraiseHead = request.getParameter("appraiseHead").trim();
		String appraiseDocNum = request.getParameter("appraiseDocNum").trim();
		String appraisePreside = request.getParameter("appraisePreside").trim();
		String appraiseAwardYear = request.getParameter("appraiseAwardYear").trim();
		String appraiseAwardLeavel = request.getParameter("appraiseAwardLeavel").trim();
		String appraiseAwardOrg = request.getParameter("appraiseAwardOrg").trim();
		
		String subjectName = request.getParameter("subjectName").trim();
		String subjectHost = request.getParameter("subjectHost").trim();
		
		String categoryId = request.getParameter("categoryId");
		
		Project pro = new Project();
		pro.setProjectName(projectName);
		pro.setProArea(proArea);
		pro.setProDocNo(proDocNo);
		pro.setProScope(proScope);
		pro.setProPopulation(proPopulation);
		pro.setProHead(proHead);
		pro.setProYear(Integer.parseInt(proYear));
		pro.setProArcYear(Integer.parseInt(proArcYear));
		pro.setProAwardYear(Integer.parseInt(proAwardYear));
		pro.setProAwardLeavel(proAwardLeavel);
		pro.setProAwardOrg(proAwardOrg);
		pro.setAppraiseArea(appraiseArea);
		pro.setAppraiseHead(appraiseHead);
		pro.setAppraiseDocNum(appraiseDocNum);
		pro.setAppraisePreside(appraisePreside);
		pro.setAppraiseAwardYear(Integer.parseInt(appraiseAwardYear));
		pro.setAppraiseAwardLeavel(appraiseAwardLeavel);
		pro.setAppraiseAwardOrg(appraiseAwardOrg);
		pro.setSubjectName(subjectName);
		pro.setSubjectHost(subjectHost);
		pro.setCategoryId(Integer.parseInt(categoryId));
		
		ProjectService ps = new ProjectService();
		ps.add(pro);
		
		response.sendRedirect("/SearchProjectServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
