package com.mindtree.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.department.entity.Department;
import com.mindtree.department.repository.DepartmentRepository;

@Service
public class DepartmentService {


	@Autowired
	DepartmentRepository departmentRepository;
	
	public Department addDep(Department dep) {
		return departmentRepository.save(dep);
		
	}
}
