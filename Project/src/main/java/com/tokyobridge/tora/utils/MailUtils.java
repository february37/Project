package com.tokyobridge.tora.utils;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtils {
	public void sendEmail() {

	
		String host = "smtp.googlemail.com";
		String from = MailValues.ADRESS;
		String to = MailValues.TARGET_ADDRESS;
		String subject = "Welcom to tora";
		String contents = "환영합니다 다음 링크에 접속하여 이메일 인증을 진행하세요.";
		
		Properties props = System.getProperties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.googlemail.com");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", MailValues.PASSWORD);
		props.put("mail.smtp.auth","true");
	    props.put("mail.smtp.socketFactory.port", "465");
	    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	    props.put("mail.smtp.socketFactory.fallback", "false");
	
		Session session = Session.getDefaultInstance(props);
		MimeMessage msg = new MimeMessage(session);
		try {

			msg.setFrom(new InternetAddress(MailValues.ADRESS));
			//msg.setRecipient(Message.RecipientType.TO, new InternetAddress(MailValues.TARGET_ADDRESS));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(MailValues.PASSWORD));
			msg.setSubject(subject);
			msg.setText(contents);
			
			Transport transport = session.getTransport("smtp");
			transport.connect(host, MailValues.ADRESS, MailValues.PASSWORD);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
			//Address fromAddr = new InternetAddress(from);
			//msg.setFrom(fromAddr);
			//Address toAddr = new InternetAddress(to); 
			//msg.addRecipient(Message.RecipientType.TO, toAddr);
			//msg.setContent(contents, "text/html;charset=UTF8");
			// Send message
			//Transport.send(msg);

		} catch (Exception e) {
			System.err.println(e.toString());
		}
		
		
	/*	Properties props = new Properties();

		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "stmp.googlemail.com");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(MailValues.ADRESS, MailValues.PASSWORD);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(MailValues.ADRESS));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(MailValues.TARGET_ADDRESS));
			message.setSubject("안녕? 테스트좀 해보자");
			message.setText("Hello? 이건 본문 테스트용");
			// Send message
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}*/

	}
}
