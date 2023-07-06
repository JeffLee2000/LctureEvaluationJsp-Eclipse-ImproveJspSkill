package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		// !!! 주의 !!! => 절대 패스워드 그대로 입력해서 git push 하지 말기 (Gmail 2step security to setting app_password) Gmail을 사용하므로 항상 2단계 인증 문구로 바꾸기 실습할 때도!!!
		return new PasswordAuthentication("lth00ce@gmail.com", "Gmail 2step security to setting app_password");
	}
	
}
