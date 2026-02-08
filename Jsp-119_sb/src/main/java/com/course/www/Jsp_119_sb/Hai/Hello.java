package com.course.www.Jsp_119_sb.Hai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Hello {
	
    // http://localhost:8085/JSPfile
	
	@RequestMapping("JSPfile") 
	public String Htmlmethodjsp() {
	     return "First";
 
	}


}
 

