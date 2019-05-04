package com.xc.mail.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.xc.mail.entity.Dept;

@RestController
public class DeptController_Consumer {

	private static final String REST_URL_PREFIX="http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("consumer/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX+"add", dept, Boolean.class);
	}
	
	@RequestMapping("/findById/{id}")
	public Dept find(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX+"/findId/"+id, Dept.class);
	}
	
	
}
