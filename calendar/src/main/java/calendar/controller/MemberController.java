package calendar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import calendar.service.MemberService;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MemberController {
	/*
	 * private final MemberService memberService;
	 * 
	 * public MemberController(MemberService memberService) { this.memberService =
	 * memberService; }
	 */
	
	@GetMapping("/login")	
	public String login(Model model) {
		model.addAttribute("title", "로그인");
		log.info("2024-10-29 로그인");
		
		return "member/login";
	}
	
	@GetMapping("/profile")	
	public String profile(Model model) {
		model.addAttribute("title", "프로필");
		log.info("2024-10-29 프로필");
		
		return "member/myProfile";
	}
	
	@GetMapping("/account")	
	public String account(Model model) {
		model.addAttribute("title", "계정 설정");
		log.info("2024-10-29 계정설정");
		
		return "member/myAccount";
	}
}
