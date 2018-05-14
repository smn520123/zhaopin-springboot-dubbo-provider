package com.four;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan(value = "com.four.mapper")
@ImportResource("classpath:spring-dubbo-provider.xml")
public class ZhaopinSpringbootDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhaopinSpringbootDubboProviderApplication.class, args);
	}
}
