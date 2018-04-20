package hibernate.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class HibernateMain {
	public static void main(String[] args) {
		System.out.println("----------Application Started ------------");
		fetchData();
	}
	
	public static void fetchData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
		Criteria studentCriteria=session.createCriteria(Student.class);
		studentCriteria.setFetchMode("address.student", FetchMode.JOIN);
		List<Object> studentList = studentCriteria.add(Restrictions.eqOrIsNull("rollNo", 0)).list();
		System.out.println(studentList);
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
	
	public static void saveData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			Transaction tx = session.beginTransaction();
			Student student = new Student();
			student.setStudentName("Ravi");
			
			Address address = new Address("aaaa", "bbb", "ccc",student);

			List<Address> addresses = new ArrayList<>();
			addresses.add(new Address("kkr", "Harayan", "thol",student));
			addresses.add(new Address("shabahad", "Punjab", "ismailabad",student));

			student.setAddress(addresses);

			session.save(student);
			// session.save(address);
			tx.commit();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
	
	
}
