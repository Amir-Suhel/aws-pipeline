package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.DemoData;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

	@GetMapping("/details")
	public DemoData getDetails() {
		return new DemoData(100, "Amir Suhel", "Roorkee", "India", "Full Stack Java & Angular");
	}

}
