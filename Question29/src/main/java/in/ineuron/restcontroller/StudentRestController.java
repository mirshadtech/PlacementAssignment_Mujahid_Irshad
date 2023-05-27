package in.ineuron.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Student;
import in.ineuron.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private StudentServiceImpl service;

	@GetMapping("/find/{age}/{pageNumber}/{asc}/{pageSize}/{properties}")
	public ResponseEntity<?> findStundetByAge(@PathVariable Integer age, @PathVariable Integer pageNumber,
			@PathVariable Integer pageSize,@PathVariable boolean asc, @PathVariable String[] properties ) {

		List<Student> studentsList = service.findStudentsByAge(age, asc, pageSize, pageNumber, properties);

		return new ResponseEntity<List<Student>>(studentsList, HttpStatus.OK);
	}
}
