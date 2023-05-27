package in.ineuron.service;

import in.ineuron.model.Employe;

public interface IEmployeeMngtService {

	public String insertEmployeeDetails(Employe employee);

	public Employe fetchEmpoyeeDetailsById(Integer id);

}
