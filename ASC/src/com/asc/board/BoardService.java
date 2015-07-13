package com.asc.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asc.model.Board_clubDTO;


@Service
public class BoardService {
	
	@Resource
	private BoardDAO boardDAO;
	
	
	public void board_club_insert(Board_clubDTO board_clubDTO){
		System.out.println("Service : " + board_clubDTO);
		
		boardDAO.board_club_insert(board_clubDTO);
		
		
		
	}


	public List<Board_clubDTO> select_Board_club() {
		// TODO Auto-generated method stub
		List<Board_clubDTO> list = (List<Board_clubDTO>) boardDAO.select_Board_club();
		return list;
	}

}
