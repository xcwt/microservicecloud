package com.xc.mail.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xc.mail.entity.Dept;
import com.xc.mail.springcloud.dao.DeptDao;
import com.xc.mail.springcloud.service.DeptService;
@Service
@Transactional
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao dd;
	
	@Override
	public boolean addDept(Dept dept) {
	return dd.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		return dd.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		return dd.findAll();
	}

}
