package com.course.www.spb_data_jpa_107.course_jpa;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.www.spb_data_jpa_107.course.Course;


public interface Repository  extends JpaRepository<Course, Long>{
	
	List<Course> findBySection(String section);
	
	List<Course> findByName(String name);


}