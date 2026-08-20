package sn.edu.isepat.isep_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class IsepConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsepConfigServerApplication.class, args);
	}

}
