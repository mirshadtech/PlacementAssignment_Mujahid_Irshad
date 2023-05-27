package in.ineuron.main;

import java.util.List;

import in.ineuron.dto.Student;
import in.ineuron.service.IStudentService;
import in.ineuron.service.IStudentServiceImpl;

public class StudentApp {

	private static IStudentService service;

	public static void main(String[] args) {

		service = new IStudentServiceImpl();
		List<Student> list = service.fetchAllStudentDat();
		if (list != null)
			list.forEach(System.out::println);
		else
			System.out.println("NO Data Availble");

	}
}
