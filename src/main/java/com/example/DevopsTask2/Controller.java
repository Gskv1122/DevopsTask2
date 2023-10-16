package com.example.DevopsTask2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(value="/get")
	public String gets() {
		return "Never Give Up Work hard";
	}

}
