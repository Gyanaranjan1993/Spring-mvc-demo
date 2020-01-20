package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String makeShout(HttpServletRequest request, Model model) {
		String theName = request.getParameter("Studentname");
		theName = theName.toUpperCase();
		String Result = "Yo!" + theName;
		System.out.println(Result);
		model.addAttribute("Message", Result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String makeShoutThree(
			@RequestParam("Studentname") String theName, Model model) {
	
		theName = theName.toUpperCase();
		String Result = "Yo!" + theName;
		System.out.println(Result);
		model.addAttribute("Message", Result);
		return "helloworld";
	}


}
