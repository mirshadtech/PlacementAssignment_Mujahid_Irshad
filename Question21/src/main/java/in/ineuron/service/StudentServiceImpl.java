package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Student;
import in.ineuron.repo.StudentRepository;

@Service
public class StudentServiceImpl implements IStudnetService {

	@Autowired
	private StudentRepository repo;

	@Override
	public String insertStudentData(Student student) {

		Student std = repo.save(student);
		return std != null ? "Student Data is inserted with id :: " + std.getSid() : "Student Data is insertion failed";
	}

}
