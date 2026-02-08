package com.course.www.spb_data_jpa_107.course_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.course.www.spb_data_jpa_107.course.Course;
 
@Component
public class Runner implements CommandLineRunner{

	@Autowired
	private Repository code;
	
	@Override
	public void run(String... args) throws Exception {
		code.save(new Course(3, "sai", "padi"));
		code.save(new Course(4, "laxmi", "tommm"));
		code.save(new Course(5, "karthi", "eight"));
		
		code.deleteById(5l);
		
		//System.out.println(code.findById(3l));
		//System.out.println(code.findById(4l));
		
		//System.out.println(code.findAll());
		
		//System.out.println(code.count());
		
		System.out.println(code.findBySection(""));
		System.out.println(code.findBySection("course"));
		
		System.out.println(code.findByName("sai"));
	}
	
}

