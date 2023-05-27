package in.ineuron.service;

import in.ineuron.dto.Student;

public interface IStudentService {
	public Integer insertData(Student student);

	public Student fetchDataById(Integer sid);
}
