package com.mindtree.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mindtree.department.entity.Department;
import com.mindtree.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/new")
	public String hello() {
		return "Hello im department";
	}
	
	@GetMapping
	public String hello1() {
		return restTemplate.getForObject("http://EMPLOYEE-SERVICE/employee/new", String.class);
	}
	
	@PostMapping
	public Department  addDepartment(@RequestBody  Department dep) {
		return departmentService.addDep(dep);
	}
	
	
	
}
