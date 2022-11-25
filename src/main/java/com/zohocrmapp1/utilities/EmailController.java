package com.zohocrmapp1.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	@RequestMapping("/composeMail")
	public String sendMail(@RequestParam("email")String to,ModelMap model) {
		model.addAttribute("to",to);
		return "compose_email";
	}
	@RequestMapping("/sendMail")
	public String send(@RequestParam("to")String to,
			@RequestParam("sub")String sub,
			@RequestParam("emailBody")String emailBody) {
		emailService.sendMail(to, sub, emailBody);
		return "compose_email";
	}

}
