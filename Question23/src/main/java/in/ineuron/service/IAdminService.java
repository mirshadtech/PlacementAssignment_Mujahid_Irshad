package in.ineuron.service;

import in.ineuron.model.Admin;

public interface IAdminService {

	public String saveAdminData(Admin admin);

	public Admin fetchAdminByMail(String mail);

}
