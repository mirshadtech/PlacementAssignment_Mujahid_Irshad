package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Student;

public interface IStudentService {

	public List<Student> findStudentsByAge(Integer age, boolean asc, int pagesize, int pageNumber,
			String... properties);
}
