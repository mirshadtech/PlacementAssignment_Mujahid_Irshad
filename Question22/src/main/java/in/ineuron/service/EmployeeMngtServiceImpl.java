package in.ineuron.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Employe;
import in.ineuron.repo.EmployeeRepo;

@Service
public class EmployeeMngtServiceImpl implements IEmployeeMngtService {

	@Autowired
	private EmployeeRepo emprepo;

	@Override
	public String insertEmployeeDetails(Employe employee) {
		Integer id = emprepo.save(employee).getId();
		if (id != null)
			return "Data is saved with id " + id;
		else
			return "Data Insertion failed";
	}

	@Override
	public Employe fetchEmpoyeeDetailsById(Integer id) {
		Optional<Employe> res = emprepo.findById(id);
		if (res.isPresent())
			return res.get();
		else
			throw new IllegalArgumentException("Please enter valid id");
	}

}
