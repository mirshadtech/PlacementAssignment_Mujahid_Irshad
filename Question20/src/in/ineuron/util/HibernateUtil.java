package in.ineuron.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.dto.Student;

public class HibernateUtil {

	private static SessionFactory sessionfactory;
	private static Session session;

	private HibernateUtil() {
	}

	static {
		sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	}

	public static Session getSession() {
		if (session == null) {
			session = sessionfactory.openSession();
		}
		return session;
	}
}
