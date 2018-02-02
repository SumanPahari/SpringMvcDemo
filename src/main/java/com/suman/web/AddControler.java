package com.suman.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddControler {
	
	@RequestMapping("add")
	public void add() {
		System.out.print("Add");
	}

}
