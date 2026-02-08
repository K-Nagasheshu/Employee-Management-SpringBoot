package com.course.www.Todos_spb_140.todos;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controll {
	
	private Serv serv;

	public Controll(Serv serv) {
		super();
		this.serv = serv;
	}
	
	// http://localhost:8085/Mahi
	@RequestMapping("Mahi")   
	public String Apple(ModelMap model) {      // Because this controller method is returning a view name, and a view name is always a String.
		List<Student> bhadra = serv.findAll();
		model.addAttribute("course",bhadra);
		
		return "Hello";
		
	}
}
