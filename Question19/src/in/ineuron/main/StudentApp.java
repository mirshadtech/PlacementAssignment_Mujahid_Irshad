package in.ineuron.main;

import java.util.Scanner;

import in.ineuron.dto.Student;
import in.ineuron.service.IStudentService;
import in.ineuron.service.IStudentServiceImpl;

public class StudentApp {

	private static IStudentService service;
	private static Scanner scanner;

	public static void main(String[] args) {

		try {
			scanner = new Scanner(System.in);
			service = new IStudentServiceImpl();

			System.out.println("Enter Name :");
			String name = scanner.nextLine();

			System.out.println("Enter Age :");
			String age = scanner.nextLine();

			System.out.println("Enter Address: ");
			String address = scanner.nextLine();

			Student student = new Student();
			student.setSname(name);
			student.setSaddress(address);
			student.setSage(Integer.parseInt(age));
			Integer id = service.insertData(student);
			if (id != null)
				System.out.println("Record Inserted successful with id :: " + id);
			else
				System.out.println("Record Inserted Failed");

			System.out.println();
			Student std = service.fetchDataById(id);
			System.out.println("Inseted details " + std);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
