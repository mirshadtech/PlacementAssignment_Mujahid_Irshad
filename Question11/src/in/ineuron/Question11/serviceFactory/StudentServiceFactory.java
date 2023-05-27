package in.ineuron.Question11.serviceFactory;

import in.ineuron.Question11.Service.IStudentService;
import in.ineuron.Question11.Service.StudentServiceImpl;

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
