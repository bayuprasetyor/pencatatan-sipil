package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.*", "com.example.*"})
public class PencatatanSipilApplication {

	public static void main(String[] args) {
		SpringApplication.run(PencatatanSipilApplication.class, args);
	}
}
