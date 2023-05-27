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
			System.out.println("Enter Student id");
			String id = scanner.nextLine();

			Student std = service.fetchDataById(Integer.parseInt(id));

			if (std != null) {
				Student newStd = new Student();

				newStd.setSid(std.getSid());
				System.out.println("Studnet id " + std.getSid());

				System.out.println("Old Name is :: " + std.getSname() + " Enter new name ");

				String newName = scanner.nextLine();

				if (newName.equals("") || newName == "")
					newStd.setSname(std.getSname());
				else
					newStd.setSname(newName);

				System.out.println("Old Age is :: " + std.getSage() + " Enter new Age ");
				String newAge = scanner.nextLine();

				if (newAge.equals("") || newAge == "")
					newStd.setSage(std.getSage());
				else
					newStd.setSage(Integer.parseInt(newAge));

				System.out.println("Old Address is :: " + std.getSaddress() + " Enter new Address ");
				String newAddress = scanner.nextLine();

				if (newAddress.equals("") || newAddress == "")
					newStd.setSaddress(std.getSaddress());
				else
					newStd.setSaddress(newAddress);

				String status = service.updateData(newStd);
				if (status.equalsIgnoreCase("success"))
					System.out.println("Record Updation successful");
				else
					System.out.println("Record Updation Failed");

				Student updatedStd = service.fetchDataById(Integer.parseInt(id));

				System.out.println("Student DATA with updated values :: " + updatedStd);
			} else {
				System.out.println("No Record is available with this id " + id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
