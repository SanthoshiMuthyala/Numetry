package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.model.Student;

@Controller
public class IndexContoller {
	
	@Autowired
	private StudentRepository studentrepo;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("studentForm",  new Student());
		return "index";
		
	}
	
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute Student student, Model model) {
		System.out.println(student.toString());
		model.addAttribute("studentForm",  new Student());
		model.addAttribute("message", "you have register successfully.");
		
        studentrepo.save(student);
		model.addAttribute("message", "you have register successfully.");
		
		return "index";
	}

}
