package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		// !!! ���� !!! => ���� �н����� �״�� �Է��ؼ� git push ���� ���� (Gmail 2step security to setting app_password) Gmail�� ����ϹǷ� �׻� 2�ܰ� ���� ������ �ٲٱ� �ǽ��� ����!!!
		return new PasswordAuthentication("lth00ce@gmail.com", "Gmail 2step security to setting app_password");
	}
	
}
