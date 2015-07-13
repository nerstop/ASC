package com.asc.common;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.asc.model.MemberDTO;


@Controller
public class CommonController {
	
	
	
	/**
	 * CommonController
	 * 로그인, 회원가입, 아이디 비밀번호찾기
	 * 메인화면 구성
	 */
	
	@Resource
	private CommonService commonService;
	
	

	
	@RequestMapping(value="login.do", method = RequestMethod.GET )
	public ModelAndView login(){
		ModelAndView model = new ModelAndView("login");
		
		
		return model;
	}
	
	@RequestMapping(value="login.do", method = RequestMethod.POST )
	public ModelAndView login_post(HttpServletRequest request, @ModelAttribute MemberDTO memberDTO){
		
		MemberDTO userInfo = (MemberDTO)commonService.select_userInfo(memberDTO);
		
		System.out.println(userInfo);
		if(userInfo != null){
			request.getSession().setAttribute("userInfo", userInfo);
			return new ModelAndView(new RedirectView("main.do"));
		}
		
		return new ModelAndView(new RedirectView("login.do"));
		
		
	}
	
	
	
	@RequestMapping("/main.do")
	public ModelAndView main(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("main/test");
		
		MemberDTO userInfo = (MemberDTO)request.getSession().getAttribute("userInfo");
		
		model.addObject("userInfo",userInfo);
		
		return model;
	}
	
}
