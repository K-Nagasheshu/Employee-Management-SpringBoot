package com.course.www.Todos_spb_141.todos;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;


@Controller
public class Controll {
	
	private Serv serv;

	public Controll(Serv serv) {
		super();
		this.serv = serv;
	}
	
	// http://localhost:8085/Mani
	@RequestMapping(value="Mani",method=RequestMethod.GET)
	public String LoginPage(ModelMap model) {
		return "First";
	}
	
	@RequestMapping(value="Mani", method=RequestMethod.POST)
	public String DetailsPage(@RequestParam String Username, @RequestParam String Password, HttpSession session) {
		session.setAttribute("username", Username);
		session.setAttribute("password", Password);
		return "redirect:Mahi";
	}
	
	@RequestMapping("Mahi")
	public String showFinalPage(HttpSession session, ModelMap model) {
		List<Student> mahi = serv.findAll();
		model.addAttribute("course",mahi);  
		
	    String username = (String) session.getAttribute("username");
	    model.addAttribute("name", username);
	    return "Aaa";
	}
}



