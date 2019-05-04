package com.xc.mail.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xc.mail.entity.Dept;
import com.xc.mail.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/addDept",method=RequestMethod.POST)
	public boolean addDept(Dept dept) {
	return deptService.addDept(dept);
	}

	@RequestMapping(value="/findId/{id}",method=RequestMethod.GET)
	public Dept findById(@PathVariable("id")Long id) {
		return deptService.findById(id);
	}

	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Dept> findAll() {
		return deptService.findAll();
	}
}
