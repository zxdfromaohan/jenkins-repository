package com.daily.daily.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJenkinsController {

	@GetMapping("/jk")
	public String testJenkins() {
		return "恭喜你，成功！";
	}
}
