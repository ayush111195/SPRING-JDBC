package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.student;

public class RowMapperImpl implements RowMapper< student > {

	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student Student1=new student();		
				Student1.setId(rs.getInt(1));
				Student1.setName(rs.getString(2));
                Student1.setCity(rs.getString(3));
		return Student1;
	}

}
