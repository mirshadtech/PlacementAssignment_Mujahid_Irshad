package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.CustomerRepository;
import in.ineuron.exception.InsertionFailedException;
import in.ineuron.model.Customer;

@Service
public class ICustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer saveCustoemrData(Customer customer) {
		Customer customerData = repo.save(customer);
		if (customerData != null)
			return customerData;
		else
			throw new InsertionFailedException("insertion failed");
	}

}
