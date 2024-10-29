package calendar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class ApplicationController {
	
	@GetMapping("/application")	
	public String login(Model model) {
		model.addAttribute("title", "휴가 신청");
		log.info("2024-10-29 휴가신청");
		
		return "apply/applicationList";
	}
}
