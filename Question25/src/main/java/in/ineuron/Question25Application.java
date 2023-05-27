package in.ineuron;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.model.Employee;
import in.ineuron.service.IEmployeeService;

@SpringBootApplication
public class Question25Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = null;
		IEmployeeService service = null;
		Employee emp = null;
		Scanner scanner = null;
		try {
			context = SpringApplication.run(Question25Application.class, args);

			service = context.getBean(IEmployeeService.class);

			scanner = new Scanner(System.in);

			System.out.println("Enter Name");
			String name = scanner.nextLine();

			System.out.println("Enter Address");
			String address = scanner.nextLine();

			System.out.println("Enter Salary");
			String salary = scanner.nextLine();

			emp = new Employee();
			emp.setEname(name);
			emp.setAddress(address);
			emp.setSalary(Double.parseDouble(salary));

			System.out.println(service.saveEmployeeDetails(emp));
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
