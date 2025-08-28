package com.wipro.springmvcnew.service;

import java.util.List;
import java.util.Optional;
import com.wipro.springmvcnew.entity.Employee;

public interface EmployeeService {
    Employee create(Employee e);
    Optional<Employee> getById(Long id);
    List<Employee> getAll();
    List<Employee> searchByName(String name);
    Employee update(Long id, Employee e);
    void delete(Long id);
}
