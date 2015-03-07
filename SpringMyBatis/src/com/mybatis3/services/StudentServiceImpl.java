package com.mybatis3.services;

import java.util.List;

import com.mybatis3.dao.StudentDao;
import com.mybatis3.domain.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public List<Student> findAllStudents() {
		return studentDao.findAllStudents();
	}
}