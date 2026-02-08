package com.courseSB.www.spb_jpa_hyber._9.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.courseSB.www.spb_jpa_hyber._9.course.jdbc.Course;

@Component
public class Runner implements CommandLineRunner{

	@Autowired
	private Jdbcode code;
	
	@Override
	public void run(String... args) throws Exception {
		code.insert(new Course(3, "sai", "ten"));
		code.insert(new Course(4, "laxmi", "nine"));
		code.insert(new Course(5, "karthi", "eight"));
		
		code.deleteById(5);
		
		System.out.println(code.retrieve(3));
		System.out.println(code.retrieve(4));
		
	}
	
}