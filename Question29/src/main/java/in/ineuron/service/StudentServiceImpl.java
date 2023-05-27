package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import in.ineuron.model.Student;
import in.ineuron.repo.StudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepo repo;


	@Override
	public List<Student> findStudentsByAge(Integer age, boolean asc, int pagesize, int pageNumber,
			String... properties) {
		Pageable pageable = PageRequest.of(pageNumber, pagesize, asc ? Direction.ASC : Direction.DESC, properties);
		return repo.findStudentsByAge(age, pageable);
	}

}
