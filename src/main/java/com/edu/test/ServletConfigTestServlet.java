package com.edu.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ServletConfigTestServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String env = this.getInitParameter("charset");
		req.setCharacterEncoding(env);
		out.print("<h3>이름 : " + req.getParameter("name") + "</h3>");
		out.close();
	}
}