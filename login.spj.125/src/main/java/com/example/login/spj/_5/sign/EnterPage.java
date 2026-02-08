package com.example.login.spj._5.sign;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnterPage {

	// create login controller and login view //
	
    // http://localhost:8085/login
	
	
	private Authent authent; 
	public EnterPage(Authent authent) {
		super();
		this.authent = authent;
	}

	@RequestMapping(value ="login", method = RequestMethod.GET)
	public String Goingtologin() {
		return "Hai";
	}
	
	@RequestMapping(value ="login", method = RequestMethod.POST)
	public String GoingtoWelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if (authent.authenticate(name,password)) {
		
		
		       model.put("name", name);
		       
		
		      // name = nagasheshu 
		      // password = sumanth
		
		      return "Welcome";
		}
		model.put("errormessage", "Invalid Credentials");
		return "Hai";
	}
}
	
		
	 
	

 

