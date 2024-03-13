package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/second")	//	서블릿 실행을 위한 URI를 "/second"로 설정
public class SecondServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SecondServlet!!");
		PrintWriter out = resp.getWriter();	//	서비스를 요청한 클라이언트와 웹서버 간에 연결된 출력스트림 얻기
		out.print("<html><head><title>Test</title></head>"); //	클라이언트에 데이터를 출력
		out.print("<body><h1>have a nice day!!</h1></body>");
		out.print("</html>");
		out.close();
	}
	/*
	클라이언트가 /second로 요청하면 SecondServlet의 init() 메소드가 실행되어야 하는데, 
	재정의하지 않아서 GenericServlet 클래스의 init() 메소드가 실행된다. 또한, init() 실행 후 
	service() 메소드가 실행되어야 하는데, 역시 재정의하지 않아서 HttpServlet 클래스의 
	service(ServletRequest, ServletResponse) 메소드가 실행되고 이 메소드는 
	service(HttpServletRequest, HttpServletResponse) 메소드를 호출한다.
	이 메소드는 doGet() 메소드를 호출한다.(Get 방식의 요청을 보냄)
	*/ 
}