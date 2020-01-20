package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//Create Student object
		
		Student student = new Student();
		
		//Add student object as an attribute
		theModel.addAttribute("student", student);
		return "student-form";
	}
     
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println(theStudent.getFirstName());
		System.out.println(theStudent.getLastName());
		return "student-confirmation";
		
		
	}
}
