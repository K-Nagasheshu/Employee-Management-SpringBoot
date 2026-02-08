package com.course.www.Todos_spb_141.todos;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Serv {
	
	private static List<Student>mahi = new ArrayList<>();
	
	static {
		mahi.add(new Student(1530,"Sumanth","ten",98));
		mahi.add(new Student(1416,"Pranathi","nine",95));
		mahi.add(new Student(1072,"Kavya","eight",92));
		mahi.add(new Student(1279,"Pandu","seven",88));
	}

	public List<Student> findAll() {
		return mahi;
	}
	
}
