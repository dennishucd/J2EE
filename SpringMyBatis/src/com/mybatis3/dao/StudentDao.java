package com.mybatis3.dao;

import java.util.List;
import com.mybatis3.domain.Student;

public interface StudentDao {
	List<Student> findAllStudents();
}