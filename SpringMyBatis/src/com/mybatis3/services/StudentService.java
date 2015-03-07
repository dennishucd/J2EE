package com.mybatis3.services;

import java.util.List;

import com.mybatis3.domain.Student;


public interface StudentService {

	public List<Student> findAllStudents();
	
}