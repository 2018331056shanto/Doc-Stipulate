package com.stipulate;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.stipulate.SiteMeshFilter.MySitemeshFilter;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.stipulate")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableJpaRepositories
public class Configuration {

//	@Bean
    FilterRegistrationBean<MySitemeshFilter> siteMeshFilter() {
        FilterRegistrationBean<MySitemeshFilter> filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MySitemeshFilter()); // adding sitemesh filter ??
        
        return filterRegistrationBean;
    }

}
