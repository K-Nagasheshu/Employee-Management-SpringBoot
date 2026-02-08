package com.course.www.Todos_spb_139.todos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class Serv {
private static List<Student> suman = new ArrayList<>();
	
	static {
		suman.add(new Student( "sheshu",20528812,"sick", 3));
		suman.add(new Student("sanjay",20512325 ,"annual",2));
		suman.add(new Student( "mounika",20524213 ,"metarnity",8));
		suman.add(new Student( "megha",20528810 ,"unplan",1));
	}
	public List<Student>findAll() {
		return suman;  
	}
	
	public void addemployee(Student student) {
		suman.add(student); 
	}
}


