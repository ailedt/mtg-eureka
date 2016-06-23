package mtg.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.system.ApplicationPidFileWriter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MtgEurekaApplication {

	public static void main(String[] args) {
		SpringApplication eurekaServer = new SpringApplication(MtgEurekaApplication.class);
		eurekaServer.addListeners(new ApplicationPidFileWriter("eureka-server.pid"));
		eurekaServer.run();
	}
}
