package com.mybatis3;

import java.util.List;

import com.mybatis3.domain.Student;
import com.mybatis3.services.StudentService;

public class Demo {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		List<Student> list = service.findAllStudents();
		
		for(Student student: list) {
			System.out.println(student.getName());
		}

	}

}
