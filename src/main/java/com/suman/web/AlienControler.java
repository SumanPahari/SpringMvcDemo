package com.suman.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienControler {
	
	@Autowired
	AlienDao dao;
	
	@RequestMapping("addAlien")
	public ModelAndView addAllien(@ModelAttribute Alien aline) 
	{
		ModelAndView mv=new ModelAndView("showAlien");
		dao.addAlien(aline);
		return mv;
	}

}
