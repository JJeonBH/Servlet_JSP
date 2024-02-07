package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");	//	클라이언트에게 보내는 데이터의 문서타입과 문자셋을 응답정보 헤더에 설정하는 메소드
		PrintWriter out = resp.getWriter();
		out.print("<h1>좋은 하루!</h1>");
		out.close();
	}
}
