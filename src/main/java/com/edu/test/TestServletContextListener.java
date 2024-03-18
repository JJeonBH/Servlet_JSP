package com.edu.test;

import jakarta.servlet.*;

public class TestServletContextListener implements ServletContextListener {
	public TestServletContextListener() {
		System.out.println("TestServletContextListener 객체 생성");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext 객체 초기화");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext 객체 해제");
	}
}