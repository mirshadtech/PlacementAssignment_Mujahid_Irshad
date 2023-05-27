package in.ineuron.Question11.daoFactory;

import in.ineuron.persistence.IStudentDao;
import in.ineuron.persistence.StudentDaoImpl;

public class StudentDaoFactory {

	public static IStudentDao studentdao = null;

	public static IStudentDao getStudentDao() {
		if (studentdao == null) {
			studentdao = new StudentDaoImpl();
		}

		return studentdao;

	}

}
