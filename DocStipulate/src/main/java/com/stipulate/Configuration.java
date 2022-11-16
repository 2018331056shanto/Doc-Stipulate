package com.stipulate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.stipulate")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableJpaRepositories
public class Configuration {



}
