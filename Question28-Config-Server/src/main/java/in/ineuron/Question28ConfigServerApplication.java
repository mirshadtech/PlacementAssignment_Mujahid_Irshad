package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Question28ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Question28ConfigServerApplication.class, args);
	}

}
