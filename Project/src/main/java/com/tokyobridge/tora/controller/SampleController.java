package com.tokyobridge.tora.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tokyobridge.tora.entity.MemberEntity;
import com.tokyobridge.tora.utils.MailUtils;

import ch.qos.logback.classic.Logger;
/**
 * 컨트롤단의 샘플 코드
 * @Controller 스프링 MVC의 컨트롤러 객체임을 명시하는 어노테이션이다 클래스 단위로 정의되어진다.
 * @RequestMapping 특정 URL에 매칭되는 클래스나 메소드임을 명시하는 어노테이션이다. 클래스, 메소드에 정의되어진다.
 * @ModelAttribute 자동으로 해당 객체를 뷰까지 전달하도록 만드는 어노테이션이다. 메소드, 파라메터에 정의되어진다.
 * 
 * @author Jungheon KIM
 */
@Controller
public class SampleController {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(SampleController.class);
	
	//void가 리턴 타입인 경우
	@RequestMapping("helloWorld")
	public void helloWorld() {
		logger.info("URL주소:helloWorld");
	}
	//void가 리턴 타입인 경우
	@RequestMapping("mevius")
	public void mevius() {
		logger.info("URL주소:mevius");
	}
	//http://localhost:9000/raison?msg=담배
	@RequestMapping("raison")
	public String rasion(@ModelAttribute("msg") String msg, Model model) {
		msg += "을 입력하였다";
		MemberEntity entity = new MemberEntity();
		entity.setUser_id("raison");
		entity.setIndex_no("1004");
		//Map map = new HashMap<String, Entity>();
		//map.put("Member", entity);
		logger.info("URL주소:raison");
		model.addAttribute("Member",entity);
		return "sample/raison";
	}
	//controller단에서 화면단으로 이동하지 않고 다시한번 컨트롤단을 거친는 경우
	@RequestMapping("yellow")
	public String yellow(RedirectAttributes rttr) {
		logger.info("yellow");
		rttr.addFlashAttribute("msg", "This is Sparta!!!!");
		return "redirect:/black";
	}
	//yellow 다음 대상 컨트롤러
	@RequestMapping("black")
	public String black(@ModelAttribute String msg) {
		logger.info("black:"+msg);
		return "sample/black";
	}
	
	//JSON방식으로 처리
	//http://localhost:9000/helloJSON
	@RequestMapping("/helloJSON")
	public @ResponseBody MemberEntity helloJSON() {
		MemberEntity entity = new MemberEntity();
		entity.setUser_id("JSON");
		MailUtils mail = new MailUtils();
		mail.sendEmail();
		return entity;
	}
	
	
	
	
	
	
}
