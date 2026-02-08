package com.course.www.Todos_spb_140.todos;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class Serv {
	
	private static List<Student> bhadra = new ArrayList<>();
	
	private static int count=0;
	
	static {
		bhadra.add(new Student(++count, 1, "nagaraju", "ten"));
		bhadra.add(new Student(++count, 921, "maharani", "eight"));
		bhadra.add(new Student(++count, 780, "saroja", "nine"));
		bhadra.add(new Student(++count, 527, "shiva", "seven"));
	}
	public List<Student>findAll() {
		return bhadra;  
	}
}

