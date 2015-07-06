package com.asc.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
	
	/**
	 * CommonController
	 * 로그인, 회원가입, 아이디 비밀번호찾기
	 * 메인화면 구성
	 */

	
	@RequestMapping("/main.do")
	public ModelAndView main() {
		
		return new ModelAndView("main/test");
	}
	
}
