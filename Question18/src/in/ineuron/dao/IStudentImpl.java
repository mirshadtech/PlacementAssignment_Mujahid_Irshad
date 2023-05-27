package in.ineuron.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.dto.Student;
import in.ineuron.util.HibernateUtil;

public class IStudentImpl implements IStudent {

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> fetchAllStudentDat() {

		List<Student> studentsList = null;
		try (Session session = HibernateUtil.getSession()) {
			String selectquery = "from in.ineuron.dto.Student";
			Query query = session.createQuery(selectquery);
			studentsList = query.list();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return studentsList;
	}

}
