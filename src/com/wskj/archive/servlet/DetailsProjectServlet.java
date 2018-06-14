package com.wskj.archive.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wskj.archive.pojo.Project;
import com.wskj.archive.service.ProjectService;

@WebServlet("/DetailsProjectServlet")
public class DetailsProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DetailsProjectServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		ProjectService ps = new ProjectService();
		Project pro = ps.get(Integer.parseInt(id));
		request.setAttribute("pro", pro);
		
		request.getRequestDispatcher("/details.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
