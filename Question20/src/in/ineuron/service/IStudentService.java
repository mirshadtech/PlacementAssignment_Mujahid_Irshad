package in.ineuron.service;

import in.ineuron.dto.Student;

public interface IStudentService {
	public String updateData(Student student);

	public Student fetchDataById(Integer sid);
}
