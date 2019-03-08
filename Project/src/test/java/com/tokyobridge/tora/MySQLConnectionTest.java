package com.tokyobridge.tora;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:log4jdbc:mysql://127.0.0.1:3306/project00?useSSL=false&serverTimezone=UTC";
	private static final String USER = "master";
	private static final String PW = "tiger1201";

	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con= DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


