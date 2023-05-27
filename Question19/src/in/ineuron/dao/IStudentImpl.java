package in.ineuron.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.dto.Student;
import in.ineuron.util.HibernateUtil;

public class IStudentImpl implements IStudent {

	@Override
	public Integer insertData(Student student) {
		Transaction txt = null;
		Integer id = null;
		Boolean flag = false;
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			if (session != null)
				txt = session.beginTransaction();
			if (txt != null) {
				id = (Integer) session.save(student);
				flag = true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag == true)
				txt.commit();
			else
				txt.rollback();
		}
		return id;
	}

	@Override
	public Student fetchDataById(Integer sid) {
		Session session = null;
		Student std = null;
		try {
			session = HibernateUtil.getSession();
			std = session.get(Student.class, sid);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}

}
