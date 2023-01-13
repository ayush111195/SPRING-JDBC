package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.student;
import com.springcore.Student;

public interface StudentDao {
public int insert(student Student1);      // ye ek interface h isleye yhan methhod ke andr body nhi likh skte 
public int  change(student Student1);     // nyi class bnayege jo iss class ko impliment karti hho 
public int dlt(student Student1);
public student getstudent(int studentId);
public List<student>getAllStudent();
}                                         
