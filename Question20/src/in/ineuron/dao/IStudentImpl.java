package in.ineuron.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.dto.Student;
import in.ineuron.util.HibernateUtil;

public class IStudentImpl implements IStudent {

	@Override
	public String updateData(Student student) {
		Transaction txt = null;
		Boolean flag = false;
		Session session = null;
		String status = null;
		try {
			session = HibernateUtil.getSession();

			Student std = session.get(Student.class, student.getSid());
			if (session != null && std != null)
				txt = session.beginTransaction();
			
			if (txt != null) {
				std.setSname(student.getSname());
				std.setSaddress(student.getSaddress());
				std.setSage(student.getSage());
				session.update(std);
				flag = true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag == true) {
				txt.commit();
				status = "success";
			} else {
				txt.rollback();
				status = "failure";
			}
		}
		return status;
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
