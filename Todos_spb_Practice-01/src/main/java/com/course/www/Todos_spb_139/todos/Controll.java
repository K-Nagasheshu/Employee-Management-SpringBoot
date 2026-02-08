package com.course.www.Todos_spb_139.todos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controll {
	
	// http://localhost:8085/Todos
	// http://localhost:8085/new-Todos
	
	private Serv serv;
	
	
	public Controll(Serv serv) {
		super();
		this.serv = serv;
	} 


	@RequestMapping("Todos")
	public String listtodos(ModelMap model) {
		List<Main> todos = serv.findByUserName("course");
		model.addAttribute("todos", todos);
	    model.addAttribute("name", "course");
	    
		return "Hello";
	}
		
		@RequestMapping(value ="new-Todos", method = RequestMethod.GET)
		public String Second(ModelMap model) { 
			String username = (String)model.get("name"); 
			Main todo = new Main(0, username, "", LocalDate.now().plusYears(1), false);
			model.put("main", todo);
			return "Bye";          // add new todo to the list
	}
		
		@RequestMapping(value ="new-Todos", method = RequestMethod.POST)
		public String OneSecond(ModelMap model, Main main) {
		String username = (String)model.get("name");   //description
		serv.addOne(username,main.getDescription(),LocalDate.now().plusYears(1), false);
		return "redirect:Todos";
	}
}
	

