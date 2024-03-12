package com.edu.test;

import jakarta.servlet.*;

public class FlowFilterTwo implements Filter {
	public void init(FilterConfig config) {
		System.out.println("init() 호출 .......... two");
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws java.io.IOException, ServletException {
		System.out.println("doFilter() 호출 전 .......... two");
		chain.doFilter(req, resp);
		System.out.println("doFilter() 호출 후 .......... two");
	}

	public void destroy() {
		System.out.println("destroy() 호출 .......... two");
	}
}