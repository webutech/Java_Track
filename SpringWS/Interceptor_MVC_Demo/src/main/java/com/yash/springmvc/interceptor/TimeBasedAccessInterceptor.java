package com.yash.springmvc.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		Calendar calendar=Calendar.getInstance();
		int day_of_week=calendar.get(calendar.DAY_OF_WEEK);
		System.out.println(day_of_week);
		if(day_of_week==4){
			response.getWriter().write("<center><h1>The website is closed today for maintainance</h1><center>");
			return false;
		}
		return true;
	}

}
