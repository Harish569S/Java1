package com.mindtree.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
