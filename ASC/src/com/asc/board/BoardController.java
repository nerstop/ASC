package com.asc.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {

	@RequestMapping("/board.do")
	public ModelAndView main(){
		
		return new ModelAndView("board/board");
	}
	
	@RequestMapping("/insert.do")
	public ModelAndView insert(){
		
		ModelAndView model = new ModelAndView("board/board_insert");
		
		return model;
		
	}
}
