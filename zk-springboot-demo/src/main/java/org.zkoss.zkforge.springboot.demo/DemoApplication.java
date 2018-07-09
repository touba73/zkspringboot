package org.zkoss.zkforge.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}
	@GetMapping("/demo")
	public String demo() {
		return "demo";
	}
}