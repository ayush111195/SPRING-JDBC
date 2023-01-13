package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.student;
import com.springcore.Student;

public class StudentDaoImpl  implements StudentDao {

	
	private JdbcTemplate jdbcTemplates;
	
	public int insert(student Student1) {
		//insert the value--->>>
        String query="insert into student (id,name,city) values(?,?,?)";

	int r=	 this.jdbcTemplates.update(query,Student1.getId(),Student1.getName(),Student1.getCity());
		return r;
	}
	
	public int change(student Student1) {
		//updating data---->>
		String query="update student set name=? , city=? where id=?";
		int r1 = this.jdbcTemplates.update(query,Student1.getName(),Student1.getCity(),Student1.getId());
		return r1;
	}
	
	public int dlt(student Student1) {
		// dlt data---->>>
		String query ="delete from student where id=? ";
		int r2 = this.jdbcTemplates.update(query,Student1.getId());
		return r2;
	}
	
	public student getstudent(int studentId) {
		// selecting single student data---->>>
		String query="select * from student where id=?";
	    RowMapper<student>rowMaper=	new RowMapperImpl();
		student Stu = this.jdbcTemplates.queryForObject(query,rowMaper,studentId);
		return Stu;
	}
	public List<student> getAllStudent() {
		// selecting multipal objec--->>>
		String query="select * from student";
		List<student>stud  = this.jdbcTemplates.query(query,new RowMapperImpl());
		return stud;
	}

	public JdbcTemplate getJdbcTemplates() {
		return jdbcTemplates;
	}

	public void setJdbcTemplates(JdbcTemplate jdbcTemplates) {
		this.jdbcTemplates = jdbcTemplates;
	}

	

	
	

	
}
