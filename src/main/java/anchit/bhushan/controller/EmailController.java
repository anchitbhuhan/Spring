package anchit.bhushan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import anchit.bhushan.api.UserInfoDTO;
import anchit.bhushan.api.emailDTO;
import anchit.bhushan.service.LCAppEmailServiceImpl;

@Controller
public class EmailController {

	
	@Autowired
	private LCAppEmailServiceImpl lCAppEmailService;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
	
		model.addAttribute("emailDTO",new emailDTO() );
//		model.addAttribute("username", username);
		return "send-email-page";
	}

	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo") UserInfoDTO userInfoDTO,
			@SessionAttribute("loveresult") String loveresult,
							@ModelAttribute("emailDTO") emailDTO emaildto,
							Model model) {
		
//		model.addAttribute("username", username);
		
//		String username = session.getAttribute("username").toString();
//		String newusername = "Mr. "+username;
//		model.addAttribute("username", newusername);
		
		String username  = userInfoDTO.getName().toString();
		
		try {
			lCAppEmailService.sendEmail(username, emaildto.getUserEmail(), loveresult);	
		}
		catch(Exception e)
		{
			System.out.println("Email Sending failed");
		}
		
		return "process-email-page";
	}
}
