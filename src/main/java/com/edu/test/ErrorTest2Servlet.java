package com.edu.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/errorTest2")
public class ErrorTest2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		try {
			String getquery = req.getQueryString();
			out.print("Query : " + getquery + "<br>");
			out.print("Query 길이 : " + getquery.length());
		} catch (Exception e) {
			out.print("요청을 처리하는 동안 오류가 발생하였습니다 : " + e);
		}
		out.print("<br>Done!");
		out.close();
	}
}