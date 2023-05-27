package in.ineuron.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import in.ineuron.model.Student;

public interface StudentRepo extends PagingAndSortingRepository<Student, Integer> {

	@Query(value = "Select sid,sname,sage,saddress from student where sage>=:sage", nativeQuery = true)
	public List<Student> findStudentsByAge(Integer sage, Pageable pageable);

}
