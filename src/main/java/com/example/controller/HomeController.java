// Nama File	: HomeController.java
// NIM			: 11S15023
// Kelas		: 14TI1

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}

}
