package com.asc.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.asc.model.Board_clubDTO;


@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource
	private BoardService boardService;
	
	
	@RequestMapping("/board.do")
	public ModelAndView main(){
		ModelAndView model = new ModelAndView("board/board");
		List<Board_clubDTO> board_clubDTO = boardService.select_Board_club();
		System.out.println(board_clubDTO);
		model.addObject("board_clubDTO",board_clubDTO);
		
		return model;
	}
	
	@RequestMapping(value="insert.do", method = RequestMethod.GET )
	public ModelAndView insert_get(){
		
		ModelAndView model = new ModelAndView("board/board_insert");
		
		return model;
		
	}
	
	@RequestMapping(value="insert.do", method = RequestMethod.POST )
	public ModelAndView insert_post(@ModelAttribute Board_clubDTO board_clubDTO){
		
		
		System.out.println("Controller : " +board_clubDTO);
		boardService.board_club_insert(board_clubDTO);
		
		return new ModelAndView(new RedirectView("board.do"));
		
	}
	
}
