package com.courseSB.www.spb_jpa_hyber._9.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.courseSB.www.spb_jpa_hyber._9.course.jdbc.Course;

@Repository
public class Jdbcode {
	
	@Autowired
	private JdbcTemplate template;  // template is a name //
	
	
	private static String INSERT_QUERY = 
			"""
					insert into course(id,name,section)
					values(?,?,?);
					
			""";
	private static String DELETE_QUERY = 
			"""
					delete from course 
					where id=?
					
			""";
	
	private static String SELECT_QUERY = 
			"""
					select * from course 
					where id=?
					
			""";
	
	
	
	
	public void insert(Course course) {            // create and call this method //
        template.update(INSERT_QUERY,course.getId(), course.getName(), course.getSection());
	}
	public void deleteById(long id) {            // create and call this method //
        template.update(DELETE_QUERY,id);
	}
	public Course retrieve(long id) {            // create and call this method //
        return template.queryForObject(SELECT_QUERY,
        		new BeanPropertyRowMapper<>(Course.class),id);
	}
}

