package com.wskj.archive.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class LoginFilter implements Filter {

    public LoginFilter() {

    }

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request; 
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getRequestURI();
		HttpSession session = req.getSession();
		if ("/login.jsp".equals(url) || url.endsWith(".js") || url.endsWith(".png") || url.endsWith(".css")) {
			session.setAttribute("correctpath", true);
			chain.doFilter(request, response);
			return;
		}
		
		if (!url.endsWith("LoginServlet") || session.getAttribute("correctpath") == null ) {
			
			if (session.getAttribute("loginInfo") == null) {
				resp.sendRedirect("/login.jsp");
				return;
			}
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
