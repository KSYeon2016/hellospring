package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 메서드 단독 매핑
@Controller
public class GuestbookController {
	@RequestMapping("/guestbook/list")
	@ResponseBody
//	public String deleteForm(@RequestParam("page") int page){
	public String list(@RequestParam int page){
		System.out.println("page:" + page);
		return "GuestbookController:list()";
	}
	
	@RequestMapping("/guestbook/deleteform")
	@ResponseBody
	public String deleteForm(
			@RequestParam(value="no", required=false, defaultValue="-1") Long no){
		System.out.println(no);
		return "GuestbookController:deleteForm()";
	}
}
