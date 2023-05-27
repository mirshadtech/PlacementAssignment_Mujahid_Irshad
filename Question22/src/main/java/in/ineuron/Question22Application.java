package in.ineuron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.model.Employe;
import in.ineuron.model.OrderData;
import in.ineuron.service.IEmployeeMngtService;

@SpringBootApplication
public class Question22Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = null;
		Scanner scanner = null;
		try {
			context = SpringApplication.run(Question22Application.class, args);

			IEmployeeMngtService service = context.getBean(IEmployeeMngtService.class);

			Employe employee = new Employe();

			employee.setName("sachin");
			employee.setAddress("MI");

			OrderData order1 = new OrderData();
			OrderData order2 = new OrderData();

			order1.setOrderdescription("Fastack watch");
			order1.setPrice(8522.00);
			order1.setEmp(employee);

			order2.setEmp(employee);
			order2.setOrderdescription("Apple watch");
			order2.setPrice(50000.00);

			List<OrderData> orders = new ArrayList<OrderData>();

			orders.add(order1);
			orders.add(order2);
			employee.setOrder(orders);

			String status = service.insertEmployeeDetails(employee);
			System.out.println(status);

			scanner = new Scanner(System.in);
			System.out.println("Enter employe id");
			Integer id = scanner.nextInt();

			// Fetching the details and displaying
			Employe result = service.fetchEmpoyeeDetailsById(id);
			System.out.println(result.getName());
			System.out.println(result.getAddress());
			result.getOrder().forEach(order -> {
				System.out.println(order);
			});
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();

		}

	}

}
