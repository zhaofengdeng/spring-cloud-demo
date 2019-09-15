package com.project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	//https://blog.csdn.net/qq_36758630/article/details/80986902
	public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
