package com.example.login.spj._5.sign.Todos;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controll {
	
	// http://localhost:8085/Todos
	
	private Serv serv;
	
	
	public Controll(Serv serv) {
		super();
		this.serv = serv;
	}


	@RequestMapping("Todos")
	public String listtodos(ModelMap model) {
		List<Main> todos = serv.findByUsername("course");
		model.addAttribute("todos", todos);
		
		return "Sai";
	}
}
	
