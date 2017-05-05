package com.yash.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping("/{country}/{userName}")
	public ModelAndView hello(@PathVariable Map<String, String> pathVars){
		String country=pathVars.get("country");
		String userName=pathVars.get("userName");
		String message="Hello {"+userName+"} welcome in  - ["+country+"]";
		Map<String, String> map=new HashMap<String, String>();
		map.put("msg", message);
		ModelAndView mav=new ModelAndView("welcome",map);
		return mav;
	}
	
}
