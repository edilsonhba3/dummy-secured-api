package com.example.dummysecuredapi.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class DummyInterceptor implements HandlerInterceptor 
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception 
	{

		String dummyHeader = request.getHeader("dummy-header");
		
		if (dummyHeader == null) 
		{

			response.sendError(403, "not authorized");
			return false;
		}
		System.out.println("header == "+ dummyHeader);
		System.out.println("interceptor running here");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception 
	{}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception 
	{}
}
