package com.wipro.springmvcnew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springmvcnew.entity.Department;
import com.wipro.springmvcnew.entity.Employee;
import com.wipro.springmvcnew.repo.DepartmentRepo;
import com.wipro.springmvcnew.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService service;
    
    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping
    public List<Employee> getAll(@RequestParam(value="q", required=false) String q) {
        return service.searchByName(q);
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return service.getById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"));
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        mapDepartment(employee);
        return service.create(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        mapDepartment(employee);
        return service.update(id, employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    private void mapDepartment(Employee employee) {
        if (employee.getDepartment() != null && employee.getDepartment().getId() != null) {
            Department dept = departmentRepo.findById(employee.getDepartment().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Invalid Department ID"));
            employee.setDepartment(dept);
        } else {
            employee.setDepartment(null);
        }
    }

}

