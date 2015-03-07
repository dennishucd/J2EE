package cn.dennishucd.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cn.dennishucd.db.HibernateUtils;
import cn.dennishucd.db.Student;

public class StudentService {
	
	public List<Student> findAllStudents() {
		List<Student>  stuList = null;
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();

			String sql = "select * from student";
			
			Query query  = session.createSQLQuery(sql).addEntity(Student.class);
			stuList = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
		
		return stuList;
	}
}
