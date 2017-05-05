package com.yash.basicapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	@RequestMapping("/hello.ds")
	public ModelAndView hello(){
		String message="Welcome in Spring MVC- using @Controller Approach";
		Map<String, String> map=new HashMap<>();
		map.put("msg", message);
		ModelAndView mav=new ModelAndView("welcome", map);
		return mav;
	}
	
}
