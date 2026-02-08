package com.course.www.spwebapp1_113.hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
@ResponseBody
public class Class {
	
	// when anyone click "Hai" , then display and return back is "Hello" //
	
	// http://localhost:8085/Haihtml
	/*@RequestMapping("Hai")
	public String Hai() {
		return "Hello , how are you?  ";
	}*/
	
	@RequestMapping("Haihtml") 
	public String Htmlmethod () {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");

	    sb.append("<head>");
	          sb.append("<title> HTML PAG </title>");
	    sb.append("</head>");
	    
	    sb.append("<body>");
	          sb.append("Hyper Text Markup Language.");
	    sb.append("</body>");
	    
	sb.append("</html");
	
	return sb.toString();

	}


}
 
