package com.everelegance.dubbopro;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.everelegance.dubbopro.serviceImpl")
public class DubboProApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProApplication.class, args);
	}

}
