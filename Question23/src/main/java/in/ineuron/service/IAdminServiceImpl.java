package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.AdminRepository;
import in.ineuron.model.Admin;

@Service
public class IAdminServiceImpl implements IAdminService {

	@Autowired
	private AdminRepository repo;

	@Override
	public String saveAdminData(Admin admin) {
		Admin ad = repo.save(admin);

		return ad != null ? "Admin Data is saved with id " + ad.getId() : "Admin Data Insertion failed";
	}

	@Override
	public Admin fetchAdminByMail(String mail) {

		return repo.findByMail(mail);

	}

}
