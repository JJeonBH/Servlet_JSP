package com.edu.test;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(filterName = "timer", urlPatterns = "/third")
public class FlowFilterThree implements Filter {
	public void init(FilterConfig config) {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws java.io.IOException, ServletException {
		long startTime = System.currentTimeMillis();
		chain.doFilter(req, resp);
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;
		System.out.println("수행 시간 : " + executeTime + " ms");
	}

	public void destroy() {
	}
}