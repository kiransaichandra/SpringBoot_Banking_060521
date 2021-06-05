package com.example.demo.controller1;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	
	@RequestMapping("/home1")
	//@ResponseBody
	public String method1(){ 
		
		System.out.println("Controller method1");
		return "home";
	}
	
	@RequestMapping("/home2")
	//@ResponseBody
	public String method2(@RequestParam("name2") String name2, HttpSession session) {
		
		
		session.setAttribute("name2", name2);
		System.out.println("Controller method2");
		return "home";
	}
	
	@RequestMapping("/home3")
	//@ResponseBody
	public ModelAndView method3(@RequestParam("name3") String name3) {
		
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("name3",name3);
		mv.setViewName("home");
		System.out.println("Controller method3");
		return mv;
	}
	

}
