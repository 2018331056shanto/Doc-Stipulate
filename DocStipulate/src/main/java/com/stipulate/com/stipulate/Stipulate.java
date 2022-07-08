package com.stipulate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = {"com.stipulate"})
@EnableAutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Stipulate {
	public static void main(String[] args) {
		
		SpringApplication.run(Stipulate.class, args);
		
	}

}
