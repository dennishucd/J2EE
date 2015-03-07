package com.mybatis3;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis3.domain.Student;
import com.mybatis3.services.StudentService;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		StudentService studentService = (StudentService) context.getBean("studentService");
		
		List<Student> list = studentService.findAllStudents();
		for (Student student : list) {
			System.out.println(student.getName());
		}
	}
}
