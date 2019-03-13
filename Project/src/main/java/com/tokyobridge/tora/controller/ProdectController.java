package com.tokyobridge.tora.controller;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tokyobridge.tora.service.LoginService;

/**
 * 상품등록 컨트롤러
 * 
 * @author 장설기
 * @since 2019/03/12
 * @version 1.0.0 
 */
@Controller
public class ProdectController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	private LoginService service;
	
	/**
	 * 상품등록 화면으로 이동
	 */
	@RequestMapping("goProduct")
	public String goProduct() {
		System.out.println("check ok!");
		return "product/product";
	}
	

}
