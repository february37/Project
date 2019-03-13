package com.tokyobridge.tora.utils;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(MailValues.ADRESS, MailValues.PASSWORD);
	}
}
