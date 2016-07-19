package com.han.webApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  //��Ʈ�ѷ����� ����ϴ� annotation
public class ControllerTest {
	
	//requestMapping�� �ٸ� ���
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
		//post����� �ѱ��� ������
		String name=request.getParameter("name");
		String num=request.getParameter("num");
		String tel=request.getParameter("tel");
		model.addAttribute("name",name);
		model.addAttribute("num",num);
		model.addAttribute("tel",tel);
		return "formView";
	}*/
	//a�±׷� ���ӽ� 
	@RequestMapping(value="/aLink",method=RequestMethod.GET)//a�±״� post����� ����
	public String aLinkTest(HttpServletRequest req,Model model){
		//Ŭ���̾�Ʈ ������ ���� ����Ÿ ��� -->������ ����Ÿ�� �ִ� ��� request��ü�� ���ڷ� �޴´�.
		String num=req.getParameter("num");
		String name=req.getParameter("name");
		
		//��� ����Ÿ ������
		model.addAttribute("num",num);
		model.addAttribute("name",name);
		return "aLink";
	}
	@RequestMapping("/view1")  //�ּ�ǥ���ٿ� context�� ������ /view1�� ���� ��� ����Ǵ� �޼ҵ�
	public String viewTest(Model model){
		//�̸�,����ó
		model.addAttribute("name","��ټ�");
		model.addAttribute("tel","010-3535-4646");
		return "view1";  //view���ϸ��� view1.jsp ��� ��. �տ� ��ΰ� �����Ƿ� views���Ͽ� �ִ� jsp�̴�.
	}
}
