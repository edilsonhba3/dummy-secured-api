package com.example.dummysecuredapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.dummysecuredapi.interceptor.DummyInterceptor;

@Component
public class DummyConfig implements WebMvcConfigurer 
{
	@Autowired
	private DummyInterceptor dummyInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) 
	{
		registry.addInterceptor(dummyInterceptor);
	}
}
