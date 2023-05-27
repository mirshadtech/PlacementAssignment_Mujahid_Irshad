package in.ineuron.dao;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

	public Admin findByMail(String mail);
}
