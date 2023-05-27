package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Product;
import in.ineuron.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private IProductService service;

	@PostMapping("/save")
	public ResponseEntity<?> saveProductDetails(@RequestBody Product product) {
		String status = service.insertProductData(product);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	@GetMapping("/find/{pid}")
	public ResponseEntity<?> findProduct(@PathVariable Integer pid) {
		Product product = service.fetchProductById(pid);
		return new ResponseEntity<Product>(product, HttpStatus.OK);

	}

	@PutMapping("/update")
	public ResponseEntity<?> updateProductData(@RequestBody Product product) {
		String status = service.updateProductDetails(product);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer pid) {
		String status = service.deleteProductById(pid);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

}
