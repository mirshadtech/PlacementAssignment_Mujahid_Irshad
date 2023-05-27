package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ProductServiceImpl;

@SpringBootApplication
public class Question28ConfigClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Question28ConfigClientApplication.class, args);

		ProductServiceImpl service = context.getBean(ProductServiceImpl.class);
		service.fetchAllProduct().forEach(System.out::println);
	}

}
