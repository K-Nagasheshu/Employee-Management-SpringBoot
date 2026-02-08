package com.course.www.Todos_spb_128.todos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Serv {
	
	private static List<Main> todos = new ArrayList<>();
	
	static {
		todos.add(new Main(1, "nagasheshu", "learn anatomy" ,LocalDate.now().plusYears(1), true));
		todos.add(new Main(2, "sumanth", "learn microbiology" ,LocalDate.now().plusYears(2), true));
		todos.add(new Main(3, "mangaveni", "learn gynacology" ,LocalDate.now().plusYears(3), false));
		todos.add(new Main(4, "saroja", "learn pediatirc" ,LocalDate.now().plusYears(1), false));
	}
	
	List<Main> findByUserName(String UserName){
	return todos;  
	
	}
}
