package in.ineuron.repo;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
