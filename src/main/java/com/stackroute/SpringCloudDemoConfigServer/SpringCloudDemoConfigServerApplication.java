package com.stackroute.SpringCloudDemoConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudDemoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoConfigServerApplication.class, args);
	}
}
