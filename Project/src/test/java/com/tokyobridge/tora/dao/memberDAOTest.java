package com.tokyobridge.tora.dao;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tokyobridge.tora.entity.ProductEntity;
import com.tokyobridge.tora.vo.MemberVO;
import com.tokyobridge.tora.vo.ProductVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class memberDAOTest {
	
	@Inject
	private MemberDAO dao;

	//private static Logger logger = (Logger) LoggerFactory.getLogger(productDAOTest.class);
	
	@Test
	public void selectMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUser_id("february");
		vo.setUser_pw("wjdgjs");
		MemberVO result =  dao.selectMember(vo);
		System.out.println("결과"+result);
	}
	
}
