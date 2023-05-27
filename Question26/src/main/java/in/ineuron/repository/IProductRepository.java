package in.ineuron.repository;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.model.Product;

public interface IProductRepository extends CrudRepository<Product, Integer> {

}
