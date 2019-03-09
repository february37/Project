package com.tokyobridge.tora.enviroment;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Runwith ContextConfiguration　어노테이션은 현재 테스트코드를 실행할 때 스프링이 로딩되도록 하는 부분
//ContextConfiguation의 속성 경로에  xml파일을 이용해 스프링이 로딩된다.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class DataSourceTest {
	
	//인스턴스 변수의 Inject어노테이션 처리된 DataSource는 스프링이 생성해서 주입해 주므로 개발자가 객체 생성 혹은 다른 작업을 하지 않아도 된다.
	@Inject
	private DataSource ds;
	
	@Test
	public void testConnection() throws Exception{
		try(Connection con = ds.getConnection()){
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
