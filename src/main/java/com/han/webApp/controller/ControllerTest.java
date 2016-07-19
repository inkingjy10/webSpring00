package com.han.webApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  //컨트롤러임을 명시하는 annotation
public class ControllerTest {
	
	//requestMapping의 다른 방법
	@RequestMapping("/formData")
	public String formData(@RequestParam("name") String name,
							@RequestParam("num") int num,
							@RequestParam("tel") String tel,
							Model model){
		
		model.addAttribute("name",name);
		model.addAttribute("num",num);
		model.addAttribute("tel",tel);
		return "formView";
	}
	/*@RequestMapping(value="/formData")
	public String formData(HttpServletRequest request,Model model){
		//post방식은 한글이 깨진다
		String name=request.getParameter("name");
		String num=request.getParameter("num");
		String tel=request.getParameter("tel");
		model.addAttribute("name",name);
		model.addAttribute("num",num);
		model.addAttribute("tel",tel);
		return "formView";
	}*/
	//a태그로 접속시 
	@RequestMapping(value="/aLink",method=RequestMethod.GET)//a태그는 post방식이 없다
	public String aLinkTest(HttpServletRequest req,Model model){
		//클라이언트 측에서 보낸 데이타 얻기 -->가져올 데이타가 있는 경우 request객체를 인자로 받는다.
		String num=req.getParameter("num");
		String name=req.getParameter("name");
		
		//뷰로 데이타 보내기
		model.addAttribute("num",num);
		model.addAttribute("name",name);
		return "aLink";
	}
	@RequestMapping("/view1")  //주소표시줄에 context명 다음에 /view1이 붙은 경우 실행되는 메소드
	public String viewTest(Model model){
		//이름,연락처
		model.addAttribute("name","김다솔");
		model.addAttribute("tel","010-3535-4646");
		return "view1";  //view파일명이 view1.jsp 라는 뜻. 앞에 경로가 없으므로 views파일에 있는 jsp이다.
	}
}
