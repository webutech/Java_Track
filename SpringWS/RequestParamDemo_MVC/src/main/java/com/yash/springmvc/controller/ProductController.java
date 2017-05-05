package com.yash.springmvc.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/yash/products")
public class ProductController {
	
	@RequestMapping(value="/productOrder", method=RequestMethod.GET)
	public ModelAndView showProductOrderForm(){
		
		return new ModelAndView("productOrder");
	}
	
	@RequestMapping(value="/processProduct", method=RequestMethod.POST)
	public ModelAndView processProduct(@RequestParam("product") String product,@RequestParam("quantity") String quantity){
		Map<String, String> map=new HashMap<String, String>();
		int qty=Integer.parseInt(quantity);
		int penPrice=10;
		int pencilePrice=2;
		int markerPrice=5;
		int laptopPrice=45000;
		int totalPrice=0;
		
		if(product.equals("pen")){
			totalPrice=penPrice*qty;
		}
		
		if(product.equals("pencil")){
			totalPrice=pencilePrice*qty;
		}
		if(product.equals("marker")){
			totalPrice=markerPrice*qty;
		}
		if(product.equals("laptop")){
			totalPrice=laptopPrice*qty;
		}
		map.put("product", product);
		map.put("quantity", quantity);
		map.put("total",""+totalPrice);
		return new ModelAndView("welcome",map);
	}
	
	
	
}
