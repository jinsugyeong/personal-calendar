package calendar.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import calendar.dto.Member;
import calendar.service.MemberService;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MainController {
	private final MemberService memberService;
	
	public MainController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/")	
	public String main(Model model) {
		List<Member> memberList = memberService.findAll();
		
		model.addAttribute("title", "캘린더");
		//model.addAttribute("list", memberList);
		
		log.info("2024-10-22 로그찍기~~~~~~~~~~~~");
		
		return "main";
	}
	
}
