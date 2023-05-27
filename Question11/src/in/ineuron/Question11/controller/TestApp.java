package in.ineuron.Question11.controller;

import java.util.Iterator;
import java.util.List;

import in.ineuron.Question11.Service.IStudentService;
import in.ineuron.Question11.Service.StudentServiceImpl;
import in.ineuron.Question11.dto.Student;
import in.ineuron.Question11.serviceFactory.StudentServiceFactory;

public class TestApp {
	public static void main(String[] args) {

		IStudentService std = StudentServiceFactory.getStudentService();
		List<Student> newList = std.searchStudent();
		if (newList.size() == 0) {
			System.out.println("Record not Present");
		} else {
			System.out.println("Id\tName\tAddress\tAge");
			Iterator it = newList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		}
	}
}
