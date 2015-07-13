package com.asc.common;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asc.model.MemberDTO;

@Service
public class CommonService {
	
	@Resource
	private CommonDAO commonDAO;
	

	public MemberDTO select_userInfo(MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		return (MemberDTO)commonDAO.select_userInfo(memberDTO);
	}

	
	
}
