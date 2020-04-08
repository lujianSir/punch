package com.bwsk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bwsk.mapper") // 扫描的mapper
@SpringBootApplication
public class PunchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PunchApplication.class, args);
	}

}
