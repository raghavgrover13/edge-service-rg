package com.springcloud.edgeservice.rg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class EdgeServiceRgApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceRgApplication.class, args);
	}

}
