package com.ineuron.controller;

import java.util.Scanner;

import com.ineuron.Service.IStudentService;
import com.ineuron.dto.Student;
import com.ineuron.serviceFactory.StudentServiceFactory;

public class TestApp {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {
			System.out.println("*******************************");
			System.out.println("Enter 1 to perform insert operation");
			System.out.println("Enter 2 to perform select operation");
			System.out.println("Enter 3 to perform update operation");
			System.out.println("Enter 4 to perform delete operation");
			System.out.println("Enter 0 to  exit ");
			int value = sc.nextInt();

			if (value == 1) {
				insertOperation();

			} else if (value == 2) {
				selectOperation();

			} else if (value == 3) {
				updateOperation();

			} else if (value == 4) {
				deleteOperation();

			} else if (value == 0) {
				System.out.println("*********Thanks For using the service*************");

				break;
			}
		}

	}

	private static void updateOperation() {
		IStudentService service = StudentServiceFactory.getStudentService();
		sc = new Scanner(System.in);

		System.out.println("Enter ID :");
		String id = sc.nextLine();

		Student std = service.searchStudent(Integer.parseInt(id));

		if (std != null) {
			Student newStd = new Student();

			newStd.setSid(std.getSid());
			System.out.println("Studnet id " + std.getSid());

			System.out.println("Old Name is :: " + std.getSname() + " Enter new name ");
			String newName = sc.nextLine();

			if (newName.equals("") || newName == "")
				newStd.setSname(std.getSname());
			else
				newStd.setSname(newName);

			System.out.println("Old Age is :: " + std.getSage() + " Enter new Age ");
			String newAge = sc.nextLine();

			if (newAge.equals("") || newAge == "")
				newStd.setSage(std.getSage());
			else
				newStd.setSage(Integer.parseInt(newAge));

			System.out.println("Old Address is :: " + std.getAddress() + " Enter new Address ");
			String newAddress = sc.nextLine();

			if (newAddress.equals("") || newAddress == "")
				newStd.setAddress(std.getAddress());
			else
				newStd.setAddress(newAddress);

			String status = service.updateStudent(newStd);
			if (status.equalsIgnoreCase("success"))
				System.out.println("Record Updation successful");
			else
				System.out.println("Record Updation Failed");
		} else {
			System.out.println("No Record is available with this id" + id);
		}
	}

	private static void deleteOperation() {

		sc = new Scanner(System.in);
		System.out.println("Enter the id you want to Delete::");
		int sid = sc.nextInt();
		IStudentService studentService = StudentServiceFactory.getStudentService();
		String msg = studentService.deleteStudent(sid);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("record deleted succesfully");
		} else {
			System.out.println("Record not Found for given id:: " + sid + "\nrecord deletion failed....");
		}

	}

	@SuppressWarnings("unused")
	private static void selectOperation() {
		sc = new Scanner(System.in);
		System.out.println("Enter the id you want to Search::");
		int sid = sc.nextInt();
		IStudentService studentService = StudentServiceFactory.getStudentService();
		Student std = studentService.searchStudent(sid);
		if (std != null) {
			System.out.println("Id\tName\tAge\tAddress");
			System.out.println(std.getSid() + "\t" + std.getSname() + "\t" + std.getSage() + "\t" + std.getAddress());
		} else {
			System.out.println("Record not found....");
		}

	}

	@SuppressWarnings("unused")
	private static void insertOperation() {

		IStudentService studentService = StudentServiceFactory.getStudentService();

		System.out.println("Enter the Name::");
		String sname = sc.next();
		System.out.println("Enter the Age::");
		int sage = sc.nextInt();
		System.out.println("Enter the Address::");
		String saddress = sc.next();
		String msg = studentService.addStudent(sname, sage, saddress);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("record inserted succesfully");
		} else {
			System.out.println("record insertion failed....");
		}

	}

}
