package com.tokyobridge.tora.utils;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("february369@gmail.com", "Wjdgjs1.34");
	}
}
