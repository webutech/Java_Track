package com.yash.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class HelloController {
	
	@RequestMapping("/hello.ds")
	public ModelAndView hello(){
		String message="Hello using Maven";
		Map<String, String> map=new HashMap<String, String>();
		map.put("msg", message);
		ModelAndView mav=new ModelAndView("welcome",map);
		return mav;
	}
	
	@RequestMapping("/hi.ds")
	public ModelAndView hi(){
		String message="Hi:  using Maven App";
		Map<String, String> map=new HashMap<String, String>();
		map.put("msg", message);
		ModelAndView mav=new ModelAndView("welcome",map);
		return mav;
	}

}
