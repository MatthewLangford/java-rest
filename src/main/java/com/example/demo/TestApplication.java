package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	@Autowired
	public requests requests;
	
	@GetMapping("/api/{routNum}/{acctNum}")
	public Map<String, Object> getList(@PathVariable("routNum") String routingNumber, @PathVariable("acctNum") String accountNumber){
		System.out.println(routingNumber);
		System.out.println(accountNumber);
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("list", requests.search(routingNumber, accountNumber));
		return model;
	}
}
