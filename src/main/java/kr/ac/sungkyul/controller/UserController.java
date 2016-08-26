package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.sungkyul.vo.UserVo;

// 메서드 + 타입 매핑
@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/joinform")
	public String joinForm(){
		return "/WEB-INF/views/user/joinform.jsp";
	}
	
	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@ModelAttribute UserVo userVo){
		System.out.println(userVo);
		return "UserController:join()";
	}
	
	@ResponseBody
	@RequestMapping("/loginform")
	public String loginForm(){
		return "UserController:loginForm()";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public String login(){
		return "UserController:login()";
	}
}
