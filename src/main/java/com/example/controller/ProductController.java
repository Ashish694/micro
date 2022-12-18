package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/list")
	public List<String> getList() {
		List<String> list=new ArrayList();
		list.add("mobile");
		list.add("laptop");
		return list;
	}

}
