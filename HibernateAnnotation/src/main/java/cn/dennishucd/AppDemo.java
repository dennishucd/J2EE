package cn.dennishucd;

import java.util.List;
import cn.dennishucd.db.Student;
import cn.dennishucd.service.StudentService;


public class AppDemo 
{
    public static void main( String[] args )
    {
    	StudentService studentService = new StudentService();
    	
    	List<Student> list = studentService.findAllStudents();
    	
		for (Student student : list) {
			System.out.println(student.getName());
		}
    }
}
