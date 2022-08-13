package com.stipulate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.stipulate.SiteMeshFilter.MySitemeshFilter;

@SpringBootApplication
@ComponentScan(basePackages = {"com.stipulate"})
@EnableAutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Stipulate {
	public static void main(String[] args) {
		
		SpringApplication.run(Stipulate.class, args);
		
	}
//	@Bean
    FilterRegistrationBean<MySitemeshFilter> siteMeshFilter() {
        FilterRegistrationBean<MySitemeshFilter> filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MySitemeshFilter()); // adding sitemesh filter ??
        
        return filterRegistrationBean;
    }

}
