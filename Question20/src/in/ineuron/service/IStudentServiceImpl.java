package in.ineuron.service;

import in.ineuron.dao.IStudentImpl;
import in.ineuron.dto.Student;

public class IStudentServiceImpl implements IStudentService {
	private static IStudentImpl dao;

	static {
		dao = new IStudentImpl();
	}

	@Override
	public String updateData(Student student) {
		return dao.updateData(student);
	}

	@Override
	public Student fetchDataById(Integer sid) {
		return dao.fetchDataById(sid);
	}

}
