package com.wipro.springmvcnew.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.springmvcnew.entity.Department;
import com.wipro.springmvcnew.repo.DepartmentRepo;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public void run(String... args) throws Exception {
        if (departmentRepo.count() == 0) {
            departmentRepo.save(new Department(null, "HR"));
            departmentRepo.save(new Department(null, "IT"));
            departmentRepo.save(new Department(null, "Finance"));
        }
    }
}
