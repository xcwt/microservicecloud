package com.xc.mail.springcloud.service;

import java.util.List;

import com.xc.mail.entity.Dept;

public interface DeptService {

	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
