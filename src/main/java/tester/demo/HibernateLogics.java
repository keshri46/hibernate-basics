package tester.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateLogics {

	static EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
	static EntityManager m = e.createEntityManager();
	static EntityTransaction t = m.getTransaction();

	static void addStudent(Student s) {
		t.begin();
		m.persist(s);
		t.commit();
	}

	static void updateStudent(int id, String address) {
		Student s = m.find(Student.class, id);
		s.setSAddress(address);

		t.begin();
		m.merge(s);
		t.commit();
	}

	static void deleteStudent(int id) {
		Student s = m.find(Student.class, id);

		t.begin();
		m.remove(s);
		t.commit();
	}

	static Student fetchStudent(int id) {
		return m.find(Student.class, id);
	}

}
