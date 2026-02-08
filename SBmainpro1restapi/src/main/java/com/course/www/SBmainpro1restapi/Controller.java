package com.course.www.SBmainpro1restapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	// course
	// coures : id , name , author .
	
	@RequestMapping("/course")
	public List<Course> retrieveAllCourses() {
	return Arrays.asList(
			new Course(1,"anatomy", "sheshu"),
			new Course(2,"gynacology", "naga"),
			new Course(3,"peadtirc", "sumanth")
			);
	}

}
