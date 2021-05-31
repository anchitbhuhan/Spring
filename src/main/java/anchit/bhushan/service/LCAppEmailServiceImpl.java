package anchit.bhushan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements LCAppEmailService {

	@Autowired
	private JavaMailSender JavaMailSenderImpl;

	@Override
	public void sendEmail(String username, String userEmail, String result) {

		SimpleMailMessage newEmail = new SimpleMailMessage();
		newEmail.setTo(userEmail);
		newEmail.setSubject("Love Calcuator Application Result");
		newEmail.setText("Hi, " + username + " The result predicted by the LCApp is " + result);

		JavaMailSenderImpl.send(newEmail);

	}

}
