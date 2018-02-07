package com.kiran;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demomvc {
	
@RequestMapping("/welcome")
	public ModelAndView myMethod() {
	ModelAndView model=new ModelAndView("hello");
		return model;

	}
}
