package com.wipro.springmvcnew.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.springmvcnew.entity.Employee;
import com.wipro.springmvcnew.repo.EmployeeRepo;
import com.wipro.springmvcnew.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public Employee create(Employee e) {
        return repo.save(e);
    }

    @Override
    public Optional<Employee> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Employee> searchByName(String name) {
        return (name == null || name.isBlank())
                ? repo.findAll()
                : repo.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Employee update(Long id, Employee e) {
        Employee existing = repo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Employee not found"));
        existing.setName(e.getName());
        existing.setEmail(e.getEmail());
        existing.setType(e.getType());
        existing.setAddress(e.getAddress());
        existing.setDepartment(e.getDepartment());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
