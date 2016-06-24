package mtg.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MtgEurekaApplication {

	public static void main(String[] args) {
		new SpringApplication(MtgEurekaApplication.class).run();
	}
}
