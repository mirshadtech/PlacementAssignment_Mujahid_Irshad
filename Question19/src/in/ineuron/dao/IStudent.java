package in.ineuron.dao;

import in.ineuron.dto.Student;

public interface IStudent {

	public Integer insertData(Student student);

	public Student fetchDataById(Integer sid);
}
