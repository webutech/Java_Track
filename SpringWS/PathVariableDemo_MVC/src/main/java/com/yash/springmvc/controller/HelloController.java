package com.yash.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class HelloController {
	
	@RequestMapping("/hello/{userName}")
	public ModelAndView hello(@PathVariable("userName") String userName){
		String message="Hello ("+userName+") from Spring MVC Maven app";
		Map<String, String> map=new HashMap<String, String>();
		map.put("msg", message);
		ModelAndView mav=new ModelAndView("welcome",map);
		return mav;
	}
	
	@RequestMapping("/hi/{userName}")
	public ModelAndView hi(@PathVariable("userName") String userName){
		String message="Hi ("+userName+") from Spring MVC Maven app";
		Map<String, String> map=new HashMap<String, String>();
		map.put("msg", message);
		ModelAndView mav=new ModelAndView("welcome",map);
		return mav;
	}

}
