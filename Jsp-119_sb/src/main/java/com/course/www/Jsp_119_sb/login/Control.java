package com.course.www.Jsp_119_sb.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Control {
	
	
	// create login controller and login view //
	
    // http://localhost:8085/login
	
	/**@RequestMapping("login") 
	public String Htmlmethodjsp() {
	     return "Login";
	}**/
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//using a request param and model maps //
	
	// http://localhost:8085/login?name=sheshu
	
	//You order a pizza with many toppings (cheese, onion, paneer…)	@ModelAttribute (collects many fields into one object)
	//You ask for only one item like a Coke	@RequestParam (one small value)
	
	@RequestMapping("login") 
	public String Htmlmethodjsp(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		
		
		logger.debug("Request param is {}" , name); //this is loged at debug level.
		logger.info("Now i want print at info level"); //this is loged at info level.
		logger.warn("Now i want print at warn level"); //this is loged at warn level.
		
		System.out.println("Request param is " + name);  // to login things // 
	     return "Login";
	}


}
 

