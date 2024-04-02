package com.prowings.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	SessionFactory sessionFactory;


	@Override
	public boolean saveStudent(Student student) {
		
		System.out.println("inside saveStudent() of StudentDaoImpl");
		
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(student);
		txn.commit();
		session.close();
		
		// code to interact with DB and saves the incoming student object
		return true;
	}

	@Override
	public List<Student> getStudentsList() {
		System.out.println("inside getStudentList() of StudentDaoImpl");
		return null;
	}

	
}
