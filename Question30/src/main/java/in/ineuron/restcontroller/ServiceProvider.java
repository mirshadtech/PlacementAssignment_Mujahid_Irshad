package in.ineuron.restcontroller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import in.ineuron.model.Product;

@RestController
@RequestMapping("/product")
public class ServiceProvider {

	@GetMapping("/find/{id}")
	@HystrixCommand(fallbackMethod = "callFallBackMethod")
	public ResponseEntity<?> getProductDetails(@PathVariable Integer id) {

		Product product = new Product();
		product.setId(id);
		product.setName("FASTRACK");
		product.setPrice(8000.36);
		product.setQty(2);

		// Creating a exception i.e., considering there is a delay in the response from the DATABASE
		if (new Random().nextInt(10) < 10) {
			throw new RuntimeException("Exception is due delay in response from DataBase");
		}

		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	public String callFallBackMethod() {

		return "DUE TO SOME INTERNAL ISSUE THE RESPONSE GOT DELAYED PLEASE TRY AGAIN";
	}

}
