package com.edu.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/bookOutput")
public class BookTest2Servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		Book book = (Book) req.getAttribute("book");

		out.print("<h3>책제목 : " + book.getTitle() + "</h3>");
		out.print("<h3>책저자 : " + book.getAuthor() + "</h3>");
		out.print("<h3>출판사 : " + book.getPublisher() + "</h3>`");

		out.close();
	}
}