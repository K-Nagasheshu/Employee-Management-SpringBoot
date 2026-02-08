package com.course.www.Todos_spb_139.todos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Serv {
	
	private static List<Main> todos = new ArrayList<>();
	
	private static int Count = 0;
	static {
		todos.add(new Main(++Count, "nagasheshu", "learn anatomy" ,LocalDate.now().plusYears(1), true));
		todos.add(new Main(++Count, "sumanth", "learn microbiology" ,LocalDate.now().plusYears(2), true));
		todos.add(new Main(++Count, "mangaveni", "learn gynacology" ,LocalDate.now().plusYears(3), false));
		todos.add(new Main(++Count, "saroja", "learn pediatirc" ,LocalDate.now().plusYears(1), false));
	}
	
	List<Main> findByUserName(String UserName){
	return todos; 
	}

	public void addOne(String username, String description, LocalDate targetDate, boolean done) {
		Main todo = new Main(++Count,username,description,targetDate,done);    //description
		todos.add(todo);
	}
}
