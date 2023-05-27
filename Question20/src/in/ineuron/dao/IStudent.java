package in.ineuron.dao;

import in.ineuron.dto.Student;

public interface IStudent {

	public String updateData(Student student);

	public Student fetchDataById(Integer sid);
}
