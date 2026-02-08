package com.course.www.spb_jpa_hyer105.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.course.www.spb_jpa_hyer105.jpa.Repositary;

@Component
public class Runner implements CommandLineRunner{

	@Autowired
	private Repositary code;
	
	@Override
	public void run(String... args) throws Exception {
		code.insert(new Course(3, "sai", "padi"));
		code.insert(new Course(4, "laxmi", "tommm"));
		code.insert(new Course(5, "karthi", "eight"));
		
		code.delete(5);
		
		System.out.println(code.findById(3));
		System.out.println(code.findById(4));
	}
	
}
