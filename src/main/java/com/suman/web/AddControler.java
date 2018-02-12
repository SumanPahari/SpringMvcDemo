package com.suman.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddControler {
	
//	@RequestMapping("add")
//	public String add(HttpServletRequest request) {
//		System.out.println("Hello Suman");
//		int i=Integer.parseInt(request.getParameter("num1"));
//		int j=Integer.parseInt(request.getParameter("num2"));
//		int k=i+j;
//		request.setAttribute("k", k);
//		
//		return "result.jsp";
//	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j,HttpServletRequest request) {
		System.out.println("Hello Suman");
		ModelAndView mv=new ModelAndView();
		
		int k=i+j;
		mv.addObject("k", k);
		mv.setViewName("result");
		
		return mv;
	}

}
