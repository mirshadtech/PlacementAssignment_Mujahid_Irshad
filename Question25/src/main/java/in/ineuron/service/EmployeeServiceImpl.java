package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Employee;
import in.ineuron.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public String saveEmployeeDetails(Employee emp) {
		Integer id = repo.save(emp).getEid();
		if (id != null)
			return "Data Is saved with id " + id;
		else
			return "Data Insertion failed";
	}

}
