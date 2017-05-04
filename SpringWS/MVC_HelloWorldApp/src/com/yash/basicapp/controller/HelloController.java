package com.yash.basicapp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
	
	

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String message=request.getParameter("message");
		Map<String, String> map=new HashMap<>();
		map.put("msg", "Your Message is :"+message);
		return new ModelAndView("welcome", map);
	}
}
