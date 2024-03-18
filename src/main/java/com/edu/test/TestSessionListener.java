package com.edu.test;

import jakarta.servlet.http.*;

public class TestSessionListener implements HttpSessionListener {
	public TestSessionListener() {
		System.out.println("TestSessionListener 객체 생성");
	}

	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("세션 객체 생성");
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("세션 객체 해제");
	}
}