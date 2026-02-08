package com.course.www.Todos_spb_139.todos;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Controll {
	
	private Serv serv;

	// http://localhost:8085/Mahi
	public Controll(Serv serv) {
		super();
		this.serv = serv;
	}
	
	// http://localhost:8085/login //
	
	   // OPEN FORM  1st //
	    @RequestMapping(value="login", method=RequestMethod.GET)
		public String showform(ModelMap model) {      // Because this controller method is returning a view name, and a view name is always a String.
			model.addAttribute("student",new Student());
			return "Hai";
	    }
	    
	 // show full employee details form  2nd //
	    @RequestMapping(value="login", method=RequestMethod.POST)
	    public String submitLeave(@ModelAttribute("student") Student student, ModelMap model) {
	        // call service
	    	 List<Student> list = serv.findAll();   
	        model.addAttribute("leaves", list);
	        
	        return "redirect:emp"; 
	        
	    }
	    // add employee details form show  3rd //
	    @RequestMapping(value="new-employee", method=RequestMethod.GET)
		public String enteremployee(ModelMap model) {      // Because this controller method is returning a view name, and a view name is always a String.
	    	model.addAttribute("student",new Student());
			return "Hello2";
	    }
	    
	 // submit employee details form   4th //
	    @RequestMapping(value="add-emp", method=RequestMethod.POST)
		public String addemployee(@ModelAttribute("student") Student student, ModelMap model) {      // Because this controller method is returning a view name, and a view name is always a String.
	    	serv.addemployee(student);
			return "redirect:emp";
	    }
	    
	    //  show full updated form   5th //
	    @RequestMapping(value="emp", method=RequestMethod.GET)
	    public String showtotal(ModelMap model) {
	        // call service
	    	 List<Student> list = serv.findAll();   
	        model.addAttribute("leaves", list);
	        
	        return "Hello"; 
	        
	    }
	    
}
	   




	

