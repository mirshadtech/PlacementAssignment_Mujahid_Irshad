package in.ineuron.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Product;
import in.ineuron.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private IProductService service;

	@GetMapping("/find")
	public ResponseEntity<?> findProducts() {
		List<Product> products = service.fetchAllProduct();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);

	}

}
