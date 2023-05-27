package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.Employe;

public interface EmployeeRepo extends JpaRepository<Employe, Integer>{
	
}