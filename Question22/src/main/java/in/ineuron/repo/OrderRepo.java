package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.OrderData;

public interface OrderRepo extends JpaRepository<OrderData, Integer> {

}
