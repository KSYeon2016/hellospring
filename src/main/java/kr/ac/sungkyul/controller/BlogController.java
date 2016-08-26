package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 메소드 이름으로 매핑
@Controller
@RequestMapping("/blog/*")
public class BlogController {
	@ResponseBody
	@RequestMapping
	public String list(
//			HttpServletRequest request, 톰캣이 제공, 사용X
			@RequestParam("p") int page,
			@RequestParam("n") String name
			){
//		String p = request.getParameter("p");
		System.out.println("page:" + page);
		System.out.println("name:" + name);
		common();
		return "BlogController:list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String add(){
		common();
		return "BlogController:add()";
	}
	
	private void common(){
		System.out.println("common called");
	}
}
