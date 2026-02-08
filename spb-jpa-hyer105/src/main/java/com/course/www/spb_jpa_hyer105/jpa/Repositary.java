package com.course.www.spb_jpa_hyer105.jpa;

import org.springframework.stereotype.Repository;

import com.course.www.spb_jpa_hyer105.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class Repositary {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void insert(Course course) {
		manager.merge(course);
	}
	
	public Course findById(long id) {
		return manager.find(Course.class,id);
	}
	public void delete(long id) {
		Course course=manager.find(Course.class,id);
	    manager.remove(course);
	}

}
