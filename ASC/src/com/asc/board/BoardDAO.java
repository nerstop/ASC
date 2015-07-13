package com.asc.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.asc.model.Board_clubDTO;



@Repository
public class BoardDAO {

	@Resource
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	
	public void board_club_insert(Board_clubDTO board_clubDTO) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("BoardSql.board_club_insert", board_clubDTO);	
	}

	@SuppressWarnings("unchecked")
	public List<Board_clubDTO> select_Board_club() {
		// TODO Auto-generated method stub
		return (List<Board_clubDTO>)sqlMapClientTemplate.queryForList("BoardSql.select_Board_club");
	}
}
