package com.edu.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/errorTest1")
public class ErrorTest1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		String getquery = req.getQueryString();
		out.print("Query : " + getquery + "<br>");
		out.print("Query 길이 : " + getquery.length());
		out.print("Done!");

		out.close();
	}
}