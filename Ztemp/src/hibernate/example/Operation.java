package hibernate.example;

import org.hibernate.Session;

public class Operation {

	public static void main(String[] args) {
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Person p= new Person("ram", "singh");
		Student1 s= new Student1(p, "varanasi");
		session.save(s);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.getSessionFactory().close();
		
	}

}
