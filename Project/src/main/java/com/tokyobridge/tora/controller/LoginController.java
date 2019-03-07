package com.tokyobridge.tora.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tokyobridge.tora.service.LoginService;
import com.tokyobridge.tora.vo.MemberVO;

/**
 * 로그인 컨트롤러
 * 
 * @author 김정헌
 * @since 2018/12/02
 * @version 1.0.0 
 */
@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	private LoginService service;
	
	/**
	 * 로그인 시도
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("userId") String userId, @RequestParam("userPw") String userPw,HttpServletResponse response,HttpSession session) throws Exception{
		
		logger.info("login");

		MemberVO vo = new MemberVO();
		vo.setUser_id(userId);
		vo.setUser_pw(userPw);
		
		vo = service.selectMember(vo);
		session.setAttribute("MemberVO", vo != null ? vo.toString() : "値なし");
		
		return "/main/main";
	}

}
