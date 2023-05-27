package in.ineuron.Question11.Service;

import java.util.List;

import in.ineuron.Question11.daoFactory.StudentDaoFactory;
import in.ineuron.Question11.dto.Student;
import in.ineuron.persistence.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	IStudentDao stdDao = null;

	@Override
	public List<Student> searchStudent() {

		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent();

	}

}
