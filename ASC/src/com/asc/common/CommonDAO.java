package com.asc.common;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.asc.model.MemberDTO;

@Repository
public class CommonDAO {
	
	@Resource
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public MemberDTO select_userInfo(MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		return (MemberDTO)sqlMapClientTemplate.queryForObject("CommonSql.select_userInfo",memberDTO);
	
	}

}
