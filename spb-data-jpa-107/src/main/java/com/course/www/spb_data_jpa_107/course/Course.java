package com.course.www.spb_data_jpa_107.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Course")
public class Course {


	@Id
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="section")
	private String section;
	
	public Course() {
		
	}
	public Course(long id, String name, String section) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
	} 
	
	
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSection() {
		return section;
	}
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", Section=" + section + "]";
	}
	
}

