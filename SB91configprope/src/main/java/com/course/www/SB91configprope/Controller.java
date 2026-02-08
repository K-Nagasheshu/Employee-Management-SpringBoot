package com.course.www.SB91configprope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Config configuration;
	
	
	@RequestMapping("/currency-config")
	public Config Config () {
		return configuration;
	}
	

}
