package com.edu.test;

import jakarta.servlet.http.*;

public class TestSessionAttributeListener implements HttpSessionAttributeListener {
	public TestSessionAttributeListener() {
		System.out.println("TestSessionAttributeListener 객체 생성");
	}

	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("세션 객체에 속성 추가");
	}

	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("세션 객체에 추가된 속성 삭제");
	}

	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("세션 객체에 추가된 속성 대체");
	}
}