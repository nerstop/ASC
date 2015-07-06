package com.asc.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@RequestMapping("")
	public ModelAndView main(){
		
		return new ModelAndView("");
	}
	
}
