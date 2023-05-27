package in.ineuron.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.exception.ProductNotFound;
import in.ineuron.model.Product;
import in.ineuron.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository repo;

	@Override
	public String insertProductData(Product product) {

		Integer pid = repo.save(product).getPid();
		if (pid != null)
			return "Product Data is saved with id " + pid;
		else
			return "Product insertion failed";
	}

	@Override
	public Product fetchProductById(Integer pid) {
		Optional<Product> product = repo.findById(pid);
		if (product.isPresent())
			return product.get();
		else
			throw new ProductNotFound("Product Data is not found with this id " + pid);
	}

	@Override
	public String updateProductDetails(Product product) {

		Optional<Product> pro = repo.findById(product.getPid());
		if (pro.isPresent()) {
			Product updatedPro = repo.save(product);
			return "Product Details are updated with id " + updatedPro.getPid();
		}

		else
			throw new ProductNotFound("Product Data is not found with this id " + product.getPid());
	}

	@Override
	public String deleteProductById(Integer pid) {
		Optional<Product> product = repo.findById(pid);
		if (product.isPresent()) {
			repo.deleteById(pid);
			return "Product is Deleted with id" + pid;
		} else
			throw new ProductNotFound("Product Data is not found with this id " + pid);
	}

}
