package com.ineuron.serviceFactory;

import com.ineuron.Service.IStudentService;
import com.ineuron.Service.StudentServiceImpl;

public class StudentServiceFactory {
	private StudentServiceFactory() {

	}

	private static IStudentService studentservice = null;

	public static IStudentService getStudentService() {
		if (studentservice == null) {
			studentservice = new StudentServiceImpl();
		}
		return studentservice;
	}

}
