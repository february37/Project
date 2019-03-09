package com.tokyobridge.tora.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tokyobridge.tora.entity.ProductEntity;
import com.tokyobridge.tora.vo.ProductVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class productDAOTest {
	
	@Inject
	private ProductDAOIF dao;

	//private static Logger logger = (Logger) LoggerFactory.getLogger(productDAOTest.class);
	
	@Test
	public void testSelecttProductTargetIndex() throws Exception {
		ProductVO vo = new ProductVO();
		vo.setProductIndex("0");
		vo.setProductName("TEST");
		ProductEntity entity = entity = dao.selectProductTargetIndex(vo);
		System.out.println("결과"+entity);
	}
	
	@Test
	public void testSelecttProductTargetName() throws Exception {
		ProductVO vo = new ProductVO();
		vo.setProductIndex("0");
		vo.setProductName("TEST");
		List<ProductEntity> list = dao.selectProductTargetName(vo);
		System.out.println();
	}

}
