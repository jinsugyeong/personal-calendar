package calendar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class CalendarController {
	
	@GetMapping("/calendar")
	public String test(Model model) {
		
		model.addAttribute("title", "캘린더");
		log.info("2024-10-29 캘린더");
		return "calendar/calendar";
	}
}
