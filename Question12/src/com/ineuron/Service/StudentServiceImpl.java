package com.ineuron.Service;

import com.ineuron.daoFactory.StudentDaoFactory;
import com.ineuron.dto.Student;
import com.ineuron.persistance.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	IStudentDao stdDao = null;

	@Override
	public String addStudent(String sname, Integer sage, String saddress) {
		stdDao = StudentDaoFactory.getStudentDao();
		if (stdDao != null) {
			return stdDao.addStudent(sname, sage, saddress);
		}else
		return "Faliure";

	}

	@Override
	public Student searchStudent(Integer sid) {

		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent(sid);

	}

	@Override
	public String updateStudent(Student student) {

		return stdDao.updateStudent(student);
	}

	@Override
	public String deleteStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		if (stdDao != null) {
			return stdDao.deleteStudent(sid);
		} else
			return "faliure";

	}

}
