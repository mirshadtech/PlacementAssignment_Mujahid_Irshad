package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Customer;
import in.ineuron.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

	@Autowired
	private ICustomerService service;

	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		Customer cd = service.saveCustoemrData(customer);
		return new ResponseEntity<String>("Data is saved with id  " + cd.getId(), HttpStatus.OK);
	}
}
