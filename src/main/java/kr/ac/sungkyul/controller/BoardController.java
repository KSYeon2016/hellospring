package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	@ResponseBody
	@RequestMapping("/list")
	public String list(){
		return "BoardController:list()";
	}
	
	// url은 같은데 들어오는 타입이 다름
	@RequestMapping(value="/write", method=RequestMethod.GET)
	@ResponseBody
	public String writeForm(){
		return "BoardController:writeForm";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	@ResponseBody
	public String write(){
		return "BoardController:write";
	}
	
	@ResponseBody
	@RequestMapping("/view")
	public String view(
			@RequestParam(value="no", required=false, defaultValue="-1") Long no){
		return "BoardController:view():" + no;
	}
	
	@ResponseBody
	@RequestMapping("/delete/{no}")
	public String delete(@PathVariable("no") Long no){
		return "BoardController:delete():" + no;
	}
}
