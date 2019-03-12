package com.tokyobridge.tora.utils;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtils {
	public void sendEmail() {
		boolean result = false;
		
		String host = "http://localhost:9000";
		String from = "february369@gmail.com";
		String to = "jsg5383@gmail.com";
		String subject = "Welcom to tora";
		String contents = "환영합니다 다음 링크에 접속하여 이메일 인증을 진행하세요.";
		
		Properties p = new Properties();
		p.put("mail.stmp.user", from);
		p.put("mail.stmp.host", "stmp.googlemail.com");
		p.put("mail.stmp.starttls.enable", "true");
		p.put("mail.smtp.auth","true");
		p.put("mail.smtp.debug", "ture");
		p.put("mail.smtp.socketFactory.port", "465");
		p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.socketFactory.fallback", "false");
		
		try {
			Authenticator auth = new Gmail();
			Session ses = Session.getInstance(p,auth);
			ses.setDebug(true);
			MimeMessage msg = new MimeMessage(ses);
			msg.setSubject(subject);
			Address fromAddr = new InternetAddress(from);
			msg.setFrom(fromAddr);
			Address toAddr = new InternetAddress(to); 
			msg.addRecipient(Message.RecipientType.TO, toAddr);
			msg.setContent(contents, "text/html;charset=UTF8");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
