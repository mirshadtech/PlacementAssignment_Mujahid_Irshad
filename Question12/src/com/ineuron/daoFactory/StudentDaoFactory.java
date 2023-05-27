package com.ineuron.daoFactory;

import com.ineuron.persistance.IStudentDao;
import com.ineuron.persistance.StudentDaoImpl;

public class StudentDaoFactory {

	public static IStudentDao studentdao = null;

	public static IStudentDao getStudentDao() {
		if (studentdao == null) {
			studentdao = new StudentDaoImpl();
		}

		return studentdao;

	}

}
