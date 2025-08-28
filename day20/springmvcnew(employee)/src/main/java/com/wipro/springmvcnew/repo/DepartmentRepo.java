package com.wipro.springmvcnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springmvcnew.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
