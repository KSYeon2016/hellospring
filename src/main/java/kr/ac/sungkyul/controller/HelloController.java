package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "Hello Spring";
	}
	
	@RequestMapping("/hello2")
	public String hello2(
			@RequestParam("n") String name,
			@RequestParam("a") String age,
			Model model){
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "/WEB-INF/views/hello2.jsp";
	}
	
	@RequestMapping("/hello3")
	public String hello3(){
		return "redirect:/hello";
	}
}
