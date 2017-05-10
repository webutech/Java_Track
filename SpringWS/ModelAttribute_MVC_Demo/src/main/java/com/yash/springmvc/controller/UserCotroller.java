package com.yash.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.springmvc.pojo.User;

@Controller
@RequestMapping("/users")
public class UserCotroller {
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		
		webDataBinder.setDisallowedFields(new String[]{"contact"});
		
//		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy***mm***dd");
//		webDataBinder.registerCustomEditor(Date.class, "joiningDate", new CustomDateEditor(dateFormat, true));
		
	}
	
	
	
	@RequestMapping(value="/userregistration", method=RequestMethod.GET)
	public String showUserRegistrationForm(){
		return "userregistration";
	}
	
	@RequestMapping(value="/processUserRegistration", method=RequestMethod.POST)
	public String processUserRegistration(@ModelAttribute("user") User user, BindingResult result){
		if(result.hasErrors()){
			return "userregistration";
		}
		return "success";
	}
	
	@ModelAttribute
	public void commonHeader(Model model){
		model.addAttribute("headerMessage", "YASH Technology Pvt. Ltd.");
		model.addAttribute("userRegistrationHeader", "User Registration");
	}
	
	

}
