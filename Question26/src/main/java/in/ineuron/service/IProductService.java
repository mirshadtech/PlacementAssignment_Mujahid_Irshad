package in.ineuron.service;

import in.ineuron.model.Product;

public interface IProductService {

	public String insertProductData(Product product);

	public Product fetchProductById(Integer pid);

	public String updateProductDetails(Product product);

	public String deleteProductById(Integer pid);
}
