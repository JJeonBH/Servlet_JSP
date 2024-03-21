package com.edu.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/errorHandle")
public class ErrorHandleServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		Integer code = (Integer) req.getAttribute("jakarta.servlet.error.status_code");
		String message = (String) req.getAttribute("jakarta.servlet.error.message");
		Object type = req.getAttribute("jakarta.servlet.error.exception_type");
		Throwable exception = (Throwable) req.getAttribute("jakarta.servlet.error.exception");
		String uri = (String) req.getAttribute("jakarta.servlet.error.request_uri");

		out.print("<h2>Error Code    : " + code + "</h2>");
		out.print("<h2>Error Message : " + message + "</h2>");
		out.print("<h2>Error Type    : " + type + "</h2>");
		out.print("<h2>Error Object  : " + exception + "</h2>");
		out.print("<h2>Error URI     : " + uri + "</h2>");

		out.close();
	}
}