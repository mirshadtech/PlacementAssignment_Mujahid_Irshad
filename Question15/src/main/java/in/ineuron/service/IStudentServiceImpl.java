package in.ineuron.service;

import java.util.List;

import in.ineuron.dao.IStudentImpl;
import in.ineuron.dto.Student;

public class IStudentServiceImpl implements IStudentService {

	@Override
	public List<Student> fetchAllStudentDat() {
		IStudentImpl studentdao = new IStudentImpl();
		return studentdao.fetchAllStudentDat();
	}

}
